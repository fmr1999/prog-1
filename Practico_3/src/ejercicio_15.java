/* Escribir un programa que mientras que el usuario ingrese un
número entero natural, llame a un método que calcule la
sumatoria desde 1 a dicho número (Ej: si n= 5 sumatoria =
1+2+3+4+5=15) y retorne el resultado. */
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ejercicio_15 {

	public static void main(String[] args) {
		
		int num = -1;
		int sumatoria;
		while(num!=0){
			num = obtenerNatural();
			if(num!=0){
				Sumatoria(num);
			}
			else{
				System.out.println("ERROR , ingrese un numero natural");
			}
		}
	}
	
	
	public static int obtenerNatural(){
		int natural = 1;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("ingresar un numero natural : ");
			natural = Integer.valueOf(entrada.readLine());
		}
		catch(Exception exc){
			System.out.println("ERROR!!!");
		}
		
		return natural;
	}
	
	public static void Sumatoria(int natural){
		int suma = 0;
		for(int i = 1 ; i<=natural; i++){
			suma += i;
			System.out.println(suma);
		}
	}

}
