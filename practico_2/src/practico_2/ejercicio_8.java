package practico_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/* Escribir un programa que mientras que el usuario ingrese un
número entero distinto de 0, pida ingresar otro número entero y lo
imprima. */

public class ejercicio_8 {

	public static void main(String[] args) {
		
		int num = -1;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));

		while(num!= 0){
			
			try{
				System.out.println("ingrese un numero : ");
				num = Integer.valueOf(entrada.readLine());
				if(num!=0){
					System.out.println("ingrese otro numero : ");
					num = Integer.valueOf(entrada.readLine());
					System.out.println(num);
				}
				else{
					System.out.println("el numero tiene que ser distinto de 0(ingrese 1 para volver a comenzar)");
					num = Integer.valueOf(entrada.readLine());
				}
				
			}
			catch(Exception exc){
				System.out.println("Error!");
			}
			
		}
		
		
	}

}
