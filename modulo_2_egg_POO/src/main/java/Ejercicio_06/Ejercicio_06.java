package Ejercicio_06;
import java.util.Scanner;
import Ejercicio_06.entidades.Cafetera;
import Ejercicio_06.servicios.ServicioCafetera;
//Xavier
public class Ejercicio_06 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioCafetera s = new ServicioCafetera();
        Cafetera c = s.crearCafetera();

        System.out.println("Agregue algo de café a la cafetera:");
        c.agregarCafe(leer.nextInt());
        System.out.println("La cantidad de café es: " + c.getCantidadActual());
        System.out.println("Ingrese la capacidad de la taza en la que va a servir:");
        c.servirTaza(leer.nextInt());
        System.out.println("La cantidad de café es: " + c.getCantidadActual());
        c.llenarCafetera();
        System.out.println("La cantidad de café es (lleno cafetera): " + c.getCantidadActual());
        c.vaciarCafetera();
        System.out.println("La cantidad de café es (vacio cafetera): " + c.getCantidadActual());
    }   
}