package practico_2;

/* Escribir un programa que mientras el usuario ingrese un caracter
distinto del carácter ‘*’, muestre por pantalla si es carácter dígito, o
si es carácter vocal minúscula. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_7 {

	public static void main(String[] args) {
		char letra = 'a';
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		while(letra != '*' ){
			
			try{
				System.out.println("ingrese un carácter : ");
				letra = entrada.readLine().charAt(0);
				
				if(letra >='0' || letra <='9'){
					
					/* porque cuando pongo && me funciona el programa */
					
					System.out.println("es un caracter digito");
				}
				
				else if (letra == 'a' || letra == 'e'|| letra == 'i'|| letra == 'o'|| letra == 'u'){
					System.out.println("es un caracter vocal minuscula");
				}
				else{
					System.out.println("ingrese un caracter digito o vocal minuscula!!");
				}
			}
			catch(Exception exc){
				System.out.println("Error!!");
			}
			
		}
		
		
	}

}


