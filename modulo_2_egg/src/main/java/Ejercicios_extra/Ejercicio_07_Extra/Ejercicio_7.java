package Ejercicios_extra.Ejercicio_07_Extra;
import java.util.Scanner;
//Xavier
public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        double suma;
        double num;
        int n;
        suma = 0;
        System.out.println("Ingrese la cantidad de números a ingresar:");
        do{    
            n = leer.nextInt();
            if(n <= 0){
            System.out.println("LA CANTIDAD NO PUEDE SER MENOR O IGUAL A 0");
            }
        }while(n <= 0);
        System.out.println("Ingrese números mayores a 0");
        do{
            num = leer.nextInt();
            if(num <= 0){
                System.out.println("DEBE INGRESAR NÚMEROS MAYORES A 0");
            }
        }while(num <= 0);
        double max = num;
        double min = num;
        suma = suma + num;
        contador = contador + 1;
        while(contador != n){
            num = leer.nextInt();
            if(num > 0){
                if(num>max){
                    max = num;
                    suma = suma + num;
                    contador = contador + 1;
                }
                else if(num<min){
                    min = num;
                    suma = suma + num;
                    contador = contador + 1;
                }
                else{
                    suma = suma + num;
                    contador = contador + 1;
                }
            }
        }
        System.out.println("El número mayor ingresado es: " + max);
        System.out.println("El número menor ingresado es: " + min);
        System.out.println("El promedio de los números ingresados es: " + (suma/n));
    }
}