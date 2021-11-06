package Ejercicios_extra.Ejercicio_14_Extra;
import java.util.Scanner;
//Xavier
public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números:");
        double num_1 = leer.nextInt();
        double num_2 = leer.nextInt();
        System.out.println("Ingrese 1 para sumar");
        System.out.println("Ingrese 2 para restar");
        System.out.println("Ingrese 3 para multiplicar");
        System.out.println("Ingrese 4 para dividir");
        int opcion = leer.nextInt();
        switch(opcion){
            case 1:
                System.out.println("La suma de los números es: " + suma(num_1,num_2));
                break;
            case 2:
                System.out.println("La resta de los números es: " + resta(num_1,num_2));
                break;
            case 3:
                System.out.println("La multiplicación de los números es: " + multiplicacion(num_1,num_2));
                break;
            case 4:
                if(num_2 != 0){
                    System.out.println("La división de los números es: " + division(num_1,num_2));
                }
                else{
                    System.out.println("NO ES POSIBLE DIVIDIR POR 0");
                }
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }        
    }
public static double suma(double a, double b){
    double c = (a+b);
    return c;
}
public static double resta(double a, double b){
    double c = (a-b);
    return c;
}
public static double multiplicacion(double a, double b){
    double c = (a*b);
    return c;
}
public static double division(double a, double b){
    double c = (a/b);
    return c;
}
}