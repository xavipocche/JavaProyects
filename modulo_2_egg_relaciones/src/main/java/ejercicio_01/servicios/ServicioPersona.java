package ejercicio_01.servicios;
import ejercicio_01.entidades.Persona;
import java.util.Scanner;
//Xavier
public class ServicioPersona {
    private Scanner leer = new Scanner(System.in);
    private PerroService ps = new PerroService();
    
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el apellido de la persona:");
        String apellido = leer.nextLine();
        System.out.println("Ingrese la edad de la persona:");
        Integer edad = leer.nextInt();
        System.out.println("Ingrese el DNI de la persona:");
        Integer DNI = leer.nextInt();
        leer.nextLine();
        
        return new Persona(nombre,apellido,edad,DNI,ps.crearPerro());
    }
    
    
}