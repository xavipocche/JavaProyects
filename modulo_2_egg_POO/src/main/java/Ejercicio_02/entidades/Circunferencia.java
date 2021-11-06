package Ejercicio_02.entidades;
//Xavier
public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia(double radio){
        if(radio > 0){
        this.radio = radio;
        }
        else{
            System.out.println("El radio no puede ser 0");
        }
    }
    
    public double area(double radio){
        double sup;
        sup = 3.141592653589793*radio*radio;
        return sup;
    }
    
    public double perimetro(double radio){
        double perimetro;
        perimetro = 2*3.141592653589793*radio;
        return perimetro;
    }


}