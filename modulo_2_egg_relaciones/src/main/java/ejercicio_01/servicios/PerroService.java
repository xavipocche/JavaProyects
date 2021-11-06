package ejercicio_01.servicios;
import ejercicio_01.entidades.Perro;
import java.util.Scanner;
//Xavier
public class PerroService {
    private Scanner leer = new Scanner(System.in);
    
    public Perro crearPerro(){
        System.out.println("Ingrese el nombre del perro:");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la raza del perro:");
        String raza = leer.nextLine();
        System.out.println("Ingrese la edad del perro:");
        Integer edad = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el tamaño del perro:");
        String tamanio = leer.nextLine();
        
        return new Perro(nombre,raza,edad,tamanio);
    }
}