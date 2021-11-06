package Ejercicio_03.servicios;
import java.util.Scanner;
import Ejercicio_03.entidades.Alumno;
//Xavier
public class ServicioAlumno {
    private Scanner leer = new Scanner(System.in);
    
    public Alumno crearAlumno(){
        System.out.println("Ingrese el nombre del alumno:");
        String nombre = leer.next();
        
        return new Alumno(nombre);
    }
}