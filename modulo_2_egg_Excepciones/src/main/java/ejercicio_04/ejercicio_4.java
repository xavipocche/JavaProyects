package ejercicio_04;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Xavier Pocchettino
 */

public class ejercicio_4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        Integer adivinar = (int) (Math.random()*500)+1;
        int numero_ingresado = 0;
        //System.out.println(adivinar);
        System.out.println("Adivine el número:");
        do {
            try{
                numero_ingresado = leer.nextInt();
                contador ++;
                if(numero_ingresado < adivinar){
                    System.out.println("El número a adivinar es mayor");
                }
                else if(numero_ingresado > adivinar){
                    System.out.println("El número a adivinar es menor");
                }
            }catch(InputMismatchException e){
                System.out.println("Ingresó texto en lugar de un número");
                contador ++;
                leer.nextLine();
            }
        } while (numero_ingresado != adivinar);
        
        System.out.println("Logró adivinar el número en " + contador + " intendos");
    }
}