package practico_2;

/* Escribir un programa que mientras que el usuario ingrese un
carácter dígito o carácter letra minúscula, imprima si es carácter
dígito o carácter letra minúscula, y si es letra minúscula imprimir si
es vocal o consonante. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_9 {

	public static void main(String[]args){
		
		char caracter = '0';
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		while(caracter!='*'){
			
			try{
				System.out.println("ingrese un caracter digito o letra minuscula : ");
				caracter = entrada.readLine().charAt(0);
				
				if(caracter>='0' && caracter<='9'){
					System.out.println("es carácter digito");
				}
				else if(caracter>='a' && caracter<='z'){
					System.out.println("es letra minúscula");
					switch(caracter){
					case 'a' : System.out.println("es vocal");break;
					case 'e' : System.out.println("es vocal");break;
					case 'i' : System.out.println("es vocal");break;
					case 'o' : System.out.println("es vocal");break;
					case 'u' : System.out.println("es vocal");break;
					default : System.out.println("es consonante");
					}
				}
				else{
					System.out.println(" POR FAVOR , ingrese un carácter digito o letra minúscula :");
					caracter = entrada.readLine().charAt(0);
				}
				
				
				
				
			}
			catch(Exception exc){
				System.out.println("ERROR!!");
			}
			
		}
	}
}
