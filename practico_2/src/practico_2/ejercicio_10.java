package practico_2;

/* Escribir un programa que mientras que el usuario ingrese un
número entero entre 1 y 10 inclusive, lleve la suma de los
números ingresados. Finalmente, cuando sale del ciclo muestre
por pantalla el resultado de la suma. ¿En qué casos termina? */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ejercicio_10 {

	public static void main(String[] args) {
		
		int num = 1;
		int aux = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		while(num!=0){
			try{
				
				System.out.println("ingresar un numero entre 1 y 10 inclusive : ");
				num = Integer.valueOf(entrada.readLine());
				if(num >= 1 && num <= 10){
					aux = aux + num;
					System.out.println(aux);
				}
				else{
					System.out.println("numero fuera de rango");
					num = Integer.valueOf(entrada.readLine());
				}
			}
			catch(Exception exc){
				System.out.println("ERROR");
			}
		}
			
	}

}
