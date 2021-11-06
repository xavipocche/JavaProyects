package ejercicio_01.entidades;
//Xavier
public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer DNI;
    private Perro mascota;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer DNI, Perro mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.mascota = mascota;
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

    public Perro getMascota() {
        return mascota;
    }

    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", DNI=" + DNI + ", mascota=" + mascota + '}';
    }
    
}