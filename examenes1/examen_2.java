package examenes1;
/* Se tiene una matriz de caracteres de tamanio 2*13 de secuencias de caracteres entre 'a' y 'z' (por cada fila), separadas por espacios ' '. 
La matriz esta precargada, y ademas cada fila empieza y 
termina con uno o mas separadores espacios. 
Se pide realizar un programa que:
_por cada secuencia inserte al principio de la misma el ultimo caracter vocal
 que tiene la secuencia (si tiene). 
Suponer que cada fila de la matriz tiene espacio para agregar esos caracteres.
 */
public class examen_2 {
	 	final static int MAXCOLUMNAS = 15;
	    final static int MAXFILAS = 2;
	public static void main(String[] args) {
		char[][] matCaracteres = {
	            {' ', 'b', 'b', 'c','b', ' ', 'd', 'e', 'f', 'a', ' ', 'g', 'h', 'i', ' '},
	            {' ', 'j', 'k', 'l','u',' ', 'm', 'n', 'p', ' ', 'z','p', 'o', 'r', ' '}
	        };
		
		for(int filas= 0; filas<MAXFILAS;filas++){
			int inicio = 0;
			int fin = -1;
			boolean vocal; 
			while(inicio<MAXCOLUMNAS){
				inicio = PosInicio(matCaracteres[filas],fin + 1);
				if(inicio<MAXCOLUMNAS){
					fin = PosFin(matCaracteres[filas],inicio);
					vocal = Vocales(matCaracteres[filas],inicio,fin);
					if(vocal){
						InsertarVocal(matCaracteres[filas],inicio ,vocal);
					}
				}
			}
		}
		imprimirMatriz(matCaracteres);

	}
	
	
	public static void InsertarVocal(char [] arr , int ini , char vocal){
		for(int pos = MAXCOLUMNAS-1; pos>ini;pos--){
			arr[pos] = arr[pos-1];
		}
		arr[ini] = vocal;
	}
	
	public static boolean Vocales(char [] arr , int ini, int fin){
		for(int pos = ini; pos<=fin;pos++){
			if(arr[pos] == 'a' || arr[pos] == 'e' || arr[pos] == 'i' || arr[pos] == 'o' || arr[pos] == 'u'){
				return true;
			}
		}
		return false;
	}
	
	
	public static char PosInicio(char [] arr , int ini){
		while(ini<MAXCOLUMNAS && arr[ini] == ' '){
			ini++;
		}
		return (char) ini;
	}
	
	public static char PosFin(char [] arr , int ini){
		int fin = ini;
		while(fin<MAXCOLUMNAS && arr[fin] != ' '){
			fin++;
		}
		return (char) (fin - 1);
	}
	
	 public static void imprimirMatriz(char[][] mat) {
	        for (int i = 0; i < MAXFILAS; i++) {
	            for (int j = 0; j < MAXCOLUMNAS; j++) {
	                System.out.print(mat[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
