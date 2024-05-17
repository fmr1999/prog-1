/* Escribir un programa que mientras el usuario ingresa un
número de mes (entero) entre 1 y 12 inclusive, muestre por
pantalla la cantidad de días del mes ingresado (suponer febrero
de 28 días) (Mostrar por pantalla la cantidad de días del mes
debería realizarse con un método). */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_16 {

	public static void main(String[] args) {
		int mes = 0;
		
		while(mes!=-1){
			mes = obtenerNumeroMes();
			if(mes >=1 && mes <= 12){
				diasDelMes(mes);
			}
			else{
				System.out.println("ingresar numero de mes valido!!!");
			}
		}

	}
	
	
	public static int obtenerNumeroMes(){
		int num = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("ingresar numero de mes : ");
			num = Integer.valueOf(entrada.readLine());
		}
		catch(Exception exc){
			System.out.println("ERROR");
		}
		
		return num;
	}
	
	public static void diasDelMes(int dias){
			switch(dias){
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
	}

}
