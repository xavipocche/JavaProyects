package Ejercicios_extra.Ejercicio_10_Extra;
import java.util.Scanner;
//Xavier
public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int producto = (int)(Math.random()*10)*(int)(Math.random()*10);
        int opcion;
        System.out.println("Adivine el producto de 2 números aleatorios entre 0 y 10");
        do{
            opcion = leer.nextInt();
        }while(opcion!=producto);
        System.out.println("Adivinó el producto!!!");
    }
}
