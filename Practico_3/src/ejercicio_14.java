import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Escribir un programa que mientras el usuario ingresa un
carácter distinto del carácter ‘*’, invoque a un método que imprima
si es carácter dígito o carácter letra minúscula, y si es letra
minúscula imprimir si es vocal o consonante. */

public class ejercicio_14 {

	public static void main(String[] args) {
		
		char caracter = 'a';
		
		while(caracter!= '*'){
			caracter = ingresarCaracter();
			if(caracter!='*'){
				digito_o_letraMinuscula(caracter);
			}
			else{
				System.out.println("ingresaste * ");
			}
		}
	}
	
	
	
	public static char ingresarCaracter(){
			char letra = 'a';
	        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try{
			
			System.out.println("ingresar un caracter :");
			letra = entrada.readLine().charAt(0);
			
		}
		catch(Exception exc){
			System.out.println("Error al leer la entrada.");
		}
		return letra;
	}

	
	public static void digito_o_letraMinuscula(char caracter){
		if(caracter >= '0' && caracter <= '9'){
			System.out.println("caracter digito");
		}
		else if ( caracter >= 'a' && caracter <= 'z'){
			System.out.println("letra minuscula");
			switch(caracter){
			case 'a' : System.out.println("vocal");break;
			case 'e' : System.out.println("vocal");break;
			case 'i' : System.out.println("vocal");break;
			case 'o' : System.out.println("vocal");break;
			case 'u' : System.out.println("vocal");break;
			default : System.out.println("es consonante");
			}
		}
		else{
			System.out.print("no es un digito o letra minuscula");
		}
	}
}
