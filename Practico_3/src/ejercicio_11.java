/* Escribir un m�todo que retorne el mayor de dos n�meros. Usar
ese m�todo para calcular el m�ximo de una serie de n�meros
ingresados por el usuario (20 n�meros en total). */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_11 {
	public static void main (String [] args){
		
		int num1 = 1;
		int num2 = 1;
		
		
		while(num1 != 0 && num2 !=0 ){
			for(int i = 1 ; i<=10 ; i++){
				num1 = obtener_Entero();
				num2 = obtener_Entero();
			}
			Obtener_Mayor_Numero(num1 , num2);
		}
		
	}
	
	
	public static int obtener_Entero(){
		int entero = 0;
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		try{
			System.out.println("ingresar numero : ");
			entero = Integer.valueOf(entrada.readLine());
			
		}
		catch(Exception exc){
			System.out.println("ERROR!!");
		}
		return entero;
	}
	
	public static void Obtener_Mayor_Numero(int num1 , int num2){
		if(num1 > num2 ){
			System.out.println("el numero mayor es : " + num1);
		}
		else if (num2 > num1){
			System.out.println("el numero mayor es  : " + num2);
		}
		else{
			System.out.println("los numeros son iguales");
		}
	}
}
