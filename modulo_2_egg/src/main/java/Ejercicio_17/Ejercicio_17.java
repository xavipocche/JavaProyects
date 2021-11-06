package Ejercicio_17;
import java.util.Scanner;
//Xavier
public class Ejercicio_17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String fde = "&&&&&";
        String frase;
        int largo;
        int correctas;
        int incorrectas;
        correctas = 0;
        incorrectas = 0;
        do{
            System.out.println("Ingrese una frase de 5 caracteres que comience con (X) y finalice con (O):");
            frase = leer.nextLine();
            largo = frase.length();
            if(largo == 5 ){
                if(frase.substring(0,1).toUpperCase().equals("X") & frase.substring(4,5).toUpperCase().equals("O")){
                    correctas = correctas + 1;
                }
            }
            else if(!frase.equals(fde)){
                incorrectas = incorrectas + 1;
            }
        } while(!frase.equals(fde));
        System.out.println("Las palabras ingresadas correctamente fueron: " + correctas);
        System.out.println("Las palabras ingresadas incorrectas fueron: " + incorrectas);
    }
}
