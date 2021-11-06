package Ejercicio_10;
import java.util.Arrays;
//Xavier

public class Ejercicio_10 {
    public static void main(String[] args) {
        double array_1 [] = new double[50];
        double array_2 [] = new double[20];
        
        rellenar_array(array_1);
        
        Arrays.sort(array_1); //Ordeno el array_1
        array_2 = Arrays.copyOf(array_1, 20); //Agrego los primeros 10 elementos del array_1 al array_2
        Arrays.fill(array_2, 10, 20, 0.5); //Los 10 elementos que faltan del array_2 los releno con 0.5
        
        imprimir_array(array_1);
        imprimir_array(array_2);
    }
    
    public static void rellenar_array(double array[]){
        for (int i = 0; i < array.length; i++) {
            array[i] = (double)(Math.random()*10 ); 
        }
    }
    
    public static void imprimir_array(double array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println("");
    }
}