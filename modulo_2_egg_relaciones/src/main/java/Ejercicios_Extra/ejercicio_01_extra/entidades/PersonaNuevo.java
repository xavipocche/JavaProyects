package Ejercicios_Extra.ejercicio_01_extra.entidades;
import java.util.ArrayList;
//Xavier
public class PersonaNuevo {
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer DNI;
    private ArrayList<PerroNuevo> mascota = new ArrayList();

    public PersonaNuevo() {
    }

    public PersonaNuevo(String nombre, String apellido, Integer edad, Integer DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public ArrayList<PerroNuevo> getMascota() {
        return mascota;
    }
    
    public void addPerro(PerroNuevo p){
        this.mascota.add(p);
    }

    @Override
    public String toString() {
        return "PersonaNuevo{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", DNI=" + DNI + ", mascota=" + mascota + '}';
    }

    
}