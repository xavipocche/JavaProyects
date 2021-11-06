package Ejercicio_06;
import java.util.Scanner;
//Xavier
public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese un número: ");
        n = leer.nextInt();
        System.out.println("El doble del número ingresado es: " + 2*n);
        System.out.println("El triple del número ingresado es: " + 3*n);
        System.out.println("La raíz cuadrada del número ingresado es: " + Math.sqrt(n));
    }
}