package practico_2;

/* Escribir un programa que dado un valor ingresado por el
usuario menor que 10 y mayor a 1, muestre por pantalla una
cuenta regresiva de números desde dicho valor hasta el 0
inclusive. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_17 {

	public static void main(String[] args) {
		
		int num = 2;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		while(num > 1 && num < 10){
			try{
				
				System.out.println("ingrese un numero : ");
				num = Integer.valueOf(entrada.readLine());
				System.out.println("cuenta regresiva de : " + num);
				
				for(int i = num ; i >= 0 ; i--){
					System.out.println(i);
				}	
			}
			
			catch(Exception exc){
				System.out.println("ERROR!!!!");
			}
		}
		
	}

}
