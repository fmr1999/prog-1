package practico_2;

/* Construir un programa que solicite desde teclado un número de
mes y posteriormente notifique por pantalla la cantidad de días de
ese mes. En el caso de que ingrese 2 como número de mes
(febrero) deberá además solicitar ingresar un número de año y,
dependiendo si es bisiesto o no con la siguiente sentencia:
((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_2 {
	public static void main(String[]args){
		
		int mes , anio;
		
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un numero de mes : ");
			mes = Integer.valueOf(entrada.readLine());
			
			if(mes >=1 && mes<=12){
				switch(mes){
				case 2 : System.out.println("29");break;
				case 6 : System.out.println("29");break;
				case 3 : System.out.println("30");break;
				case 4 : System.out.println("30");break;
				case 9 : System.out.println("30");break;
				case 11 : System.out.println("30");break;
				case 1 : System.out.println("30");break;
				case 5 : System.out.println("30");break;
				case 7 : System.out.println("30");break;
				case 8 : System.out.println("30");break;
				case 10 : System.out.println("30");break;
				case 12 : System.out.println("30");break;
				
				}
				System.out.println("ingrese un numero de año : ");
				anio = Integer.valueOf(entrada.readLine());
				if(((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))){
					System.out.println("366");
				}
				else{
					System.out.println("365");
				}
			}
			
			else{
				System.out.println("ingrese un numero entre 1 y 12");
			}
			
			
			
		}
		catch(Exception exc){
			System.out.println("ERROR!!");
		}
	}
}
