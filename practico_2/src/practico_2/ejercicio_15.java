package practico_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*Pedir por consola el ingreso de números enteros. Cuando se
ingrese un 0 se debe terminar el programa informando el
promedio de los números ingresados, cuál fue el mayor número y
cuál fue el menor número. */

public class ejercicio_15 {
	
	public static void main(String[] args) {
		
		int num = -1;
		int suma = 0;
		int mayor = 0;
		int menor = 0;
		int contador = 0;
		
		
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		while(num!=0){
			try{
				System.out.println("ingrese un numero :");
				num = Integer.valueOf(entrada.readLine());
				if(num!=0){
					suma += num;
					contador++;
					if(num > mayor){
						mayor = num;
					}
					if( num != 0 || num >= menor){
						menor = num;
					}
				}
				else{
					System.out.println("el promedio es : " + (double) suma / contador);
					System.out.println("el mayor numero ingresado es : " + mayor);
					System.out.println("el menor numero ingresado es : " + menor);
				}
				
			}
			catch(Exception exc){
				
			}
		}
		
	}

}
