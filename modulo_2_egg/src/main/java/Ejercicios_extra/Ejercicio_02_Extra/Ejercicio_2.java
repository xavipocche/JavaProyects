package Ejercicios_extra.Ejercicio_02_Extra;
import java.util.Scanner;
//Xavier
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int A;
        int B;
        int C;
        int D;
        int aux;
        System.out.println("Ingrese valores diferentes y los cambiaré:");
        A = leer.nextInt();
        B = leer.nextInt();
        C = leer.nextInt();
        D = leer.nextInt();
        //cambio de valores
        aux = A;
        A = D;
        D = B;
        B = C;
        C = aux;
        System.out.println("Los valores cambiados son:");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);   
    }
}