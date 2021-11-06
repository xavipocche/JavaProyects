package Ejercicio_06_Extra;
import Ejercicio_06_Extra.entidades.Ahorcado;
import java.util.Scanner;
//Xavier
public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Ahorcado a = new Ahorcado();
        String letras_ingresadas[] = {""};
        int opcion;
        
        a.crearJuego();
        imprimirVector(a.getArray_palabra());
        
        System.out.println("Ingrese una opcion:");
        System.out.println("1 para mostrar la longitud de la palabra");
        System.out.println("2 para saber si una letra se encuentra o no en la palabra");
        System.out.println("3 para saber cuántas letras ha encontrado y cuantas restan");
        System.out.println("4 para saber los intentos que restan");
        System.out.println("5 para mostrar nuevamente el menú");
        
        do{
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(a.mostrarLongitud());
                    break;
                case 2:
                    System.out.println(a.buscar(letras_ingresadas));
                    break;
                case 3:
                    System.out.println(a.encontradas());
                    break;
                case 4:
                    System.out.println(a.intentos());
                    break;
                case 5:
                    a.menu();
                    break;
            }
        }while (a.getJugadasMaximas() != 0 && (a.getArray_palabra().length != a.getLetrasEncontradas()));
        
        if(a.getLetrasEncontradas() == a.getArray_palabra().length){
            System.out.println("GANADOR!!!");
        }
        else{
            System.out.println("PERDEDOR!!!");
        }
    }
    
    public static void imprimirVector(String vector[]){
        for(int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] +"]");
        }
        System.out.println("");
    }
}