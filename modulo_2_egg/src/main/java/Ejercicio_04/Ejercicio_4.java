package Ejercicio_04;
import java.util.Scanner;
//Xavier
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine();
        frase = frase.toUpperCase();
        System.out.println("Su frase en mayúsculas es: " + frase);
    }
}