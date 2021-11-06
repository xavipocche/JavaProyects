package ejercicio_02;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Xavier Pocchettino
 */

public class ejercicio_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList();
        int cantidad;
        System.out.println("Ingrese la cantidad de números a ingresar:");
        cantidad = leer.nextInt();
        while(cantidad < 0){
            System.out.println("La cantidad debe ser positiva");
            cantidad = leer.nextInt();
        }
        for (int i = 0; i < cantidad; i++) {
            try{
                numeros.add(leer.nextInt());
                numeros.remove(numeros.get(i));
            }catch(IndexOutOfBoundsException e){
                System.err.println("Error en el índice del Array");
            }
        }
    }
}