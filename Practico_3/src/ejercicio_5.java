/*Hacer un m�todo que dado un n�mero entero con valor inicial 1,
haga una iteraci�n incrementando el n�mero de a uno hasta un
valor MAX = 4 (constante). Mientras itera deber� imprimir el
n�mero. Luego invocarlo desde el programa principal y cuando
termina, imprimir por pantalla �termin�.*/

public class ejercicio_5 {
	
	final static int MAX = 4;
	
	public static void main(String[]args){
		
		imprimirNumeros();
		System.out.println("Termino.");
		
	}
	
	public static void imprimirNumeros(){
		
		int num = 1;
		
		for(int i = num ; i<= MAX ; i++){
			System.out.println(i);
		}
		
	}
	
}
