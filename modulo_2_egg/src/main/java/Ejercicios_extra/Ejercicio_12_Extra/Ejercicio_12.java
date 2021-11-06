package Ejercicios_extra.Ejercicio_12_Extra;
import java.util.Scanner;
//Xavier
public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera:");
        int n = leer.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}