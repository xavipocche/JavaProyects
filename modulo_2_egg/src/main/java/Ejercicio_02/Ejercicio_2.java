package Ejercicio_02;
import java.util.Scanner;
//Xavier
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números: ");
        int numero = leer.nextInt();
        int numero_2 = leer.nextInt();
        int resultado = numero + numero_2;
        System.out.println("La suma de los números es: " + resultado);
    }
}