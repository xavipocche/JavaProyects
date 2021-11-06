package Ejercicio_20;
import java.util.Scanner;
//Xavier
public class Ejercicio_20 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 4 números:");
        int n;
        for(int i=0; i<4; i++){
            n = leer.nextInt();
            System.out.print(n + " ");
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
