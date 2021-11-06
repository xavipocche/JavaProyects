package ejercicio_02.servicios;
import ejercicio_02.entidades.Jugador;
import java.util.Scanner;
//Xavier

public class ServiceJugador {
    private Scanner leer = new Scanner(System.in);
    
    public Jugador crearJugador(){
        System.out.println("Ingrese el nombre del jugador:");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el id del jugador:");
        Integer id = leer.nextInt();
        leer.nextLine();
        
        return new Jugador(nombre,id,false);
    }
}