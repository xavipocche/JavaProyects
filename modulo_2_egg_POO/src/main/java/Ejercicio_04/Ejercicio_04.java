package Ejercicio_04;
import Ejercicio_04.entidades.Rectangulo;
import java.util.Scanner;
//Xavier
public class Ejercicio_04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la base del rectángulo:");
        double base = leer.nextDouble();
        while(base <= 0){
            System.out.println("La base debe ser mayor a 0");
            base = leer.nextDouble();
        }
        System.out.println("Ingrese la altura del rectángulo:");
        double altura = leer.nextDouble();
        while(altura <= 0){
            System.out.println("La altura debe ser mayor a 0");
            altura = leer.nextDouble();
        }
        
        //rectangulo.crearRectangulo(base, altura); // Doy valor a los atributos del objeto con el método crearRectangulo (Supersetter)
        Rectangulo rectangulo = new Rectangulo(base,altura); // Creo el objeto rectangulo de la clase Rectangulo con el constructor
        
        // Realizo operaciones con distintos métodos
        
        System.out.println("El área del rectángulo es: " + rectangulo.Superficie(rectangulo.getBase(), rectangulo.getAltura()));
        System.out.println("El perímetro del rectángulo es: " + rectangulo.Perimetro(rectangulo.getBase(), rectangulo.getAltura()));
        System.out.println("El rectángulo impreso es:");
        rectangulo.printRect(rectangulo.getBase(), rectangulo.getAltura());
    }
}