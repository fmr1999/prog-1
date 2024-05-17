package practico_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/* Escribir un programa que mientras el usuario ingrese un n�mero
entero menor que 100 y mayor a 1, muestre por pantalla si el
n�mero es m�ltiplo de 2 y m�ltiplo de 3 simult�neamente. (�Los
valores mencionados en el enunciado deber�an ser constantes?.
De a poco habr�a que definirlos como constantes). */ 


public class p2ejercicio6 {

	public static void main(String[] args) {
		int num=2;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		while(num>1 && num<100) {
			try {
				System.out.println("Ingrese un numero entre 1 y 100.");
				num = Integer.valueOf(entrada.readLine());
				if((num<=1) || (num>=100)) {
					System.out.println("El numero ingresado es invalido.");
				}
				else if((num%2==0)&&(num%3==0)) {
					System.out.println("El numero ingresado es multiplo de 2 y de 3.");
				}
				else {
					System.out.println("El numero ingresado no es multiplo de 2 y de 3.");
				}
			}
			catch(Exception exc) {
				System.out.println(exc);
			}
		}
	}

}