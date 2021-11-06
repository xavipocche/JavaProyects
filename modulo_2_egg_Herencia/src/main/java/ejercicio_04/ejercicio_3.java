package ejercicio_04;

import java.util.Scanner;
import ejercicio_04.entidades.Circulo;
import ejercicio_04.entidades.Rectangulo;

/**
 * @author Xavier Pocchettino
 */

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese base y altura del rectángulo:");
        Rectangulo r = new Rectangulo(leer.nextDouble(),leer.nextDouble());
        System.out.println("Ingrese el radio del circulo");
        Circulo c = new Circulo(leer.nextDouble());
        
        System.out.println("El perímetro del rectángulo es:");
        System.out.println(r.calcularPerimetro());
        System.out.println("El área del rectángulo es:");
        System.out.println(r.calcularArea());
        System.out.println("\n");
        System.out.println("El perímetro del círculo es:");
        System.out.println(c.calcularPerimetro());
        System.out.println("El área del círculo es:");
        System.out.println(c.calcularArea());
    }

}