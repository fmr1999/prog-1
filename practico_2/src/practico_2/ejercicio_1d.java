package practico_2;

/* solicite una letra e imprima si es vocal o consonante. */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ejercicio_1d {
	public static void main(String[]args){
		char letra;
		
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("ingrese una letra : ");
			letra = entrada.readLine().charAt(0);
			
			switch(letra){
			case 'a' : System.out.print("es vocal");break;
			case 'e' : System.out.print("es vocal");break;
			case 'i' : System.out.print("es vocal");break;
			case 'o' : System.out.print("es vocal");break;
			case 'u' : System.out.print("es vocal");break;
			default : System.out.println("es consonante");
			}
			
		}
		catch(Exception exc){
			System.out.println("ERROR!");
		}
	} 
}
