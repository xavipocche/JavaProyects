package ejercicio_04.entidades;

import ejercicio_04.interfaces.calculosFormas;

/**
 *
 * @author Xavier Pocchettino
 */
public final class Circulo implements calculosFormas {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularPerimetro() {
        double perimetro = pi*radio*2;
        
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double area = pi*Math.pow(radio, 2);
        
        return area;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
}