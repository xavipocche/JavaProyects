package Ejercicio_06.servicios;
import Ejercicio_06.entidades.Cafetera;
import java.util.Scanner;
//Xavier
public class ServicioCafetera {
    private Scanner leer = new Scanner(System.in);
    
    public Cafetera crearCafetera(){
        System.out.println("Ingrese la capacidad máxima de la cafetera:");
        double capacidadMaxima = leer.nextDouble();
        
        while(capacidadMaxima <= 0){
            System.out.println("La capacidad máxima debe ser mayor a 0");
            capacidadMaxima = leer.nextDouble();
        }
        
        return new Cafetera(capacidadMaxima,0);
    }
}