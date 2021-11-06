package Ejercicios_Extra.ejercicio_01_extra.servicios;
import Ejercicios_Extra.ejercicio_01_extra.entidades.PerroNuevo;
import java.util.Scanner;
//Xavier
public class ServicioPerro {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public PerroNuevo crearPerro(){
        System.out.println("Ingrese el nombre del perro:");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la raza del perro:");
        String raza = leer.nextLine();
        System.out.println("Ingrese la edad del perro:");
        Integer edad = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el tamaño del perro:");
        String tamanio = leer.nextLine();
        
        return new PerroNuevo(nombre,raza,edad,tamanio,false);
    }
}