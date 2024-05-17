package practico_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Pedir por consola un n�mero entero e informar si es un n�mero
primo. Un n�mero es primo si solo es divisible por 1 y por s�
mismo. */

public class ejercicio_21 {

	public static void main(String[] args) {
		
		int num;
		boolean continuar = true;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
		
		
		while(continuar){
			
			try{
				System.out.println("ingresar un numero : ");
				num = Integer.valueOf(entrada.readLine());
				
				  boolean esPrimo = true;

                  // Verificar si num es primo
                  for (int i = 2; i < num; i++) {
                      if (num % i == 0) {
                          esPrimo = false; // Si es divisible por alg�n n�mero diferente de 1 y s� mismo, no es primo
                          break; // Salir del bucle tan pronto como se determine que no es primo
                      }
                  }

                  if (esPrimo) {
                      System.out.println(num + " es un n�mero primo.");
                  } else {
                      System.out.println(num + " no es un n�mero primo.");
                  }
			}
			catch(Exception exc){
				System.out.println("ERROR!!");
			}
			
			
		}
		
	}

}
