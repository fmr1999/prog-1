package practico_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Escribir un programa que mientras que el usuario ingrese un
n�mero distinto de 0, pida ingresar otros dos n�meros e imprima
el resultado de la divisi�n entre los dos �ltimos n�meros
ingresados. �Existe alguna restricci�n para la divisi�n? */

public class ejercicio_18 {

	public static void main(String[] args) {
		
		int num1 = -1;
		double num2;
		double num3;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		while(num1!=0){
			
			try{
				System.out.println("ingrese un numero distinto de 0 : ");
				num1 = Integer.valueOf(entrada.readLine());
				if(num1!=0){
					System.out.println("ingrese dos numero mas : ");
					num2 = Double.valueOf(entrada.readLine());
					num3 = Double.valueOf(entrada.readLine());
					System.out.println("el resultado de la division es : " + (num2/num3));
				}
				else{
					System.out.println("INGRESAR UN VALOR DISTINTO DE 0 , para reiniciar el prograna");
					num1 = Integer.valueOf(entrada.readLine());
				}
				
			}
			catch(Exception exc){
				System.out.println("ERROR!!");
			}
		}

	}

}
