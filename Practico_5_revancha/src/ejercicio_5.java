/* Hacer un programa que dado un arreglo de caracteres de tamaño
MAX que se encuentra cargado, invierta el orden del contenido. */

import java.util.Random;

public class ejercicio_5 {

	final static int MAX = 4;
	
	public static void main(String[] args) {
		char [] arrenteros = {'h', 'o', 'l', 'a'};

		invertirArreglo(arrenteros);
		imprimir_arreglo_char(arrenteros);
	}
	
	
	public static void invertirArreglo(char [] arr){
		char aux;
		for(int pos = 0; pos<MAX/2; pos++){
			  aux = arr[MAX -  1 - pos];
	          arr[MAX -  1 - pos] = arr [pos];
	          arr[pos] = aux; 
		}
	}
	
	public static void imprimir_arreglo_char(char [] arr){
		for (int pos = 0; pos < MAX; pos++){
		System.out.print("[" + arr[pos] + "]");
		}
	}
	
}
