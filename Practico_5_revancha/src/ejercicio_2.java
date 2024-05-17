/*Hacer un programa que dado un arreglo ya cargado con 10
enteros, calcule el promedio y lo muestre por la consola.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_2 {
	
	final static int MAX= 3;

	public static void main(String[] args) {
		
		int[] arrenteros= new int[MAX];
		
		int num = 0;
		double promedio = 0;
		
		num = cargarArregloTeclado(arrenteros);
		imprimirArreglo(arrenteros);
		promedio = promedioArreglo(arrenteros);
		
	}
	
	public static int cargarArregloTeclado(int [] arr){
		
		int entero = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			
			for(int pos = 0; pos<MAX; pos++ ){
				System.out.println("ingresar un numero entero");
				entero = Integer.valueOf(entrada.readLine());
				arr[pos] = entero;
			} 
		}
		catch(Exception exc){
			System.out.println("error");
		}
		return entero;
	}
	
	public static double promedioArreglo(int [] arr){
		int resultado = 0;
		int promedio = 0;
		for(int pos = 0; pos<MAX; pos++){
			resultado += arr[pos];
			promedio = resultado / MAX;
		}		
		System.out.println("el promedio es: "+ promedio);
		return promedio;
	}
	
	public static void imprimirArreglo(int []arr){
		for(int pos = 0; pos<MAX; pos++){
			System.out.print("[" + arr[pos] + "]");
		}
	}

}
