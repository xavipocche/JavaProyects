package Ejercicios_extra.Ejercicio_03_Extra;
import java.util.Scanner;
//Xavier
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        System.out.println("Ingrese una letra e indicaré si es una vocal:");
        letra = leer.nextLine();
        letra = letra.toUpperCase();
        if(letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")){
            System.out.println("La letra ingresada es una vocal");
        }
        else{
            System.out.println("La letra ingresada no es una vocal");
        }      
    }
}
