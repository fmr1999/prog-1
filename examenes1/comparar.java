package examenes1;

public class comparar {
	final static int MAXFILAS= 2;
	final static int MAXCOLUMNAS = 5;
	final static int MAX = 2;
	public static void main(String[] args) {
		int [][] matEntero = {	{0,3,3,3,0},
								{0,3,6,3,0}};

		int [] arrentero = {2,6};
		buscarNumerosMatriz(matEntero,arrentero);
		
	}	
	 public static void buscarNumerosMatriz(int[][]matEntero , int []arrentero){
            for (int filas = 0; filas < MAXFILAS; filas++) {
            	int inicio =
            	 if(sonIguales(matEntero[filas],arrentero)){
            		 System.out.println("existe los numeros del arreglo en las secuencias de la matriz");
            	 }
            	 else{
            		 System.out.println("No existe los numeros del arreglo en las secuencias de la matriz");
            	 }
            } 
    }		




    public static boolean sonIguales( int [] matArr , int [] arr){
    	 for (int columnas = 0; columnas < MAXCOLUMNAS; columnas++) {
    		 for (int pos = 0; pos < MAX; pos++) {
    	            if (matArr[columnas] == arr[pos]) {
    	            	return true;
    	            } 
    	        }
         }
    	 return false;
   
    }
	
	public static int obtenerInicio(int [] arrMat, int ini){
		while(ini<MAXCOLUMNAS && arrMat[ini] == 0){
			ini++;
		}
		return ini;
	}
	
	public static int obtenerFin(int [] arrMat, int ini) {
		int fin = ini;
		
		while(fin<MAXCOLUMNAS && arrMat[fin] != 0){
			fin++;
		}
		return fin - 1;
	}
}
