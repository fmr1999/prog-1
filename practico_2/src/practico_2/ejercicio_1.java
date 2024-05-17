package practico_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/* Escribir un programa completo (declaraci�n de constantes y
variables, carga de datos, procesamiento e impresi�n de
resultados) para cada caso o �tem que:
a. solicite un n�mero e indique si es positivo o negativo.
b. solicite un n�mero e imprima �grande� si es mayor a 100 y
�chico � si es menor.
c. solicite un n�mero del 1 al 7 e imprima el d�a de la semana.
d. solicite una letra e imprima si es vocal o consonante.
e. solicite 3 n�meros e imprima �creciente� si los tres n�meros
est�n en orden creciente, �decreciente� si est�n en orden
decreciente o �error� si no cumplen ning�n orden */

public class ejercicio_1 {
	public static void main(String[]args){
		
		double num;
		
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un numero : ");
			num = Double.valueOf(entrada.readLine());
			if(num > 0){
				System.out.println("el numero ingresado es positivo");
			}
			else if(num < 0){
				System.out.println("el numero ingresado es negativo");
			}
			else{
				System.out.println("el numero ingresado es un 0");
			}
		}
		catch(Exception exc){
			System.out.println("ERROR!!");
		}
		
	}
}
