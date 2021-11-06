package Ejercicio_10;
import java.util.Scanner;
//Xavier
public class Ejercicio_10 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        String frase;
        int largo;
        System.out.println("Ingrese una frase:");
        frase = leer.nextLine();
        largo = frase.length();
        if(largo == 8 ){
            System.out.println("Correcto");
        }
        else{
            System.out.println("Incorrecto");
        } 
    }
}