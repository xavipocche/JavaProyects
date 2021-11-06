package Ejercicios_extra.Ejercicio_11_Extra;
import java.util.Scanner;
//Xavier
public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        System.out.println("Ingrese un número e indicaré la cantidad de dígitos que tiene:");
        int num = leer.nextInt();
        do{
            num = num/10;
            contador = contador + 1;
        
        }while(num>0);
        System.out.println("La cantidad de dígitos del números ingresado es: " + contador);
    }
}