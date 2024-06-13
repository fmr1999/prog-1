package examenes1;

public class recuperatorio_2023_facu {
	final static int MAXFILAS = 7;
	final static int MAXCOLUMNAS = 20;
	final static int MAX = 7;
	public static void main(String[] args) {
		int[][] matEntero = { 
			    {0, 300, 298, 298, 297, 0, 240, 233, 245, 240, 0, 257, 254, 254, 0, 234, 230, 222, 0, 0},
			    {0, 310, 302, 284, 271, 0, 280, 263, 263, 0, 0, 0, 264, 264, 0, 234, 230, 0, 0, 0},
			    {0, 310, 302, 294, 0, 0, 250, 243, 0, 245, 0, 257, 255, 253, 0, 234, 229, 0, 0, 0},
			    {0, 315, 320, 395, 398, 0, 351, 333, 353, 0, 0, 0, 334, 354, 0, 454, 490, 499, 0, 0},
			    {0, 410, 400, 397, 0, 0, 250, 243, 0, 0, 0, 257, 255, 253, 0, 234, 229, 220, 0, 0},
			    {0, 0, 420, 430, 430, 450, 420, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			    {0, 415, 425, 435, 420, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
			};

		int [] arrEntero = {1,2,5,0,0,0,0};
		
		
		for(int filas = 0 ; filas<MAXFILAS;filas ++){
			int inicio = 0;
			int fin = -1;
			int dias = 0;
			boolean Prog = true;
			while(inicio<MAXCOLUMNAS){
				inicio = obtenerInicio(matEntero[filas],fin + 1);
				if(inicio<MAXCOLUMNAS){
					fin = obtenerFin(matEntero[filas],inicio);
					dias++;
					if (Coinciden(arrEntero,dias) && entrenamientoProgresivo(matEntero[filas],inicio,fin)){
						eliminarDiaCumplido(arrEntero , dias);
					}
					
				}
				
			}
			
		}	
		imprimir_arreglo(arrEntero);
	}
	
	public static boolean Coinciden(int [] arr , int dias){
		int inicioS = 0;
		for(int pos = inicioS; pos<MAX; pos++){
			if(dias != 0 && arr[pos] == dias){
				return true;
			}
		}
		return false;
	}
	
	public static boolean entrenamientoProgresivo(int [] matArr, int ini , int fin){
		for (int i = ini; i <= fin; i++) {
            if (matArr[i] < matArr[i + 1]) {
                return false;
            }
        }
        return true;
	}
	
	
	public static void eliminarDiaCumplido(int [] arr, int dias ){
		for(int pos = dias; pos<MAX-1;pos++){
			arr[pos] = arr[pos+1];
		}
	}
	
	public static int obtenerInicio(int [] matArr , int ini){
		while(ini<MAXCOLUMNAS && matArr[ini] == 0){
			ini++;
		}
		return ini;
	}
	
	public static int obtenerFin(int [] matArr , int ini){
		int fin = ini;
		while(fin<MAXCOLUMNAS && matArr[fin] != 0){
			fin++;
		}
		return fin - 1;
	}
	
	  public static void imprimir_arreglo(int [] arr) {
	        for (int pos = 0; pos < MAX; pos++) {
	            System.out.print("[" + arr[pos] + "]");
	        }
	        System.out.println("");
	    }
}