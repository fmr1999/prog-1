package practico_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*  Pedir n�meros enteros positivos por teclado. En cada iteraci�n
el usuario puede ingresar 0 para salir del programa. Si ingresa un
n�mero distinto de 0 se debe pedir el ingreso de un car�cter.

a. Si es �a� se debe permitir al usuario escribir un texto libre e
imprimirlo por pantalla.

b. Si es �b� se deben pedir 5 n�meros positivos e informar si
fueron ingresados en orden ascendente.

c. Si es �c� se deben pedir dos n�meros enteros negativos e
imprimir la ra�z cuadrada de su multiplicaci�n. La ra�z
cuadrada de un n�mero se calcula con la sentencia:
Math.sqrt(numero).

d. Ante cualquier otro car�cter ingresado se debe informar un
error y pedir nuevamente el car�cter.*/

public class ejercicio_20 {

	public static void main(String[] args) {
		
		int num = -1;
		char caracter;
		String mensaje;
		boolean ascendente = true; 
		int aux = 0 ;
		int mayor = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
		
		while(num!=0){
			
			try{
				System.out.println("ingresa numero positivo o 0 para salir");
				num = Integer.valueOf(entrada.readLine());
				if(num!=0){
					System.out.println("ingresar un caracter");
					caracter = entrada.readLine().charAt(0);
					if(caracter >= '0' && caracter <= '9' || caracter >= 'a' && caracter<= 'z' || caracter >= 'A' && caracter <= 'Z' ){
						if(caracter == 'a'){
							System.out.println("puedes ingresar un texto :");
							mensaje = entrada.readLine();
							System.out.println(mensaje);
						}
						else if (caracter == 'b'){
							
							System.out.println("ingrese 5 numeros");
							
							for(int i = 0; i<5 ; i++ ){
								System.out.println("Numero" + (i + 1) + ": ");
								num = Integer.valueOf(entrada.readLine());
								if(num)
								
							}
							
						}
					}
					
				}
			}
			catch(Exception exc){
				System.out.println("ERROR!!");
			}
			
		}
	

	}

}
