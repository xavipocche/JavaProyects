package Ejercicios_Extra.ejercicio_4.entidades;

/**
 *
 * @author Xavier Pocchettino
 */
public abstract class Empleados extends Persona {
    private Integer anioDeIncorporacion;
    private Integer numeroDespacho;

    public Empleados() {
    }

    public Empleados(Integer anioDeIncorporacion, Integer numeroDespacho, String nombre, String apellido, Integer ID, String estado_civil) {
        super(nombre, apellido, ID, estado_civil);
        this.anioDeIncorporacion = anioDeIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    @Override
    public void crearPersona() {
        super.crearPersona();
        System.out.println("Ingrese el año de incorporación:");
        anioDeIncorporacion = leer.nextInt();
        System.out.println("Ingrese el número de despacho:");
        numeroDespacho = leer.nextInt();
        leer.nextLine();
    }
    
    public Integer getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(Integer numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleados{" + "anioDeIncorporacion=" + anioDeIncorporacion + ", numeroDespacho=" + numeroDespacho + '}';
    }
}