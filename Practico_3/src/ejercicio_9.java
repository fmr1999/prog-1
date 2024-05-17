/* Escribir un programa que mientras el usuario ingrese un número
entero entre 1 y 10, pida ingresar un carácter, y por cada carácter
ingresado imprima:

a. “letra minúscula” si el carácter es una letra del abecedario en
minúscula;
b. “letra mayúscula” si el carácter es una letra del abecedario
en mayúscula;
c. “dígito” si el carácter corresponde a un número;
d. “otro” para los restantes casos de caracteres. */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_9 {
	
	public static final int MIN = 1;
	public static final int MAX = 10;


	public static void main(String[] args) {
		
		int num = -1;
		char caracter = 'a';
		
		while(num!=0){
			num = ingresarEntero();
			if(num > MIN && num < MAX){
				caracter = ingresarCaracter();
				if(caracter >= 'a' && caracter <= 'z'){
					System.out.println("letra minuscula");
				}
				if(caracter >= 'A' && caracter <= 'Z'){
					System.out.println("letra mayuscula");
				}
				if(caracter >= '0' && caracter <= '9'){
					System.out.println("digito");
				}
				else{
					System.out.println("otro");
				}
				
			}
			else{
				System.out.println("ingrese un numero entre 1 y 10!!!!");
			}
		}
			
	}
	
	public static int ingresarEntero(){
		int entero = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("ingresar un numero : ");
			entero = Integer.valueOf(entrada.readLine());
			
		}
		catch(Exception exc){
			System.out.println("ERROR!!");
		}
		
		return entero;
		
	}
	
	public static char ingresarCaracter(){
		char letra = 'a';
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("ingresar un caracter : ");
			letra = entrada.readLine().charAt(0);
			
		}
		catch(Exception exc){
			System.out.println("ERROR!!");
		}
		
		return letra;
		
	}

}
