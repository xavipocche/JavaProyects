package ejercicio_03;
import java.util.Scanner;
import ejercicio_03.entidades.Baraja;
import ejercicio_03.entidades.Cartas;
//Xavier
public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Baraja b = new Baraja();
        Cartas c = new Cartas();
        
        b.crearCartas();
        
        int opcion;
        int indice_carta = 0;
        int cant_cartas;
        int repartidas = 0;
        menu();
        do {
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    b.barajar();
                    indice_carta = 0;
                    break;
                case 2:
                    b.siguienteCarta(indice_carta);
                    indice_carta += 1;
                    break;
                case 3:
                    if(b.cartasDisponibles() > 0){
                        System.out.println("La cantidad de cartas que se pueden repartir es: " + b.cartasDisponibles());
                    }
                    else{
                        System.out.println("No se pueden repartir más cartas, cantidad = " + b.cartasDisponibles());
                    }
                    break;
                case 4:
                    indice_carta = 0;
                    System.out.println("Ingrese el número de cartas a repartir:");
                    cant_cartas = leer.nextInt();
                    while(cant_cartas > b.cartasDisponibles()){
                        System.out.println("La cantidad de cartas a repartir no puede ser mayor que las cartas disponibles!!!");
                        System.out.println("Ingrese nuevamente la cantidad de cartas a repartir:");
                        cant_cartas = leer.nextInt();
                    }
                    b.darCartas(cant_cartas);
                    System.out.println("LAS CARTAS REPARTIDAS SON:");
                    b.cartasMonton();
                    break;
                case 5:
                    b.mostrarBaraja();
                    break;
                case 6:
                    menu();
                    break;
            }
        } while (opcion != 7);
    }
    public static void menu(){
        System.out.println("Ingrese 1 para mezclar las caras:");
        System.out.println("Ingrese 2 para mostrar la siguiente carta:");
        System.out.println("Ingrese 3 para mostrar la cantidad de cartas restantes:");
        System.out.println("Ingrese 4 para repartir un número de cartas:");
        System.out.println("Ingrese 5 para mostrar las cartas de la baraja:");
        System.out.println("Ingrese 6 para volver a mostrar este menú:");
        System.out.println("Ingrese 7 para salir:");
        System.out.println("Ingrese una opción:");
    }
}