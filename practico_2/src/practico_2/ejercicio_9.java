package practico_2;

/* Escribir un programa que mientras que el usuario ingrese un
car�cter d�gito o car�cter letra min�scula, imprima si es car�cter
d�gito o car�cter letra min�scula, y si es letra min�scula imprimir si
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
					System.out.println("es car�cter digito");
				}
				else if(caracter>='a' && caracter<='z'){
					System.out.println("es letra min�scula");
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
					System.out.println(" POR FAVOR , ingrese un car�cter digito o letra min�scula :");
					caracter = entrada.readLine().charAt(0);
				}
				
				
				
				
			}
			catch(Exception exc){
				System.out.println("ERROR!!");
			}
			
		}
	}
}
