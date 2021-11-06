package Ejercicio_09.entidades;
//Xavier
public class Matematica {
    private double num_1;
    private double num_2;

    public Matematica() {
    }

    public Matematica(double num_1, double num_2) {
        this.num_1 = num_1;
        this.num_2 = num_2;
    }

    public double getNum_1() {
        return num_1;
    }

    public void setNum_1(double num_1) {
        this.num_1 = num_1;
    }

    public double getNum_2() {
        return num_2;
    }

    public void setNum_2(double num_2) {
        this.num_2 = num_2;
    }
    
    public double devolverMayor(){
        double mayor = Math.max(num_1, num_2);
        
        return mayor;
    }
    
    public double calcularPOtencia(){
        double mayor = Math.round(Math.max(num_1, num_2));
        double menor = Math.round(Math.min(num_1, num_2));
        double potencia = Math.pow(mayor, menor);
        
        return potencia;
    }
    
    public double calcularRaiz(){
        double menor = Math.min(num_1, num_2);
        double raiz = Math.sqrt(menor);
        
        return raiz;
    }
}