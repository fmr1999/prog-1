package practico_2;

/*Pedir por consola 15 caracteres. Imprimir la mayor cantidad de
‘a’ seguidas que se ingresaron. */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ejercicio_16 {

	public static void main(String[]args){
		
		char caracter = 'b';
		char letras = 'a';
		int contador = 0;
		int aux=0;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		while(caracter!='*'){
			
			try{
				
					for(int i = 0; i <15 ; i++){
						System.out.println("ingrese un caracter : ");
						caracter = entrada.readLine().charAt(0);
						
						if(caracter>= '0' && caracter <= '9' || caracter>='a' && caracter<='z' || caracter>='A' && caracter<='Z'){
							if(caracter == letras) {
								contador++;
								if(contador > aux){
									aux = contador;
									System.out.println("la mayor cantidad de a seguidas son : " + aux);
								}
							}
							else if (caracter != letras){
								 contador = 0;
							}
							
						}
						else{
							System.out.println("INGRESAR CARACTERES!!!");
						}
					}
						break;
					}	
			
			catch(Exception exc){
				System.out.println("ERROR!!!");
			}
			
		}
		
	}
	
}
