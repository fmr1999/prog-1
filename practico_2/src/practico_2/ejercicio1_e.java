package practico_2;

/* solicite 3 números e imprima “creciente” si los tres números
están en orden creciente, “decreciente” si están en orden */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio1_e {

	public static void main (String[]args){
		
		double num1,num2,num3;
		
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("ingrese primer numero : ");
			num1= Double.valueOf(entrada.readLine());
			System.out.println("ingrese segundo numero : ");
			num2= Double.valueOf(entrada.readLine());
			System.out.println("ingrese tercer numero : ");
			num3= Double.valueOf(entrada.readLine());
			
			if(num1<num2 && num2<num3){
				System.out.println("creciente");
			}
			else if(num1>num2 && num2>num3){
				System.out.println("decreciente");
			}
			else{
				System.out.println("no se puede ingresar numeros iguales");
			}
				
		}
		catch(Exception exc){
			System.out.println("ERROR!");
		}
		
	}
}
