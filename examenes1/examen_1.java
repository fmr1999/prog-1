package examenes1;

/* Se tiene una matriz de enteros de tamanio 2*13
 * de secuencias de numeros entre 1 y 9 (por cada fila), separadas por 0. 
La matriz esta precargada, y ademas cada fila empieza y termina con uno o
 mas separadores 0. Se pide realizar un programa que:
_elimine de cada fila todas las secuencias, 
reemplazando cada secuencia por lo que suma de su contenido. 
 */

public class examen_1 {

	final static int MAXFILAS = 2;
	final static int MAXCOLUMNAS = 13;
	public static void main(String[] args) {
		int[][] matEntero = {	{0,2,2,2,2,0,3,3,3,0,4,4,0},
								{0,5,5,5,5,0,6,6,6,0,7,7,0}};
		
		for(int filas = 0; filas<MAXFILAS;filas++){
			int inicio = 0;
			int fin = -1;
			int sumaSecMatriz = 0;
			
			while(inicio<MAXCOLUMNAS){
				inicio = ObtenerInicio(matEntero[filas],fin+1);
				if(inicio<MAXCOLUMNAS){
					fin = ObtenerFin(matEntero[filas],inicio);
					sumaSecMatriz = SumaSec(matEntero[filas],inicio,fin);
					EliminarSec(matEntero[filas],inicio,fin);
					InsertarSuma(matEntero[filas] , inicio , fin , sumaSecMatriz);
					
				}
				fin = inicio ;
			}
		}
		imprimirMatriz(matEntero);
		
	}
	
	
	public static void InsertarSuma(int [] arrMat,int ini , int fin , int suma){
		for(int pos = MAXCOLUMNAS-1; pos > ini; pos--){
			arrMat[pos] = arrMat[pos - 1];
		}
		 arrMat[ini] = suma;
	}
	
	public static void EliminarSec(int [] arrMat, int ini , int fin){
		for(int pos = ini; pos<=fin;pos++){
			CorrimientoIzq(arrMat,ini);
		}
	}
	
	
	public static void CorrimientoIzq(int [] arrMat, int ini){
		for(int pos = ini; pos<MAXCOLUMNAS-1;pos++){
			arrMat[pos] = arrMat[pos+1];
		}
	}
	
	public static int SumaSec(int [] arrMat,int ini, int fin){
		int suma = 0;
		for(int pos = ini; pos<=fin;pos++){
			suma += arrMat[pos];
		}
		return suma;
	}
	
	
	public static int ObtenerInicio(int [] arrMat, int ini) {
		while(ini<MAXCOLUMNAS && arrMat[ini] == 0){
			ini++;
		}
		return ini;
	}
	
	
	public static int ObtenerFin(int [] arrMat, int ini) {
		int fin = ini;
		while(fin<MAXCOLUMNAS && arrMat[fin] != 0){
			fin++;
		}
		return fin - 1;
	}
	
	public static void imprimirMatriz(int[][] mat) {
        for (int i = 0; i < MAXFILAS; i++) {
            for (int j = 0; j < MAXCOLUMNAS; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
	
	
	
}
