/* Escribir un programa que mientras el usuario ingrese un
número entero entre 1 y 10 realice:
a. Si el numero ingresado es múltiplo de 3 pida ingresar un
caracter, y para el caracter ingresado imprima a qué tipo de
carácter está asociado:
i. “letra minúscula” si el caracter es una letra del
abecedario en minúscula;
ii. “letra mayúscula” si el caracter es una letra del
abecedario en mayúscula;
iii. “dígito” si el caracter corresponde a un número;
iv. “otro” para los restantes casos de caracteres.
b. Si el número ingresado es múltiplo de 5 imprima la tabla de
multiplicar del número ingresado. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_10 {
    public static void main (String []args){
        int num = 1;
        char caracter = 'a';


        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        while((num >= 1) && (num<=10)){
            try{
                System.out.println("ingrese un numero entre 1 y 10: ");
                num = Integer.valueOf(entrada.readLine());
       
                
                if((num % 3 == 0)&&((num >= 1) && (num<=10))){
                    caracter = Tipo_de_caracter(caracter);
                    if((caracter >= 'a') && (caracter <= 'z')){
                        System.out.println("letra minuscula");
                    }
                    else if ((caracter >= 'A') && (caracter <= 'Z')){
                        System.out.println("letra mayuscula");
                    }
                    else if ((caracter >= '0') && (caracter <= '9')){
                        System.out.println("digito");
                    }
                    else{
                        System.out.println("otro");
                    }
                }
                else if ((num % 5 == 0)&&((num >= 1) && (num<=10))){
                    imprimirTabla(num);
                }
            }
            catch(Exception exc){
                System.out.println("error");
            }

        }
    }

    public static char Tipo_de_caracter(char caracter){
        char letra = 'a';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("ingrese un caracter : ");
            letra = entrada.readLine().charAt(0);
        }
        catch(Exception exc){
            System.out.println("error");
        }
        return letra;
    }

    public static void imprimirTabla(int num){
        final int MAX = 10;
        for(int numero1 = 0; numero1<=MAX; numero1++){
            System.out.println(num + "*" +numero1+ "=" + num * numero1);
        }
    }

}
