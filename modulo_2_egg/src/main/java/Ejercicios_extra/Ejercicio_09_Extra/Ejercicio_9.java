package Ejercicios_extra.Ejercicio_09_Extra;
import java.util.Scanner;
//Xavier
public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dividendo;
        int divisor;
        int restas = 0;
        int resto;
        System.out.println("Ingrese el dividendo de la división:");
        dividendo = leer.nextInt();
        resto = dividendo;
        System.out.println("Ingrese el divisor:");
        divisor = leer.nextInt();
        do{
            resto = resto - divisor;
            restas = restas + 1;        
        }while(resto>=divisor);
        System.out.println("El cociente de la división es: " + restas);
        System.out.println("El resto de la división es: " + resto);
    }
}
