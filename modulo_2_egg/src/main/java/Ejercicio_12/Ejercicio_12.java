package Ejercicio_12;
import java.util.Scanner;
//Xavier
public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int motor;
        System.out.println("Ingrese un número entre 1 y 4 e indicaré el tipo de motor");
        motor = leer.nextInt();
        switch(motor){
            case(1):
                System.out.println("La bomba es una bomba de agua");
                break;
            case(2):
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case(3):
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case(4):
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para el tipo de bomba");
                break;
        }
    }
}