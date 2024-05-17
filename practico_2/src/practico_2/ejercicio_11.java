package practico_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/* Escribir un programa que mientras el usuario ingrese un
caracter letra minúscula, acumule la cantidad de vocales que
ingresó. Finalmente muestre por pantalla dicha cantidad. */

public class ejercicio_11 {

	public static void main(String[] args) {
		
		char caracter = 'a';
		int contador = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		while(caracter!='*'){
			try{
				System.out.println("ingresar un caracter letra minuscula : ");
				caracter = entrada.readLine().charAt(0);
				if(caracter >='a' && caracter <= 'z'){
					if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
						contador++;
						System.out.println(contador);
					}
				}
				else{
					System.out.println("no es un caracter letra minuscula!!");
				}
				
			}
			catch(Exception exc){
				System.out.println("ERROR!!");
			}
		}
		
	}

}
