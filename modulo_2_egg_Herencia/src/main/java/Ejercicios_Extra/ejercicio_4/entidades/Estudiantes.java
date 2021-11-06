package Ejercicios_Extra.ejercicio_4.entidades;

/**
 *
 * @author Xavier Pocchettino
 */
public final class Estudiantes extends Persona {
    private String curso;

    public Estudiantes() {
    }

    public Estudiantes(String curso, String nombre, String apellido, Integer ID, String estado_civil) {
        super(nombre, apellido, ID, estado_civil);
        this.curso = curso;
    }

    @Override
    public void crearPersona() {
        super.crearPersona();
        System.out.println("Ingrese el curso al que pertenece el estudiante:");
        curso = leer.nextLine();
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "Estudiantes{" + "curso=" + curso + '}';
    }
    
    
}