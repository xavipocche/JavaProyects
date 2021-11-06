package Ejercicio_04;
import java.util.Scanner;
import Ejercicio_04.entidades.Pelicula;
import Ejercicio_04.servicios.Comparadores;
import Ejercicio_04.servicios.ServicioPelicula;
import java.util.ArrayList;
//Xavier
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPelicula sp = new ServicioPelicula();
        ArrayList<Pelicula> peliculas = new ArrayList();
        
        String opcion = "";
        
        do {
            Pelicula p = sp.crearPelicula();
            peliculas.add(p);
            System.out.println("¿Desea ingresar otra película? Ingrese (N) para salir:");
            opcion = leer.next().toUpperCase();
        } while (!opcion.equals("N"));
        
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }
        System.out.println("\n");
        
        System.out.println("Películas con duración mayor a 1 hora:");
        
        for (Pelicula aux : peliculas) {
            if(aux.getDuracion()> 1){
                System.out.println(aux.toString());
            }
        }
        System.out.println("\n");
        
        peliculas.sort(Comparadores.ordenarPorDuracionDesc);
        //Collections.sort(peliculas, Comparadores.ordenarPorDuracionDesc);
        System.out.println("Ordeno las películas por duración descendente:");
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }
        System.out.println("\n");
        
        peliculas.sort(Comparadores.ordenarPorDuracionAsc);
        //Collections.sort(peliculas, Comparadores.ordenarPorDuracionAsc);
        System.out.println("Ordeno las películas por duración ascendente:");
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }
        System.out.println("\n");
        
        peliculas.sort(Comparadores.ordenarPorTitulo);
        //Collections.sort(peliculas, Comparadores.ordenarPorTitulo);
        System.out.println("Ordeno las películas por título:");
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }
        System.out.println("\n");
        
        peliculas.sort(Comparadores.ordenarPorAutor);
        //Collections.sort(peliculas, Comparadores.ordenarPorAutor);
        System.out.println("Ordeno las películas por autor:");
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }
        System.out.println("\n");
    }
}
