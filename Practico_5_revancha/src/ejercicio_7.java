import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Hacer un programa que dado un arreglo de enteros y un número
N, genere un arreglo con las posiciones donde se encuentra dicho
número. A continuación, multiplicar por un número M todas las
ocurrencias del número N en el arreglo original. */ 

public class ejercicio_7 {

	final static int MAX = 10;
	public static void main(String[] args) {
		int [] arrenteros = {2,0,0,2,2,3,4,5,6,10};
		imprimirArreglo(arrenteros);
		numeroNingresado(arrenteros);
		
	}
	
	public static void imprimirArreglo(int [] arr){
		for(int pos = 0; pos<MAX; pos++){
			System.out.print("[" + arr[pos] + "]");
		}
	}
	
	public static void numeroNingresado(int [] arr){
		int N = 2;
		int M = 5;
		int numero = 0;
		int posicion = 0;
		int contador = 0;
		for(int pos = 0 ; pos<MAX; pos++){
			if(N == arr[pos]){
				contador++;
				numero = N;
				posicion = pos;
				System.out.println("\n" +  "pos ->"+ posicion + "[" +numero + "]");
			System.out.println("el resultado de la multiplicacion es : " + (contador * M));
			}
		}
	}
	
	
}
