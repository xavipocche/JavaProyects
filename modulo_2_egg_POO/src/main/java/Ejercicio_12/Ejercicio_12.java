package Ejercicio_12;
import java.util.Scanner;
import Ejercicio_12.entidades.Persona_2;
//Xavier

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona_2 p1 = new Persona_2(); //Creo un objeto de la clase persona
        
        p1.crearPersona(); //Creo una persona, asignándole valores a sus atributos
        
        System.out.println("Su edad es: " + p1.calcularEdad());
        System.out.println("Ingrese otra edad y la compararemos con la suya");
        System.out.println(p1.menorQue(leer.nextInt()));
        System.out.println(p1.mostrarPersona());
    }

}
