package ejercicio_02.entidades;
import java.util.Scanner;
import ejercicio_02.servicios.ServiceJugador;
import java.util.ArrayList;
//Xavier
public class Juego {
    private Scanner leer = new Scanner(System.in);
    private ArrayList<Jugador> jugadores = new ArrayList();
    private Jugador j;
    private Revolver r = new Revolver(); 
    private ServiceJugador sj = new ServiceJugador();
    
    //Constructor
    public Juego() {
    }
    // End Constructor
    
    //Getters
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public Revolver getR() {
        return r;
    }
    //End Getters
    
    //Creo los jugadores e inicializo el revolver, ejecutando los métodos respectivos
    public void llenarJuego(){
        
        System.out.println("Ingrese la cantidad de jugadores (mínimo 1 y máximo 6)");
        int cantidad = leer.nextInt();
        leer.nextLine();
        System.out.println("\n");
        
        while(cantidad > 6 || cantidad < 1){
            System.out.println("Mínimo 1 jugador, máximo 6 jugadores:");
            cantidad = leer.nextInt();
        }
        
        for (int i = 0; i < cantidad; i++) {
            j = sj.crearJugador();
            this.jugadores.add(j);
            System.out.println("\n");
        }
        int n = 5;
        
        this.r.llenarRevolver();
//        this.r.setPosicion_actual(r.getPosicion_actual());
//        this.r.setPosicion_agua(r.getPosicion_agua());
    }
    public boolean ronda(int k){
        boolean fin;
        System.out.println(r.toString());
        jugadores.get(k).disparo(r);
        System.out.println(jugadores.get(k).toString());
        if (jugadores.get(k).getMojado() == true) {
            System.out.println("\n");
            System.out.println("Fin del juego, el jugador " + jugadores.get(k).getNombre().toUpperCase() + " se ha mojado");
            fin = true;
        }
        else{
            fin = false;
        }
        
        return fin;
    }
    
//    public void ronda_vieja(){
//        int bandera = 0;
//        for (int i = 0; i < 6; i++) {
//            for (int k = 0; k < jugadores.size(); k++) {
//                System.out.println(r.toString());
//                jugadores.get(k).disparo(r);
//                System.out.println(jugadores.get(k).toString());
//                if (jugadores.get(k).getMojado() == true) {
//                    System.out.println("Fin del juego, el jugador " + jugadores.get(k).getNombre() + " se ha mojado");
//                    bandera = 1;
//                    break;
//                }
//            }
//            if(bandera == 1){
//                break;
//            }
//        }
//    }
    
    public void mostrarJugadores(){
        for (Jugador aux : jugadores) {
            System.out.println(aux.toString());
        }
    }
}