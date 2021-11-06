package Ejercicios_extra.Ejercicio_05_Extra;
import java.util.Scanner;
//Xavier
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de socio:");
        String socio = leer.nextLine().toUpperCase();
        if(socio.equals("A") || socio.equals("B") || socio.equals("C")){
            System.out.println("Ingrese el monto del tratamiento:");
            double monto = leer.nextDouble();
            if(socio.equals("A")){
                System.out.println("El monto sin descuento es: " + monto);
                System.out.println("El monto por ser socio " + socio + " es: " + (monto-(monto*0.5) + "$"));
            }
            else if(socio.equals("B")){
                System.out.println("El monto sin descuento es: " + monto);
                System.out.println("El monto por ser socio " + socio + " es: " + (monto-(monto*0.35) + "$"));
            }
            else if(socio.equals("C")){
                System.out.println("El monto por ser socio " + socio + " es: " + monto + "$");
            }
        }
        else{
            System.out.println("La opción ingresada no corresponde a ningún tipo de socio");
        }
    
    }   

}
