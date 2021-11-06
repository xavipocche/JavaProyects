package Ejercicio_02;
import Ejercicio_02.entidades.Circunferencia;
import java.util.Scanner;
//Xavier
public class Ejercicio_02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Circunferencia c = new Circunferencia(0); // Creo el objeto c de la clase Circunferencia
        
        System.out.println("Ingrese el radio de la circunferencia:");
        double radio = leer.nextDouble();
        
        c.crearCircunferencia(radio); // Asigno con el método crearCircunferencia el atributo radio del objeto c
        
        System.out.println("El radio de la circunferencia es: " + c.getRadio());// Imprimo por pantalla el radio con un get
        System.out.println("El área de la circuferencia es: " + c.area(radio)); // Calculo radio y perimetro con los métodos
        System.out.println("El perímetro de la circuferencia es: " + c.perimetro(radio));
    }
}
