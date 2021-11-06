package Ejercicio_04.entidades;
//Xavier
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }    

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double Superficie(double base, double altura){
        double sup;
        sup = (base*altura);
        return sup;
    }
    
    public double Perimetro(double base, double altura){
        double perimetro;
        perimetro = (base+altura)*2;
        return perimetro;
    }
    
    public void printRect(double base, double altura){
        for (int i = 0; i < base; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i < altura-2; i++) {
            System.out.print("*");
            for (int j = 0; j < base-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < base; i++) {
            System.out.print("*");
        }
    }
}