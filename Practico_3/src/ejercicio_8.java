/* Realizar un programa que dado dos números enteros y un
carácter (todos ingresados por el usuario) muestre por pantalla el
resultado de una operación matemática básica según el valor del
carácter ingresado. Si se ingresó el carácter ‘a’ debe realizar la
suma, para ‘b’ la resta, para ‘c’ la multiplicación y para ‘d’ la
división entre ambos números. */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ejercicio_8 {

	public static void main(String[] args) {
		int num1 = -1 , num2 = -1;
		char caracter;
		
		while(num1!=0 && num2!=0){
			num1 = ingresarUnEntero();
			num2 = ingresarUnEntero();
			caracter = ingresarCaracter();
			if((caracter == 'a') || (caracter == 'b')||( caracter == 'c')|| (caracter == 'd')){
				switch(caracter){
				case 'a' : sumaNumeros(num1 , num2 );break;
				case 'b' : restaNumeros(num1 , num2 );break;
				case 'c' : multiplicacionNumeros(num1 , num2 );break;
				case 'd' : divisionNumeros(num1 , num2 );break;
				}
			}
			
		}
	}
	
	
	
	
	public static int ingresarUnEntero(){
		int entero = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("ingresar un numero entero : ");
			entero = Integer.valueOf(entrada.readLine());
		}
		catch(Exception exc){
			System.out.println("ERROR!!");
		}
		
		return entero;
		
	}
	
	public static char ingresarCaracter(){
		char caracter = 'a';
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try{
			System.out.println("ingresar un numero caracter : ");
			caracter = entrada.readLine().charAt(0);
		}
		catch(Exception exc){
			System.out.println("ERROR!!");
		}
		
		return caracter;
		
	}
	
	public static int sumaNumeros( int num1 , int num2 ){
		int resultado = 0;
		resultado = num1 + num2;
		System.out.println("El resultado de la suma de "+num1+" y "+num2+" es : "+resultado);
		return resultado;
	}
	
	public static int restaNumeros( int num1 , int num2){
		int resultado = 0;
		resultado = num1 - num2;
		return resultado;
	}
	
	public static int multiplicacionNumeros( int num1 , int num2){
		int resultado = 0;
		resultado = num1 * num2;
		return resultado;
	}
	
	public static int divisionNumeros( int num1 , int num2){
		int resultado = 0;
		resultado = num1 / num2;
		return resultado;
	}
	
	
	
	

}
