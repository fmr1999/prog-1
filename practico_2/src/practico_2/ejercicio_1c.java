package practico_2;

/*c. solicite un número del 1 al 7 e imprima el día de la semana.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio_1c {
	public static void main(String[]args){
		int num;
		
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un numero del 1 al 7 : ");
			num = Integer.valueOf(entrada.readLine());
			
			switch(num) {
			
				case 1 : System.out.println("lunes");break;
				case 2 : System.out.println("martes");break;
				case 3 : System.out.println("miercoles");break;
				case 4 : System.out.println("jueves");break;
				case 5 : System.out.println("viernes");break;
				case 6 : System.out.println("sabado");break;
				case 7 : System.out.println("domingo");break;
				default : System.out.println("no es un numero valido!!");break;
			}
		}
		catch(Exception exc){
			System.out.println("Error!!");
		}
		
	}
}


