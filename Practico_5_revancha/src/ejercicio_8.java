/* Hacer un programa que determine si los valores almacenados en
un arreglo de enteros se encuentran en orden ascendente. */


public class ejercicio_8 {

	final static int MAX = 8;
	
	public static void main(String[] args) {
		int [] arrenteros = {8,2,3,4,5,6,7,8};
		imprimirArreglo(arrenteros);
		ordenAscendenteArreglo(arrenteros);

	}
	
	public static void ordenAscendenteArreglo(int [] arr){
		int aux;
		for(int pos = 0; pos<MAX -1 ; pos++){
			 if(arr[pos]<=arr[pos+1]){
				 System.out.println("ascendente");
			 }
			 else{
				 System.out.println("descendente");
			 }
		}
		
	}
	
	public static void imprimirArreglo(int [] arr){
		for(int pos = 0; pos<MAX; pos++){
			System.out.print("[" + arr[pos] + "]");
		}
	}

}
