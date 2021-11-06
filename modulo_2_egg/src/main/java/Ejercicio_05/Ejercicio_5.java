package Ejercicio_05;
import java.util.Scanner;
//Xavier
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int t;
        float t_f;
        System.out.println("Ingrese una temperatura: ");
        t = leer.nextInt();
        t_f = 32 + (9*t/5);
        System.out.println("La temperatura en Faremheit es: " + t_f);
    }
}