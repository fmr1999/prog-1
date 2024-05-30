import java.util.Scanner;

public class bonus_track_1_referencia {
    final static int MAX = 20;

    public static void main(String[] args) {
        double[] datos = {0, 2.1, 1.5, 4.1, 0, 3.4, 0, 2.5, 3.0, 0, 3.8, 0, 2.7, 2.7, 3.9, 2.5, 0, 4.2, 2.0, 0};
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Ingrese el valor de N (número mínimo de temblores): ");
            int N = entrada.nextInt();
            System.out.println("Ingrese el valor de M (magnitud mínima): ");
            double M = entrada.nextDouble();

            double promedio = calcularPromedioSismos(N, M, datos);
            if (promedio > 0) {
                System.out.println("El promedio de los sismos de los días que cumplen con las condiciones es: " + promedio);
            } else {
                System.out.println("No hubo días que cumplieran con las condiciones especificadas.");
            }
        } catch (Exception e) {
            System.out.println("Error en la entrada. Asegúrese de ingresar valores válidos.");
        } finally {
            entrada.close();
        }
    }

    public static double calcularPromedioSismos(int N, double M, double[] datos) {
        int inicio = 0;
        double sumaTotalPromedios = 0;
        int totalDiasValidos = 0;

        while (inicio < MAX) {
            inicio = obtenerInicio(datos, inicio);
            if (inicio < MAX) {
                int fin = obtenerFin(datos, inicio);
                int cantidadTemblores = obtenerCantidadTemblores(datos, M, inicio, fin);
                if (cantidadTemblores > N) {
                    double promedioDia = obtenerPromedioTemblores(datos, M, inicio, fin);
                    sumaTotalPromedios += promedioDia;
                    totalDiasValidos++;
                  
                }
                inicio = fin + 1;
            }
        }

        if (totalDiasValidos > 0) {
            return sumaTotalPromedios / totalDiasValidos;
        } else {
            return 0;
        }
    }

    public static int obtenerInicio(double[] arr, int pos) {
        while (pos < MAX && arr[pos] == 0) {
            pos++;
        }
        return pos;
    }

    public static int obtenerFin(double[] arr, int pos) {
        while (pos < MAX && arr[pos] != 0) {
            pos++;
        }
        return pos - 1;
    }

    public static int obtenerCantidadTemblores(double[] datos, double M, int inicio, int fin) {
        int cantidad = 0;
        for (int i = inicio; i <= fin; i++) {
            if (datos[i] >= M) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public static double obtenerPromedioTemblores(double[] datos, double M, int inicio, int fin) {
        double suma = 0;
        int cantidad = 0;
        for (int i = inicio; i <= fin; i++) {
            if (datos[i] >= M) {
                suma += datos[i];
                cantidad++;
            }
        }
        return suma / cantidad;
    }
}
