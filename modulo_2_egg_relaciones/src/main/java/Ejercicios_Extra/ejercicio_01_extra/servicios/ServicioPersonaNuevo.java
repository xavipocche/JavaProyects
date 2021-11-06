package Ejercicios_Extra.ejercicio_01_extra.servicios;
import Ejercicios_Extra.ejercicio_01_extra.entidades.PersonaNuevo;
import java.util.Scanner;
//Xavier
public class ServicioPersonaNuevo {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public PersonaNuevo crearPersona(){
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el apellido de la persona:");
        String apellido = leer.nextLine();
        System.out.println("Ingrese la edad de la persona:");
        Integer edad = leer.nextInt();
        System.out.println("Ingrese el DNI de la persona:");
        Integer DNI = leer.nextInt();
        leer.nextLine();
        
        return new PersonaNuevo(nombre,apellido,edad,DNI);
    }
}