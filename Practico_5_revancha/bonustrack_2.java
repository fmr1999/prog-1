/* 2. El departamento de ventas de la cadena de supermercados
carrefive desea hacer un an�lisis sobre lo comercializado en el
�ltimo fin de semana largo. Para ello solicita al grupo de desarrollo
que le prepare algunas rutinas para conocer:
f. del ticket de mayor importe, cu�ntos art�culos hay
involucrados y cu�l es el promedio de valores
g. cuanto es el valor promedio de venta por ticket en todo el fin
de semana
h. cu�l fue el ticket con el menor importe, cu�nto fue su valor
i. cu�l fue el ticket con la menor cantidad de art�culos vendidos
Hacer un programa completo con un men� de opciones (con la
opci�n �0� sale) para que informe los diferentes valores al
departamento de ventas. Considerar constantes y variables
acordes al problema. Establezca c�mo ser� la estructura que
usar� y definala en el programa teniendo en cuenta los conceptos
de secuencias vistos en la teor�a.
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

	/* a. cu�ntos tickets se emitieron ese fin de semana */
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
	
	/*  b. cu�nto fue el importe total de ventas */
	
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
	
	/* c. cu�l fue el ticket de mayor importe, cu�nto fue su valor */
	
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
	
	/* d. cu�l fue la mayor cantidad de art�culos vendidos en un ticket */
	
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
	
	/* e. del ticket con mayor cantidad de art�culos vendidos, cu�l fue
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

