package Ejercicios_Extra.Ejercicio_07_Extra.entidades;
import java.util.Scanner;
//Xavier
public class Fraccion {
    private Scanner leer = new Scanner(System.in);
    private int numerador;
    private int denominador;

    public Fraccion() {
    }
    
    public void superSet(){
        System.out.println("Ingrese el numerador de la fracción");
        this.numerador = leer.nextInt();
        System.out.println("Ingrese el denominador de la fracción");
        this.denominador = leer.nextInt();
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }
}
