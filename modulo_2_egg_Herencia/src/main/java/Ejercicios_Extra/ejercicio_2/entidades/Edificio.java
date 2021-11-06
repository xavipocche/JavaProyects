package Ejercicios_Extra.ejercicio_2.entidades;
import java.util.Scanner;
/**
 *
 * @author Xavier Pocchettino
 */
public abstract class Edificio {
    protected Scanner leer = new Scanner(System.in);
    protected Double largo;
    protected Double alto;
    protected Double ancho;

    public Edificio() {
    }

    public Edificio(Double largo, Double alto, Double ancho) {
        this.largo = largo;
        this.alto = alto;
        this.ancho = ancho;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }
    
    public abstract double calcularSuperficie();
    public abstract double calcularVolumen();
    
    protected void crearEdificio(){
        System.out.println("Ingrese el largo del edificio:");
        setLargo(leer.nextDouble());
        while(getLargo() <= 0){
            System.out.println("Debe ingresar una cantidad mayor a 0");
            setLargo(leer.nextDouble());
        }
        System.out.println("Ingrese el ancho del edificio:");
        setAncho(leer.nextDouble());
        while(getAncho() <= 0){
            System.out.println("Debe ingresar una cantidad mayor a 0");
            setAncho(leer.nextDouble());
        }
        System.out.println("Ingrese el alto del edificio:");
        setAlto(leer.nextDouble());
        leer.nextLine();
        while(getAlto() <= 0){
            System.out.println("Debe ingresar una cantidad mayor a 0");
            setAlto(leer.nextDouble());
            leer.nextLine();
        }
    }

    @Override
    public String toString() {
        return "Edificio{" + "largo=" + largo + ", alto=" + alto + ", ancho=" + ancho + '}';
    }
}