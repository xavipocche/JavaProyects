package Ejercicios_Extra.ejercicio_4.entidades;

/**
 *
 * @author Xavier Pocchettino
 */
public final class Profesores extends Empleados {
    private String departamento;

    public Profesores() {
    }

    public Profesores(String departamento, Integer anioDeIncorporacion, Integer numeroDespacho, String nombre, String apellido, Integer ID, String estado_civil) {
        super(anioDeIncorporacion, numeroDespacho, nombre, apellido, ID, estado_civil);
        this.departamento = departamento;
    }

    @Override
    public void crearPersona() {
        super.crearPersona();
        System.out.println("Ingrese el departamento al que pertenece el Profesor:");
        departamento = leer.nextLine();
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesores{" + "departamento=" + departamento + '}';
    }
    
}