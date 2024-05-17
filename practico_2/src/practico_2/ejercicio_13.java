package practico_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Escribir un programa que mientras que el usuario ingrese un
caracter letra minúscula, pida ingresar un número entero. Si el
número ingresado está entre 1 y 5 inclusive deberá imprimir la
tabla de multiplicar de dicho número. */

public class ejercicio_13 {

	public static void main(String[] args) {
		
		char letra = 'a';
		int num ;
		int aux = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		while(letra!='*'){
			
			try{
				System.out.println("Ingrese un caracter minuscula : ");
				letra = entrada.readLine().charAt(0);
				if(letra >= 'a' && letra <='z'){
					System.out.println("ingrese un numero entero : ");
					num = Integer.valueOf(entrada.readLine());
					if(num >= 1 && num <= 5){
						for(int i = 1; i<=10; i++){
							aux = i;
							aux*=num;
							System.out.println(num + "*"+ i + "=" + aux);
						}
					}
					else{
						System.out.println("FUERA DE RANGO!!! " + "\n" + "ingrese un numero entre 1 y 5 inclusive");
					}
				}
				else{
					System.out.println("ERROR , ingrese un caracter minuscula");
				}
				
				
			}
			catch(Exception exc){
				System.out.println("Error!!");
			}
			
		}

	}

}
