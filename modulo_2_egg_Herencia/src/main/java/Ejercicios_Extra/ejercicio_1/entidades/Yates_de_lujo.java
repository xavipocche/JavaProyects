package Ejercicios_Extra.ejercicio_1.entidades;

/**
 *
 * @author Xavier Pocchettino
 */
public final class Yates_de_lujo extends Barcos {
    private Integer potencia;
    private Integer n_camarotes;

    public Yates_de_lujo() {
    }

    public Yates_de_lujo(Integer potencia, Integer n_camarotes, Integer matricula, Integer eslora, Integer aniofabricacion) {
        super(matricula, eslora, aniofabricacion);
        this.potencia = potencia;
        this.n_camarotes = n_camarotes;
    }

    public Integer getPotencia() {
        return potencia;
    }
    
    public Integer getN_camarotes() {
        return n_camarotes;
    }

    public void crearYate(Double random){ //SUPERSETTER
        crearBarco(random);
        System.out.println("Ingrese la potencia en CV del yate:");
        potencia = random.intValue();
        System.out.println("Ingrese el número de camarotes del yate:");
        n_camarotes = random.intValue();
    }
    
    @Override
    public double calcularPrecio(Alquiler alquiler){
        alquiler.setPrecioAlquiler(super.calcularPrecio(alquiler) + getPotencia() + getN_camarotes());
        
        return alquiler.getPrecioAlquiler();
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + "Yates_de_lujo{" + "potencia=" + potencia + ", n_camarotes=" + n_camarotes + '}';
    }
}