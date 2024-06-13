package examenes1;

public class parcial2024 {

	public static final int MAX_M = 20;
	public static final int MAX_A = 3;
	public static void main(String[] args) {
		int [] materias = {0,0,34,2,12,25,0,32,55,12,3,88,14,0,0,17,36,19,0,0};
		int [] aulas = {2,3,6};
		
		int inicio = 0;
		int fin = 0;
		
		while(inicio<MAX_M){
			inicio = obtenerInicio(materias,fin + 1);
			if(inicio<MAX_M){
				fin = obtenerFin(materias,inicio);
				int tamanio = fin-inicio+1;
				if(EliminarAulasAsignadas(materias,aulas,inicio,tamanio)){
					EliminarAulas(materias,inicio,tamanio);
					fin = inicio - 1; 
				}else {
                    fin = fin + 1;  
                }
				
			}
		}
		imprimirArreglosMaterias(materias);
		
	}

	public static int obtenerInicio(int [] mat, int ini){
		while(ini<MAX_M && mat[ini] == 0){
			ini++;
		}
		return ini;
	}
	
	public static int obtenerFin(int [] mat, int ini) {
		int fin = ini;
		
		while(fin<MAX_M && mat[fin] != 0){
			fin++;
		}
		return fin - 1;
	}
	

	public static boolean EliminarAulasAsignadas(int []mat,int[]aula,int ini, int tamanio){
		for(int i = 0; i<MAX_A;i++){
			if(tamanio == aula[i]){
				return true;
			}
		}
		return false;
}

	public static void EliminarAulas(int []mat,int ini , int tamanio){
			for(int i = 0 ; i<tamanio;i++){
				CorrimientoIzq(mat,ini);
			}
	}
	
	public static void CorrimientoIzq(int [] mat, int ini){
		for(int pos = ini; pos<MAX_M-1; pos++){
			mat[pos] = mat[pos+1];
		}
		 mat[MAX_M - 1] = 0;
	}
	
	
	public static void imprimirArreglosMaterias(int [] arr){
		for(int pos = 0; pos<MAX_M ; pos++){
			System.out.print("[" + arr[pos] + "]");
		}
	}
	
	
}
