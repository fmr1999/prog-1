/* 2. El departamento de ventas de la cadena de supermercados
carrefive desea hacer un análisis sobre lo comercializado en el
último fin de semana largo. Para ello solicita al grupo de desarrollo
que le prepare algunas rutinas para conocer:
f. del ticket de mayor importe, cuántos artículos hay
involucrados y cuál es el promedio de valores
g. cuanto es el valor promedio de venta por ticket en todo el fin
de semana
h. cuál fue el ticket con el menor importe, cuánto fue su valor
i. cuál fue el ticket con la menor cantidad de artículos vendidos
Hacer un programa completo con un menú de opciones (con la
opción ‘0’ sale) para que informe los diferentes valores al
departamento de ventas. Considerar constantes y variables
acordes al problema. Establezca cómo será la estructura que
usará y definala en el programa teniendo en cuenta los conceptos
de secuencias vistos en la teoría.
 */

public class bonustrack_2 {

	public static int MAX = 10;
	public static int SEPARADOR = 0;
	public static void main(String[] args) {
		int[] arrenteros = {0,1000,8000,4000,0,500,150,0,900,0};

		
		
		ticket(arrenteros);
	}
	
	public static int obtenerInicio(int [] arr , int ini){
		while(ini<MAX && arr[ini] == SEPARADOR){
			ini++;
		}
		return ini;
	}
	
	public static int obtenerFin(int [] arr , int ini){
		int fin = ini;
		while(fin<MAX && arr[fin] != SEPARADOR){
			fin ++;
		}
		return fin - 1;
	}

	/* a. cuántos tickets se emitieron ese fin de semana */
	public static void cantidadTickets(int [] arr){
		int inicio = 0;
		int fin = -1;
		int cantTickets = 0;
		while(inicio<MAX){
			inicio = obtenerInicio(arr,fin + 1);
			if(inicio<MAX){
				fin = obtenerFin(arr,inicio);
				cantTickets++;
			}
		}
		 System.out.println("Cantidad de tickets emitidos: " + cantTickets);
	}
	
	/*  b. cuánto fue el importe total de ventas */
	
	public static void totalVentas(int [] arr){
		int inicio = 0;
		int fin = -1;
		int totalVentas = 0;
		while(inicio<MAX){
			inicio = obtenerInicio(arr,fin + 1);
			if(inicio<MAX){
				fin = obtenerFin(arr,inicio);
				for(int pos = inicio; pos<=fin; pos++){
					totalVentas += arr[pos];
				}
			}
		}
		 System.out.println("importe total de ventas : " + totalVentas);
	}
	
	/* c. cuál fue el ticket de mayor importe, cuánto fue su valor */
	
	public static void ticketMayor(int [] arr){
		int inicio = 0;
		int fin = -1;
		int mayorImporte = 0;
		int mayorTicketImporte = 0;
		while(inicio<MAX){
			inicio = obtenerInicio(arr,fin + 1);
			if(inicio<MAX){
				fin = obtenerFin(arr,inicio);
				for(int pos = inicio; pos<=fin; pos++){
					if(arr[pos]>mayorImporte){
						mayorImporte = arr[pos];
						if(mayorImporte>mayorTicketImporte){
							mayorTicketImporte = mayorImporte;
						}
						
					}
				}
				
			}
		}
		System.out.println(mayorTicketImporte);
	}
	
	/* d. cuál fue la mayor cantidad de artículos vendidos en un ticket */
	
	public static void mayorCantidadArticulos(int [] arr){
		int inicio = 0;
		int fin = -1;
		int mayorCantArticulos = 0;
		while(inicio<MAX){
			inicio = obtenerInicio(arr,fin + 1);
			if(inicio<MAX){
				fin = obtenerFin(arr,inicio);
				if(fin-inicio+1>mayorCantArticulos){
					mayorCantArticulos = fin-inicio+1;
				}
			}
		}
		
		System.out.println(mayorCantArticulos);
	}
	
	/* e. del ticket con mayor cantidad de artículos vendidos, cuál fue
	el de mayor importe, el de menor y el promedio 
	public static void ticket(int [] arr){
		int inicio = 0;
		int fin = -1;
		int mayorCantArticulos = 0;
		int mayorImporte = 0;
		while(inicio<MAX){
			inicio = obtenerInicio(arr,fin + 1);
			if(inicio<MAX){
				fin = obtenerFin(arr,inicio);
				
				if(fin-inicio+1>mayorCantArticulos){
					mayorCantArticulos = fin-inicio+1;
					while(inicio<=mayorCantArticulos && arr[inicio] > mayorImporte ){
								mayorImporte = arr[inicio];
								inicio++;
					}
				}
			}
		}
		System.out.println(mayorImporte);
		
	}
	*/
	
	public static void ticket(int [] arr){
		int inicio = 0;
		int fin = -1;
		int mayorCantArticulos = 0;
		int mayorImporte = 0;
		while(inicio<MAX){
			inicio = obtenerInicio(arr,fin + 1);
			if(inicio<MAX){
				fin = obtenerFin(arr,inicio);
				
				if(fin-inicio+1>mayorCantArticulos){
					mayorCantArticulos = fin-inicio+1;
					while(inicio<=mayorCantArticulos && arr[inicio] > mayorImporte ){
								mayorImporte = arr[inicio];
								inicio++;
					}
				}
			}
		}
		System.out.println(mayorImporte);
		
	}
	
	
}

