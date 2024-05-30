/*Un sismógrafo ubicado en la ciudad de Mendoza, Argentina,
registró una fuerte actividad sísmica en los últimos días. Los datos
están en escala de Richter, y están representados en el siguiente
arreglo:
Cada día de actividad sísmica está separada por un cero. Cada
secuencia representa qué sismos hubo en esa jornada. Entonces,
con la información provista, se pide calcular el promedio de
actividad sísmica para aquellos días donde hubo un número
mayor a N de temblores y que todas las magnitudes de dicho día
sean de un mínimo de M en la escala de Richter
Por ejemplo, si N=1 y M=2.0, las secuencias que cumplen son:
Por ende, el promedio de sismos para los días que cumplen la
condición es => 2.9375
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bonustrack_1 {
	
	final static int MAX= 20;
	final static int N = 1;
	final static double M = 2.0;
	public static void main(String[] args) {
		
		double [] arrenteros= {0,2.1,1.5,4.1,0,3.4,0,2.5,3.0,0,1.8,0,2.7,2.7,3.9,2.5,0,4.2,2.0,0};
	
		int inicio = 0;
		int fin = -1;
		int cantidadTemblores = 0;
		int promedioTemblores = 0;
		
		while(inicio<MAX){
			inicio = obtenerInicio(arrenteros,fin + 1);
				if(inicio<MAX){
					fin = obtenerFin(arrenteros,inicio);
					cantidadTemblores = cantidadTemblores(arrenteros,inicio,fin);
						if(cantidadTemblores > N){
							promedioTemblores = promedioTemblores(arrenteros,inicio,fin,cantidadTemblores);
						}
				}
		}
	
	}
	
	
	
	
	public static int cantidadTemblores(double [] arr , int ini , int fin){
		int cantidad = 0;
		for(int pos = ini; pos<=fin ;pos++){
			if(arr[pos]>=M){
				cantidad ++;
			}
		}
		return cantidad;
	}

	public static int promedioTemblores(double [] arr,int ini,int fin , int cantidad){
		int suma = 0;
		int resultado = 0;
		for(int pos = ini; pos<=fin; pos++){
			if(arr[pos]>=M){
				suma+=arr[pos];
				resultado = suma / cantidad;
			}
		}
		return resultado;
	}
	public static int obtenerInicio(double [] arr , int ini){
		while(ini<MAX && arr[ini] == 0){
			ini++;
		}
		return ini;
	}
	
	public static int obtenerFin(double [] arr, int ini){
		int fin = ini;
		while(fin<MAX && arr[fin]!=0){
			fin++;
		}
		return fin -1;
	}
	
	public static void imprimirArreglo(int []arr){
		for(int pos = 0; pos<MAX; pos++){
			System.out.print("[" + arr[pos] + "]");
		}
	}

}