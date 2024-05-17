/* Escribir un programa que mientras el usuario cargue desde
teclado un número entero distinto de 0, imprima por pantalla la
suma que se obtiene de invocar un método que calcula la
sumatoria de los primeros 200 números naturales (son números
enteros entre 1 y 200). */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_7 {
	
	final static int MAX = 200;
	final static int MIN = 1;

	public static void main(String[] args) {
		
		int num = -1;
		
		
		while(num!=0){
			
			num = ingresarUnEntero();
			if(num!=0){
				sumaNumerosNaturales();
			}
			else{
				System.out.println("incorrecto , ingresar un numero distinto de 0 : ");
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
	
	public static void sumaNumerosNaturales(){
		int suma = 0;
		
		for(int i = MIN; i<=MAX ; i++){
			suma += i;
			System.out.println(i);
		}
	}

}
