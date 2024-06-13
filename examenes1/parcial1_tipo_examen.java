package examenes1;

public class parcial1_tipo_examen {

    final static int MAX = 25;
    final static int MAX_T = 2;
    final static int SEPARADOR = 0;
    final static int PROMOCIONADO = 22;
    final static int R = 22;

    public static void main(String[] args) {
        int[] arrenteros = {0, 0, 12, 9, 18, 0, 15, 5, 4, 7, 10, 0, 8, 9, 12, 0, 19, 10, 9, 0, 0, 0, 0, 0, 0};
        int[] arrenterosT = {8, 9};
        int inicio = 0;
        int fin = -1;
        int cantidad = 2; // Cantidad C de productos promocionados disponibles

        while (inicio < MAX && cantidad > 0) {
            inicio = posInicio(arrenteros, fin + 1);
            if (inicio < MAX) {
                fin = posFin(arrenteros, inicio);
                if (existe(arrenteros, arrenterosT, inicio, fin)) {
                    agregar(arrenteros, fin);
                    cantidad--; // Decrementar la cantidad de productos promocionados disponibles
                }
            }
        }

        imprimir_arreglo(arrenteros);
        
    }
    
   

    public static boolean existe(int[] arr, int[] arrT, int ini, int fin) {
        for (int posA = ini; posA <= fin; posA++) {
            for (int posT = 0; posT < MAX_T; posT++) {
                if (arr[posA] == arrT[posT]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int posInicio(int[] arr, int ini) {
        while (ini < MAX && arr[ini] == SEPARADOR) {
            ini++;
        }
        return ini;
    }

    public static int posFin(int[] arr, int ini) {
        int fin = ini;
        while (fin < MAX && arr[fin] != SEPARADOR) {
            fin++;
        }
        return fin - 1;
    }

    public static void corrimientoDer(int[] arr, int pos) {
        for (int i = MAX - 1; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
    }

    public static void agregar(int[] arr, int pos) {
        corrimientoDer(arr, pos);
        arr[pos + 1] = R;
    }

    public static void imprimir_arreglo(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("[" + arr[pos] + "]");
        }
        System.out.println();
    }
}

