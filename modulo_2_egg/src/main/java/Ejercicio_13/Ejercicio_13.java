package Ejercicio_13;
import java.util.Scanner;
//Xavier
public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota;
        System.out.println("Ingrese una nota entre 0 y 10");
        nota = leer.nextInt();
        while(nota > 10 || nota<0){
            System.out.println("La nota ingresada debe ser entre 0 y 10");
            nota = leer.nextInt();
        }
        System.out.println("La nota ingresada es: " + nota);
    }
}
