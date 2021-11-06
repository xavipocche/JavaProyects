package Ejercicio_21;
import java.util.Scanner;
//Xavier
public class Ejercicio_21 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        float valor;
        System.out.println("Ingrese el monto en euros a convertir:");
        valor = leer.nextInt();
        System.out.println("Ingrese (1) para convertirlos a Dólares, (2) a Libras o (3) a Yenes");
        int opcion = leer.nextInt();
        conversor(valor,opcion);
    }
public static void conversor(float a,int opcion){
    switch(opcion){
        case 1:
            System.out.println("La conversión a dólares es: " + (a*1.28611) + " USD");
            break;
        case 2:
            System.out.println("La conversión a Libras es: " + (a*0.86) + " L");
            break;
        case 3:
            System.out.println("La conversión a Yenes es: " + (a*129.852) + " Y");
            break;
        default:
            System.out.println("Opción no válida");
            break;
    }  
    }
}