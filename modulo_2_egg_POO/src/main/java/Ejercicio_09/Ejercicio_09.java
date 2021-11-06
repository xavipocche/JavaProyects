package Ejercicio_09;
import Ejercicio_09.entidades.Matematica;
//Xavier
public class Ejercicio_09 {
    public static void main(String[] args) {
        Matematica operacion = new Matematica();
        
        operacion.setNum_1((double)(Math.random()*100));
        operacion.setNum_2((double)(Math.random()*100));
        
        System.out.println("El primer número es: " + operacion.getNum_1());
        System.out.println("El segundo número es: " + operacion.getNum_2());
        
        System.out.println("El mayor número es: " + operacion.devolverMayor());
        System.out.println("El número mayor elevado al menor es: " + operacion.calcularPOtencia());
        System.out.println("La raíz cuadrada del número menor es: " + operacion.calcularRaiz());
    }

}
