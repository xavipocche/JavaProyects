package Ejercicios_Extra.ejercicio_1.entidades;

/**
 *
 * @author Xavier Pocchettino
 */
public final class Barcos_a_motor extends Barcos {
    private Integer potencia;

    public Barcos_a_motor() {
    }

    public Barcos_a_motor(Integer potencia, Integer matricula, Integer eslora, Integer aniofabricacion) {
        super(matricula, eslora, aniofabricacion);
        this.potencia = potencia;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }
    
    public void crearBarcoaMotor(Double random){ //SUPERSETTER
        crearBarco(random);
        System.out.println("Ingrese la potencia del barco en CV:");
        potencia = random.intValue();
    }
    
    @Override
    public double calcularPrecio(Alquiler alquiler){
        alquiler.setPrecioAlquiler(super.calcularPrecio(alquiler) + getPotencia());
        
        return alquiler.getPrecioAlquiler();
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + "Barcos_a_motor{" + "potencia=" + potencia + '}';
    }
}