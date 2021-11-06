package Ejercicio_15;
import java.util.Scanner;
//Xavier
public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double x;
        double y;
        int opcion;
        String opcion_2 = "N";
        System.out.println("Ingrese 2 números:");
        x = leer.nextDouble();
        y = leer.nextDouble();
        System.out.println("A continuación ingrese la operación a realizar con los números");
        
        while(opcion_2.equals("N")){
            System.out.println("Presione (1) Para Sumar");
            System.out.println("Presione (2) Para Restar");
            System.out.println("Presione (3) Para Multiplicar");
            System.out.println("Presione (4) Para Dividir");
            System.out.println("Presione (5) Para Salir");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("La suma de los números es: " + (x+y));
                    break;
                case 2:
                    System.out.println("La resta de los números es: " + (x-y));
                    break;
                case 3:
                    System.out.println("La multiplicación de los números es: " + (x*y));
                    break;
                case 4:
                    if(y != 0){
                        System.out.println("La división de los números es: " + (x/y));
                    }
                    else{
                        System.out.println("No es posible dividir por 0");
                    }
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir? S/N");
                    leer.nextLine();
                    opcion_2 = leer.nextLine().toUpperCase();
                    while(!opcion_2.equals("N") && !opcion_2.equals("S")){
                        System.out.println("Ingrese opción válida (S) o (N)");
                        opcion_2 = leer.nextLine().toUpperCase();
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}