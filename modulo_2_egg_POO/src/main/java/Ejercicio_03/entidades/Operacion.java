package Ejercicio_03.entidades;
//Xavier
public class Operacion {
    private double numero1;
    private double numero2;

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public double suma(double numero1, double numero2){
        double suma;
        suma = numero1 + numero2;
        return suma;
    }
    public double resta(double numero1, double numero2){
        double resta;
        resta = numero1 - numero2;
        return resta;
    }
    
    public double multiplicar(double numero1, double numero2){
        if(numero1 == 0 || numero2 == 0){
            System.out.println("No se permite la multiplicación por 0");
        }
        else{
            double producto;
            producto = numero1*numero2;
            return producto;
        }
        return 0;
    }
    
    public double dividir(double numero1, double numero2){
        if(numero2 == 0){
            System.out.println("No se puede dividir por 0");
        }
        else{
            double division;
            division = numero1/numero2;
            return division;
        }
        return -1;
    }
}