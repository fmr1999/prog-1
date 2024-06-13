package examenes1;

public class parcial_facu1 {

	final static int MAXCOLUMNAS = 13;
	final static int MAXFILAS = 2;
	final static int MAX = 3;
	public static void main(String[] args) {
		int[][] matEntero = {{0,2,3,4,8,0,2,2,2,0,4,4,0},
							{0,8,8,4,5,0,3,1,1,0,7,7,0}};

		int [] arr = {0,1,0};
		
		boolean encontrado = false;
		for(int filas = 0; filas<MAXFILAS;filas++){
			int inicio = 0;
			int fin = -1;
			int sumaSecMatriz = 0;
			while(inicio<MAXCOLUMNAS){
				inicio = Pos_inicio(matEntero[filas],fin + 1);
				if(inicio<MAXCOLUMNAS){
					fin = Pos_fin(matEntero[filas],inicio);
					sumaSecMatriz = SumaNumerosSec(matEntero[filas],inicio,fin);
					if(Coinciden(arr,sumaSecMatriz)){
						  encontrado = true;
						  break;
					}
					
				}
			}
			if (encontrado) {
                break;
            }
		}
	    if (encontrado) {
            System.out.println("Existe un resultado de una suma en la matriz igual al valor del arreglo");
        } else {
            System.out.println("No existe ningun resultado de una suma igual al valor del arreglo");
        }
    
		
	}
	
	public static boolean Coinciden(int []arr, int suma){
		int iniA = 0;
		int finA = -1;
		iniA = Pos_inicio(arr,finA + 1);
		if(iniA<MAX){
			finA =  Pos_fin(arr,iniA);
			if(arr[iniA] == suma){
				return true;
			}
		}
		return false;
	}
	/* CHEQUAR SI RECORRE TODO EL ARREGLO PARA COMPARAR LA SUMA DE SECUENCIAS DE LA MATRIZ */
	
	public static int SumaNumerosSec(int [] mat , int ini, int fin){
		int suma = 0;
		for(int pos = ini; pos<=fin ; pos++){
			suma += mat[pos];
		}
		return suma;
	}
	
	
	public static int Pos_inicio(int [] mat , int ini){
		while(ini<MAXCOLUMNAS && mat[ini] == 0){
			ini++;
		}
		return ini;
	}
	
	public static int Pos_fin(int [] mat , int ini){
		int fin = ini;
		while(fin<MAXCOLUMNAS && mat[fin] != 0){
			fin++;
		}
		return fin - 1;
	}
	

}
