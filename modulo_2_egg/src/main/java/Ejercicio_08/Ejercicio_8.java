package Ejercicio_08;
import java.util.Scanner;
//Xavier
public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese un número e indicaré si es par o impar:");
        n = leer.nextInt();
        if (n % 2 == 0){
            System.out.println("El número ingresado es par");
        }
        else{
            System.out.println("El número ingresado es impar");
        }
    }
}