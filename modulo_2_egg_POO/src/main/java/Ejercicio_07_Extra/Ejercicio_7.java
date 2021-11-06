package Ejercicios_Extra.Ejercicio_07_Extra;
import java.util.Scanner;
import Ejercicios_Extra.Ejercicio_07_Extra.entidades.Fraccion;
import Ejercicios_Extra.Ejercicio_07_Extra.entidades.ServicioFraccion;
//Xavier
public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        Fraccion f = new Fraccion();
        Fraccion g = new Fraccion();
        ServicioFraccion s = new ServicioFraccion();
        
        System.out.println("Fracción 1");
        f.superSet();
        System.out.println("Fracción 2");
        g.superSet();
        
        int opcion;
        
        System.out.println("Ingrese 1 para sumar las fracciones");
        System.out.println("Infrese 2 para restar las fracciones");
        System.out.println("Ingrese 3 para multiplicar las fracciones");
        System.out.println("Ingrese 4 para dividir las fracciones");
        System.out.println("Ingrese 5 para salir");
        
        do{
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(s.sumaFraccion(f, g));
                    break;
                case 2:
                    System.out.println(s.restaFraccion(f, g));
                    break;
                case 3:
                    System.out.println(s.productoFraccion(f, g));
                    break;
                case 4:
                    System.out.println(s.divisionFraccion(f, g));
                    break;
                case 5:
                    System.out.println("Adiós");
            }
        }while(opcion != 5);
    }
}