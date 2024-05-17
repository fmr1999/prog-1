/* Dado un arreglo de caracteres, determinar si en el arreglo existe al
menos una letra repetida. */

public class ejercicio_9 {

	final static int MAX = 10;
	public static void main(String[] args) {
		char [] arrenteros = {'a','b','c','c','v','k','n','u','o','p'};
		int hola = 0;
		mostrarArreglo(arrenteros);
		hola = letraRepetidaArreglo(arrenteros);
		System.out.print("\n" + "la cantidad de letras repetidas son : " + hola);
		
	}

	
	public static int letraRepetidaArreglo(char [] arr){
		int contador = 0;
		for(int pos = 0; pos<MAX-1; pos++){
			if(arr[pos]==arr[pos+1]){
				contador++;
			}
		}
		return contador;
	}
	
	public static void mostrarArreglo(char [] arr){
		for(int pos = 0; pos<MAX; pos++){
			System.out.print("[" + arr[pos] + "]");
		}
	}
	
	
	
}
