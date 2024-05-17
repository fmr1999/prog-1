package practico_2;

/* Construir un programa que solicite desde teclado un número de
mes válido y posteriormente notifique por pantalla la cantidad de
días de ese mes. En el caso de que ingrese 2 como número de
mes (febrero) deberá además solicitar ingresar un número de año
entre 2000 y 2024 inclusive (no debe seguir si no está en ese
rango), y dependiendo de si es bisiesto o no imprimir la cantidad
de días correspondiente. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_19 {

	public static void main(String[]args){
		
		int mes = 0;
		int anio;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		while(mes!= -1){
			
			try{
				
				System.out.println("ingresar un numero de mes : ");
				mes = Integer.valueOf(entrada.readLine());
					switch(mes){
						case 1 : System.out.println(" enero tiene 31 dias");break;
						case 2 : System.out.println(" febrero tiene 29 dias");break;
						case 3 : System.out.println(" marzo tiene 31 dias");break;
						case 4 : System.out.println(" abril tiene 30 dias");break;
						case 5 : System.out.println(" mayo tiene 31 dias");break;
						case 6 : System.out.println(" junio tiene 30 dias");break;
						case 7 : System.out.println(" julio tiene 31 dias");break;
						case 8 : System.out.println(" agosto tiene 31 dias");break;
						case 9 : System.out.println(" septiembre tiene 30 dias");break;
						case 10: System.out.println(" octubre tiene 31 dias");break;
						case 11: System.out.println(" noviembre tiene 30 dias");break;
						case 12: System.out.println(" diciembre tiene 31 dias");break;
						default: System.out.println("el numero de mes ingresado no es valido!!!");
					}
					System.out.println("ingrese un numero de anio entre el 2000 y 2024 : ");
					anio = Integer.valueOf(entrada.readLine());
					if(anio >= 2000 && anio<=2024 ){
						if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
							System.out.println("366");
						}
						else{
							System.out.println("365");
						}
					}
					break;
			}
			catch(Exception exc){
				System.out.println("ERROR!!");
			}
		}
	}
}
