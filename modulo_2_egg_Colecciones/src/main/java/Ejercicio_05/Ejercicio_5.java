package Ejercicio_05;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
//Xavier
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        TreeSet<String> paises = new TreeSet();
        
        String opcion;
        String pais;

        do {
            System.out.println("Ingrese el pais:");
            pais = leer.next();
            paises.add(pais);
            System.out.println("¿Desea ingresar otro país? Ingrese (N) para salir:");
            opcion = leer.next().toUpperCase();
        } while (!opcion.equals("N"));
    
        Iterator<String> it = paises.iterator();
        
        while (it.hasNext()) {
            String aux = it.next();
            System.out.println(aux);
        }
        int bandera = 0;
        System.out.println("Ingrese un país a buscar:");
        String buscar = leer.next();
        
        Iterator<String> it_2 = paises.iterator();
        
        while (it_2.hasNext()) { //TUVE QUE CREAR UN SEGUNDO ITERATOR PORQUE AL UTILIZAR EL MISMO NO ITERABA
            String aux = it_2.next();
            if(aux.equals(buscar)){
                it.remove();
                bandera += 1;
                System.out.println("Se encontró el país");
                break;
            }
        }
        if(bandera == 0){
            System.out.println("No se encontró el país ingresado");
        }
    }
}