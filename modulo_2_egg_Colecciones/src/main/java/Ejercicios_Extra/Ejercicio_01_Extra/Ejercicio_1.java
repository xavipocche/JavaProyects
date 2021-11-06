package Ejercicios_Extra.Ejercicio_01_Extra;
import java.util.Scanner;
import java.util.ArrayList;
//Xavier
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList();
        
        
        System.out.println("Ingrese números, ingrese -99 para finalizar:");
        int num;
        do {
            num = leer.nextInt();
            numeros.add(num);
        } while (num != -99);
        numeros.remove(numeros.size()-1);
        
        int suma = 0;
        int contador = 0;
        for (Integer aux : numeros) {
            System.out.print("[" + aux + "]");
            suma += aux;
            contador += 1;
        }
        System.out.println("\n");
        double promedio = (double) suma/contador ;
        
        System.out.println("La cantidad de números ingresados es: " + contador);
        System.out.println("La suma de todos los números ingresados es: " + suma);
        System.out.println("El promedio de todos los números ingresados es: " + promedio);
    }
}