package Ejercicios_Extra.ejercicio_3;

import Ejercicios_Extra.ejercicio_3.servicios.Comparadores;
import java.util.Scanner;
import Ejercicios_Extra.ejercicio_3.entidades.Alojamientos;
import Ejercicios_Extra.ejercicio_3.entidades.Hoteles;
import Ejercicios_Extra.ejercicio_3.entidades.Hotel_5_estrellas;
import Ejercicios_Extra.ejercicio_3.entidades.Hotel_4_estrellas;
import Ejercicios_Extra.ejercicio_3.entidades.Camping;
import Ejercicios_Extra.ejercicio_3.entidades.Residencias;
import java.util.ArrayList;

/**
 * @author Xavier Pocchettino
 */

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Alojamientos> alojamientos = new ArrayList();
        ArrayList<Hoteles> hoteles = new ArrayList();
        ArrayList<Camping> campings = new ArrayList();
        ArrayList<Residencias> residencias = new ArrayList();
        
        System.out.println("Ingrese la cantidad de Alojamientos a crear:");
        int cantidad = leer.nextInt();
        int opcion;
        
        for (int i = 0; i < cantidad; i++) {
            menu();
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    menu_hoteles();
                    opcion = leer.nextInt();
                    switch(opcion){
                        case 1:
                            Hotel_5_estrellas h5 = new Hotel_5_estrellas();
                            h5.crearHotel();
                            h5.calcularPrecio();
                            hoteles.add(h5);
                            alojamientos.add(h5);
                            
                            break;
                        case 2:
                            Hotel_4_estrellas h4 = new Hotel_4_estrellas();
                            h4.crearHotel();
                            h4.calcularPrecio();
                            hoteles.add(h4);
                            alojamientos.add(h4);
                            break;
                    }
                    break;
                case 2:
                    menu_residencias();
                    opcion = leer.nextInt();
                    switch(opcion){
                        case 1:
                            Camping c = new Camping();
                            c.crearAlojamiento();
                            alojamientos.add(c);
                            campings.add(c);
                            break;
                        case 2:
                            Residencias r = new Residencias();
                            r.crearAlojamiento();
                            alojamientos.add(r);
                            residencias.add(r);
                            break;
                    }
                    break;
            }
        }
        
        mostrarAlojamientos();
        do {
           opcion = leer.nextInt();
           
           switch(opcion){
               case 1:
                   alojamientos.sort(Comparadores.ordenarPorNombre);
                   for (Alojamientos aux : alojamientos) {
                       System.out.println(aux.toString());
                   }
                   break;
               case 2:
                   hoteles.sort(Comparadores.ordenarPorPrecio);
                   for (Hoteles aux : hoteles) {
                       System.out.println(aux.toString());
                   }
                   break;
               case 3:
                   for (Camping aux : campings) {
                       if(aux.isRestaurante()){
                           System.out.println(aux.toString());
                       }
                   }
                   break;
               case 4:
                   for (Residencias aux : residencias) {
                       if(aux.isDescuentos()){
                           System.out.println(aux.toString());
                       }
                   }
                   break;
               case 5:
                   mostrarAlojamientos();
                   break;
           }
        } while (opcion != 6);
    }
    
    public static void menu(){
        System.out.println("\n");
        System.out.println("Ingrese 1 para crear un hotel");
        System.out.println("Ingrese 2 para crear un alojamiento extrahotelero");
    }
    
    public static void menu_hoteles(){
        System.out.println("\n");
        System.out.println("Ingrese 1 para crear un hotel 5 estrellas");
        System.out.println("Ingrese 2 para crear un hotel 4 estrellas");
    }
    
    public static void menu_residencias(){
        System.out.println("\n");
        System.out.println("Ingrese 1 para crear un Camping");
        System.out.println("Ingrese 2 para crear una Residencia");
    }
    
    public static void mostrarAlojamientos(){
        System.out.println("\n");
        System.out.println("Ingrese 1 para mostrar todos los Alojamientos ordenados por nombre");
        System.out.println("Ingrese 2 para mostrar todos los Hoteles ordenados por precio de mayor a menor");
        System.out.println("Ingrese 3 para mostrar todos los Campings con restaurante");
        System.out.println("Ingrese 4 para mostrar todas las Residencias con descuento");
        System.out.println("Ingrese 5 para mostrar nuevamente este menú");
        System.out.println("Ingrese 6 para salir");
    }
}