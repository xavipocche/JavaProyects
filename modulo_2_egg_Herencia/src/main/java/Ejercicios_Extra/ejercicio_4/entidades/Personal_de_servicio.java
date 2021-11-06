package Ejercicios_Extra.ejercicio_4.entidades;

/**
 *
 * @author Xavier Pocchettino
 */
public final class Personal_de_servicio extends Empleados {
    private String seccion;

    public Personal_de_servicio() {
    }

    public Personal_de_servicio(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public void crearPersona() {
        super.crearPersona();
        System.out.println("Ingrese la sección a la que pertence el personal:");
        seccion = leer.nextLine();
    }
    
    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() + "Personal_de_servicio{" + "seccion=" + seccion + '}';
    }
}