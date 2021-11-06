package Ejercicio_11;
import java.util.Scanner;
//Xavier
public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        String letra;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        letra = frase.substring(0,1);
        System.out.println(letra);
        if(letra.equals("A") || letra.equals("a")){
            System.out.println("La palabra comienza con (A)");
        }
        else{
            System.out.println("La palabra no comienza con (A)");
        }
    }
}