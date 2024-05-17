package practico_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Pedir por consola el ingreso de 10 números enteros positivos.
Contar cuántas veces se ingresaron números pares y mostrarlo
por pantalla. */

public class ejercicio_14 {

	public static void main(String[] args) {
		
		int num = -1;
		int contador = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		while(num!=0){
			try{
				for(int i = 1; i<=10 ; i++){
					System.out.println("ingrese 10 numeros enteros : ");
					num = Integer.valueOf(entrada.readLine());
					if(num>0){
						if(num % 2 == 0){
							contador++;
							System.out.println("la cantidad de numeros pares son : " + contador);
						}
					}
					else{
						System.out.println("ERROR, SOLO SE ACEPTAN NUMEROS ENTEROS POSITIVOS");
					}
				}
				break;
			}
			catch(Exception exc){
				System.out.println("ERROR");
			}
			
			
		}
	}

}
