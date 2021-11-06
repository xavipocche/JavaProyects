package Ejercicio_07;
import java.util.Scanner;
//Xavier
public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Ingrese 2 números e indicaré cual es el mayor:");
        x = leer.nextInt();
        y = leer.nextInt();
        if(x > y ){
            System.out.println(x + " Es mayor que " + y);
        }
        else if(y > x){
            System.out.println(y + " Es mayor que " + x);
        }
        else{
            System.out.println("Los números son iguales");
        }
    }
}