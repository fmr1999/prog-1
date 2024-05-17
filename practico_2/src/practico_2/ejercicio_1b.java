package practico_2;

/*b. solicite un número e imprima “grande” si es mayor a 100 y
“chico “ si es menor. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_1b {
	public static void main(String[]args){
		
		int num;
		
		try{
			BufferedReader entrada = new BufferedReader ( new InputStreamReader(System.in));
			System.out.println("ingrese un numero : ");
			num = Integer.valueOf(entrada.readLine());
			
			if(num>100){
				System.out.println("GRANDE");
			}
			else if (num<100){
				System.out.println("CHICO");
			}
			else{
				System.out.println("el numero ingresado es 100");
			}
		}
		catch(Exception exc){
			System.out.println("Error!");
		}
	}
}
