package Ejercicio_14;
import java.util.Scanner;
//Xavier
public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite;
        int suma;
        int n;
        suma = 0;
        System.out.println("Ingrese un límite:");
        limite = leer.nextInt();
        System.out.println("Ingrese un número, lo sumaré hasta que superen el límite:");
        while(suma <= limite){
            n = leer.nextInt();
            suma += n;
        } 
    }
}
