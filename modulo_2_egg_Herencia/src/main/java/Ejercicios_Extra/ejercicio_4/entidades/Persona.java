package Ejercicios_Extra.ejercicio_4.entidades;
import java.util.Scanner;
/**
 *
 * @author Xavier Pocchettino
 */
public abstract class Persona {
    protected Scanner leer = new Scanner(System.in);
    protected String nombre;
    protected String apellido;
    protected Integer ID;
    protected String estado_civil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer ID, String estado_civil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.estado_civil = estado_civil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }
    
    protected void crearPersona(){
        System.out.println("Ingrese el nombre de la persona:");
        nombre = leer.nextLine();
        nombre = nombre.replace(nombre.substring(0,1), nombre.substring(0,1).toUpperCase());
        System.out.println("Ingrese el apellido de la persona:");
        apellido = leer.nextLine();
        System.out.println("Ingrese el ID de la persona:");
        ID = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el estado civil de la persona:");
        estado_civil = leer.nextLine();
    }

    @Override
    public String toString() {
        return "Persona{nombre=" + nombre + ", apellido=" + apellido + ", ID=" + ID + ", estado_civil=" + estado_civil + '}';
    }
}