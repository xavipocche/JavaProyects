package Ejercicios_Extra.ejercicio_1.entidades;
import java.util.Scanner;
/**
 *
 * @author Xavier Pocchettino
 */
public abstract class Barcos {
    protected String nombre;
    protected Scanner leer = new Scanner(System.in);
    protected Integer matricula;
    protected Integer eslora;
    protected Integer aniofabricacion;
    protected boolean Alquilado = false;

    public Barcos() {
    }

    public Barcos(Integer matricula, Integer eslora, Integer aniofabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.aniofabricacion = aniofabricacion;
    }

    public boolean isAlquilado() {
        return Alquilado;
    }

    public void setAlquilado(boolean isAlquilado) {
        this.Alquilado = isAlquilado;
    }
    
    protected void crearBarco(Double random){ //SUPERSETTER
        System.out.println("Ingrese la matrícula del barco:");
        matricula = random.intValue();
        System.out.println("Ingrese el tamaño en metros de la eslora:");
        eslora = random.intValue();
        System.out.println("Ingrese el año de fabricación:");
        aniofabricacion = random.intValue();
    }
    
    public double calcularPrecio(Alquiler alquiler){
        long fechaInicialMs = alquiler.getFecha_alquiler().getTime();
        long fechaFinalMs = alquiler.getFecha_devolucion().getTime();
        long diferencia = fechaFinalMs - fechaInicialMs;
        double dias = Math.floor(diferencia / (1000 * 60 * 60 * 24));
        double precio = dias*eslora*10;
        
        return precio;
    }

    @Override
    public String toString() {
        return "Barcos{" + "matricula=" + matricula + ", eslora=" + eslora + "m" + ", aniofabricacion=" + aniofabricacion + '}';
    }
}