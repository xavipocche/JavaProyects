package Ejercicios_Extra.Ejercicio_03_Extra.servicios;
import java.util.Scanner;
import Ejercicios_Extra.Ejercicio_03_Extra.entidades.Libro;

public class servicioLibro {
    private Scanner leer = new Scanner(System.in);
    
    public Libro crearLibro(){
        System.out.println("Ingrese el título del libro:");
        String titulo = leer.nextLine();
        System.out.println("Ingrese el autor del libro:");
        String autor = leer.nextLine();
        System.out.println("Ingrese el número de ejemplares del libro:");
        Integer ejemplares = leer.nextInt();
        leer.nextLine();
        return new Libro(titulo,autor,ejemplares,0);
    }
}