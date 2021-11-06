package Ejercicio_19;
import java.util.Scanner;
//Xavier
public class Ejercicio_19 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int lado;
        System.out.println("Ingrese el lado del cuadrado:");
        lado = leer.nextInt();
        for(int i=0; i<lado; i++){
            System.out.print("*");
        }
        System.out.println("");
        for(int i=0; i<lado-2;i++){
            System.out.print("*");
            for(int j=0; j<lado-2;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
        for(int i=0; i<lado; i++){
            System.out.print("*");
        }   
    }
}
