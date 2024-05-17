/* Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
de valores entre 1 y 12. Luego mostrar cómo quedó cargado. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class ejercicio_1 {

	final static int MAX = 2;
	public static void main(String[] args) {
		
		int []  arrenteros = new int [MAX];
		
		cargarArreglo(arrenteros);
		mostrarArreglo(arrenteros);
	}
	
	
	
	public static void cargarArreglo(int[] arr){
		int num;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		for(int pos = 0 ; pos<MAX; pos++){
			try{
				System.out.println("ingresar un numero entre 1 y 12 : ");
				 num = Integer.valueOf(entrada.readLine());
				 if(num>=1 && num<=12){
					arr[pos] = num;
				 }
				 else{
					 System.out.println("no se puede ingresar numeros que no"
					 		+ " esten entre 1 y 12");
					 pos--;
				 }
			}
			catch(Exception exc){
				System.out.println("ERROR!!!");
			}
		}

		
	}
	
	public static void mostrarArreglo(int [] arr){
		for(int pos = 0 ;pos<MAX ; pos++){
			System.out.print("["+arr[pos]+"]");
		}
	}
}



/*  OTRA OPCION
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_3 {
	
	final static int MAX= 15;

	public static void main(String[] args) {
		
		int[] arrenteros= new int[MAX];
		
		int num;
		num = cargarArregloTeclado(arrenteros);
		imprimirArreglo(arrenteros);
		
		
	}
	
	public static int cargarArregloTeclado(int [] arr){
		
		int entero = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			
			for(int pos = 0; pos<MAX; pos++ ){
				System.out.println("ingresar un numero entero entre 1 y 12");
				entero = Integer.valueOf(entrada.readLine());
				if(entero>=1 && entero<=12){
					arr[pos] = entero;
				}
				else{
					System.out.println("error, ingresar un numero entre 1 y 12");
					pos--;
				}
			} 
		}
		catch(Exception exc){
			System.out.println("error");
		}
		return entero;
	}
	
	public static void imprimirArreglo(int []arr){
		
		for(int pos = 0; pos<MAX; pos++){
			System.out.print("[" + arr[pos] + "]");
		}
	}

}
 */