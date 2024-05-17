/* Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, obtenga la cantidad de números pares
que tiene y la imprima. */


public class ejercicio_6 {

	final static int MAX = 10;
	
	public static void main(String[] args) {
		int [] arrenteros = {1,2,3,4,5,6,7,8,9,10};
		imprimirArreglo(arrenteros);
		obtenerParesArreglo(arrenteros);
	}
	
	public static void obtenerParesArreglo(int [] arr){
		int contador = 0;
		for(int pos = 0; pos<MAX; pos++){
			if(arr[pos] % 2 == 0){
				contador++;
			}
		}
		System.out.println("\n" + "cantidad de pares en el arreglo : " + contador);
	}
	
	public static void imprimirArreglo(int [] arr){
		for(int pos = 0; pos<MAX; pos++){
			System.out.print("[" + arr[pos] + "]");
		}
	}
}
