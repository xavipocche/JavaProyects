package Ejercicios_extra.Ejercicio_06_Extra;
import java.util.Scanner;
//Xavier
public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas:");
        int cantidad = leer.nextInt();
        int contador_menor;
        double suma;
        double suma_menor;
        contador_menor = 0;
        suma = 0;
        suma_menor = 0;
        System.out.println("Ingrese " + cantidad + " alturas:");
        for (int i = 0; i < cantidad; i++) {
            double altura = leer.nextDouble();
            if(altura < 1.6){
                suma_menor = suma_menor + altura;
                suma = suma + altura;
                contador_menor = contador_menor + 1;
            }
            else{
                suma = suma + altura;
            }
        }   
        System.out.println("El promedio de las alturas es: " + (suma/cantidad) + "m");
        System.out.println("El promedio de las alturas menores a 1.6m es: " + (suma_menor/contador_menor) + "m");
    }      
}
