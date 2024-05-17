package practico_2;

/* Escribir un programa que mientras el usuario ingrese un
carácter letra minúscula, se quede con la menor y la mayor letra
ingresada. Finalmente muestre por pantalla dichas letras. */


import java.io.BufferedReader;
import java.io.InputStreamReader; 

public class ejercicio_12 {

	public static void main(String[] args) {
		
		char caracter1 = 'a';
		char caracter2;
		char mayor;
		char menor;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		while(caracter1!='*'){
			
			try{
				System.out.println("ingrese caracter minuscula : ");
				caracter1 = entrada.readLine().charAt(0);
				System.out.println("ingrese caracter minuscula : ");
				caracter2 = entrada.readLine().charAt(0);
				if(caracter1 >= 'a' && caracter1 <= 'z'){
					if(caracter1>caracter2){
						mayor = caracter1;
						System.out.println("la letra mayor ingresada es : " + mayor);
					}
				}
				
				else if(caracter1<caracter2){
					menor = caracter1;
					System.out.println("la letra mayor ingresada es : " + menor);
				}
				
			}
			catch(Exception exc){
				System.out.println("ERROR!!!");
			}
		}

	}

}
