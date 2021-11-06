package Ejercicio_04.servicios;
import java.util.Scanner;
import Ejercicio_04.entidades.Pelicula;
//Xavier
public class ServicioPelicula {
    private Scanner leer = new Scanner(System.in);
    
    public Pelicula crearPelicula(){
        System.out.println("Ingrese el título de la película:");
        String titulo = leer.nextLine();
        System.out.println("Ingrese el autor de la película:");
        String autor = leer.nextLine();
        System.out.println("Ingrese la duración en horas de la película:");
        int duracion = leer.nextInt();
        leer.nextLine();
        
        return new Pelicula(titulo,autor,duracion);
    }
}