package Ejercicios_Extra.ejercicio_1.entidades;

/**
 *
 * @author Xavier Pocchettino
 */
public final class Veleros extends Barcos {
    private Integer mastiles;

    public Veleros() {
    }

    public Veleros(Integer mastiles, Integer matricula, Integer eslora, Integer aniofabricacion) {
        super(matricula, eslora, aniofabricacion);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }

    public void crearVelero(Double random){ //SUPERSETTER
        crearBarco(random);
        System.out.println("Ingrese la cantidad de mástiles:");
        mastiles = random.intValue();
    }
    
    @Override
    public double calcularPrecio(Alquiler alquiler){
        alquiler.setPrecioAlquiler(super.calcularPrecio(alquiler) + getMastiles());
        
        return alquiler.getPrecioAlquiler();
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Veleros{" + "mastiles=" + mastiles + '}';
    }
}