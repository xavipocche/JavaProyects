package Ejercicios_Extra.Ejercicio_02_Extra;
import java.util.Scanner;
import Ejercicios_Extra.Ejercicio_02_Extra.entidades.CantanteFamoso;
import Ejercicios_Extra.Ejercicio_02_Extra.servicios.servicioCantante;
import java.util.ArrayList;
import java.util.Iterator;
//Xavier
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        servicioCantante sc = new servicioCantante();
        ArrayList<CantanteFamoso> cantantes = new ArrayList();
        
        for (int i = 0; i < 5; i++) {
            cantantes.add(sc.crearCantante());
        }
        
        System.out.println("Los cantantes ingresados son:");
        for (CantanteFamoso aux : cantantes) {
            System.out.println(aux.toString());
        }
        
        System.out.println("\n");
        menu();
        int opcion;
        int i;
        
        do {
            i = 0;
            System.out.println("Ingrese una opción:");
            opcion = leer.nextInt();
            leer.nextLine();
            switch(opcion){
            case 1:
                cantantes.add(sc.crearCantante());
                break;
            case 2:
                System.out.println("Ingrese el nombre del cantante a eliminar:");
                String nombre = leer.nextLine();
                Iterator<CantanteFamoso> it = cantantes.iterator();
                while (it.hasNext()) {
                    CantanteFamoso aux = it.next();
                    if(nombre.equals(aux.getNombre())){
                       it.remove();
                    }
                }
                break;
            case 3:
                sc.mostrarCantantes(cantantes);
                break;
            case 4:
                menu();
                break;
            }
        } while (opcion != 5);
    }
    
    public static void menu(){
        System.out.println("Ingrese 1 para añadir otro cantante:");
        System.out.println("Ingrese 2 para eliminar un cantante:");
        System.out.println("Ingrese 3 para mostrar todos los cantantes:");
        System.out.println("Ingrese 4 para mostrar este menú nuevamente:");
        System.out.println("Ingrese 5 para salir:");
        
    }

}
