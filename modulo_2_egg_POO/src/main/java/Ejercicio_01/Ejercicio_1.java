package Ejercicio_01;
import Ejercicio_01.entidades.Libro;
import java.util.Scanner;
//Xavier
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner leer  = new Scanner(System.in).useDelimiter("\n");
        Libro L = new Libro(); // Creo el objeto L de la clase Libro con el constructor vacío
        
        System.out.println("Ingrese el título del libro:");
        String titulo = leer.nextLine();
        System.out.println("Ingrese el ISBN del libro:");
        int ISBN = leer.nextInt();
        System.out.println("Ingrese el autor del libro:");
        leer.nextLine();
        String autor = leer.nextLine();
        System.out.println("Ingrese la cantidad de páginas del libro:");
        int paginas = leer.nextInt();
        
        L.crear_libro(ISBN, titulo, autor, paginas); // Doy valores a los atributos del objeto libro
        L.imprimir_libro(ISBN, titulo, autor, paginas); // Imprimo por pantalla el libro con sus atributos
    }
}