package Ejercicio_03;
import Ejercicio_03.entidades.Operacion;
import java.util.Scanner;
//Xavier
public class Ejercicio_03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");
        double numero1 = leer.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double numero2 = leer.nextDouble();
        
        //cuentas.crearOperacion(numero1, numero2); // Doy valor a los atributos del objeto cuentas mediante el método crearOperacion (Supersetter)
        Operacion cuentas = new Operacion(numero1,numero2); // Creo el objeto cuentas de la clase Operacion con el constructor que recibe todos los parámetros
        
        // Imprimo los atributos mediante un get
        
        System.out.println("El primer número ingresado es: " + cuentas.getNumero1());
        System.out.println("El segundo número ingresado es: " + cuentas.getNumero2());
        System.out.println("");
        
        // Utilizo métodos para realizar operaciones con los números
        
        System.out.println("La suma de los números es: " + cuentas.suma(cuentas.getNumero1(), cuentas.getNumero2()));
        System.out.println("La resta de los números es: " + cuentas.resta(cuentas.getNumero1(), cuentas.getNumero2()));
        if(cuentas.multiplicar(numero1, numero2) != 0){
        System.out.println("La multiplicación de los números es: " + cuentas.multiplicar(cuentas.getNumero1(), cuentas.getNumero2()));
        }
        if(cuentas.dividir(numero1, numero2) != -1){
        System.out.println("La división de los números es: " + cuentas.dividir(cuentas.getNumero1(), cuentas.getNumero2()));
        }
    }
}