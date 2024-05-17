/* Escribir un programa que mientras el usuario cargue desde
teclado un carácter letra minúscula, llame a un método que
imprime por pantalla la tabla de multiplicar del 9. */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_6 {

	final static int MAX = 10;
	public static void main(String[] args) {
		
		char caracter = 'a';
	
		while(caracter!='*'){
			caracter = ingresarLetraMinuscula();
			if(caracter >= 'a' && caracter <= 'z'){
				tablaDel_9();
			}
		}

	}
	
	public static char ingresarLetraMinuscula(){
		char letra = 'a';
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
			
			try{
				
				System.out.println("ingresar letra minuscula : ");
				letra = entrada.readLine().charAt(0);
			}
			
			catch(Exception exc){
				System.out.println("ERROR!!!");
			}
		
		return letra;
	}
	
	public static void tablaDel_9(){
		for(int i = 1 ; i<=MAX ;i++ ){
			System.out.println("9" + "*" +  i + " = " + 9 * i);
		}
	}
}
