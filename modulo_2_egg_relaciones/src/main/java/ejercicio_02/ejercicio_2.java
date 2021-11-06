package ejercicio_02;
import ejercicio_02.entidades.Juego;
import ejercicio_02.entidades.Jugador;
import ejercicio_02.servicios.ServiceJugador;
import java.util.Scanner;
import java.util.ArrayList;
//Xavier
public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Juego j = new Juego();
        ServiceJugador sj = new ServiceJugador();
        ArrayList<Jugador> jugadores = new ArrayList();
        
        j.llenarJuego();
        
        j.mostrarJugadores();
        System.out.println("\n");
        System.out.println("Posiciones");
        System.out.println(j.getR().getPosicion_actual());
        System.out.println(j.getR().getPosicion_agua());
        System.out.println("\n");
        
        String disparo;
        boolean fin_bucle = false;
        int k = 0;
        System.out.println("Presione (D) para avanzar rondas en la ruleta:");
        
        do {
            disparo = leer.nextLine().toUpperCase();
            if(!disparo.equals("D")){
                System.out.println("Opción no válida");
            }
            switch(disparo){
                case "D":
                    fin_bucle = j.ronda(k);
                    k += 1;
                    if(k == j.getJugadores().size()){
                        k = 0;
                    }
            }
        } while (fin_bucle != true);
    }
}