package Ejercicios_Extra.Ejercicio_03_Extra;
import java.util.Scanner;
import Ejercicios_Extra.Ejercicio_03_Extra.entidades.Libro;
import Ejercicios_Extra.Ejercicio_03_Extra.servicios.servicioLibro;
import java.util.HashSet;
import java.util.Iterator;
//Xavier
public class Ejercicio_3 {
    @SuppressWarnings("element-type-mismatch")
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        servicioLibro sl = new servicioLibro();
        HashSet <Libro> libros = new HashSet();
        menu();
        int i;
        int opcion;
        String name;
        
        do {
            i = 0;
            System.out.println("Ingrese una opción:");
            opcion = leer.nextInt();
            leer.nextLine();
            switch(opcion){
                case 1:
                    libros.add(sl.crearLibro());
                    break;
                case 2:
                    if(libros.size() > 0){
                        System.out.println("Ingrese el nombre del libro que desea prestar:");
                        name = leer.nextLine();
                        for (Libro aux : libros) {
                            if(aux.getTitulo().equals(name)){
                                System.out.println(aux.prestamo());
                                break;
                            }
                        }
                    }
                    else{
                        System.out.println("No hay libros ingresados!!!");
                    }
                    break;
                case 3:
                    if(libros.size() > 0){
                        System.out.println("Ingrese el nombre del libro que desea devolver:");
                        name = leer.nextLine();
                        for (Libro aux : libros) {
                            if(aux.getTitulo().equals(name)){
                                System.out.println(aux.devolucion());
                                break;
                            }
                        }
                    }
                    else{
                        System.out.println("No hay libros ingresados!!!");
                    }
                    break;
                case 4:
                    for (Libro aux : libros) {
                        System.out.println(aux.toString());
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el nombre del libro a borrar:");
                    String nombre = leer.nextLine();
                    Iterator<Libro> it = libros.iterator();
                    while (it.hasNext()) {
                        Libro aux = it.next();
                        if (aux.getTitulo().equals(nombre)) {
                            it.remove();
                        }
                    }
                    for (int j = 0; j < libros.size(); j++) {
                        
                    }
                    break;
                    
            }
        } while (opcion != 6);
    }
    public static void menu(){
        System.out.println("Ingrese 1 para añadir un libro:");
        System.out.println("Ingrese 2 para prestar un libro:");
        System.out.println("Ingrese 3 para devolver un libro:");
        System.out.println("Ingrese 4 para mostrar todos los libros:");
        System.out.println("Ingrese 5 para borrar un Libro:");
        System.out.println("Ingrese 6 para salir:");
    }
}