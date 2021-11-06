package Ejercicio_01_Extra;
import Ejercicio_01_Extra.entidades.Cancion;
import java.util.Scanner;
//Xavier
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cancion c = new Cancion();
        
        System.out.println("Ingrese el título de la canción:");
        String titulo = leer.nextLine();
        c.setTitulo(titulo);
        
        System.out.println("Ingrese el autor de la canción:");
        String autor = leer.nextLine();
        c.setAutor(autor);
    
        System.out.println(c.toString());
    }

}
