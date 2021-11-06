package Ejercicios_Extra.ejercicio_01_extra;
import java.util.Scanner;
import Ejercicios_Extra.ejercicio_01_extra.entidades.PerroNuevo;
import Ejercicios_Extra.ejercicio_01_extra.entidades.PersonaNuevo;
import Ejercicios_Extra.ejercicio_01_extra.servicios.ServicioPerro;
import Ejercicios_Extra.ejercicio_01_extra.servicios.ServicioPersonaNuevo;
import java.util.ArrayList;
import java.util.Iterator;
//Xavier
public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<PersonaNuevo> personas = new ArrayList();
        ArrayList<PerroNuevo> perros = new ArrayList();
        ServicioPersonaNuevo spersona = new ServicioPersonaNuevo();
        ServicioPerro sperro = new ServicioPerro();
        
        System.out.println("Ingrese la cantidad de personas a crear:");
        int cantidad = leer.nextInt();
        leer.nextLine();
        
        for (int i = 0; i < cantidad; i++) {
            PersonaNuevo persona = spersona.crearPersona();
            personas.add(persona);
        }
        
        System.out.println("Ingrese la cantidad de perros a crear:");
        cantidad = leer.nextInt();
        leer.nextLine();
        
        for (int i = 0; i < cantidad; i++) {
            PerroNuevo perro = sperro.crearPerro();
            perros.add(perro);
        }
        
        System.out.println("\n");
        System.out.println("Las personas creadas son:");
        for (PersonaNuevo aux : personas) {
            System.out.println(aux.toString());
        }
        System.out.println("\n");
        
        
        System.out.println("Los perros creados son:");
        for (PerroNuevo aux : perros) {
            System.out.println(aux.toString());
        }
        System.out.println("\n");
        
        int opcion;
        int contador_mascotas_adoptadas = 0;
        
        do {
            menuInicio();
            opcion = leer.nextInt();
            leer.nextLine();
            switch(opcion){
                case 1:
                    menuPersona(personas.size(),personas);
                    int opcionPersona = leer.nextInt();
                    leer.nextLine();
                    System.out.println("Ha atendido a " + personas.get(opcionPersona-1).getNombre());
                    System.out.println("Los perros que puede adoptar son:");
                    
                    for (PerroNuevo aux : perros) {
                        if(aux.isIsadopted() == false){
                            System.out.println(aux.toString());
                        }
                    }
                    System.out.println("\n");
                    
                {
                    int size_actual = personas.get(opcionPersona-1).getMascota().size();
                    do {
                        System.out.println("Ingrese el nombre del perro que desea adoptar " + personas.get(opcionPersona - 1).getNombre() + ":");
                        String nombre_mascota = leer.nextLine();
                        Iterator<PerroNuevo> it = perros.iterator();

                        while (it.hasNext()) {
                            PerroNuevo aux = it.next();
                            if (aux.getNombre().equals(nombre_mascota)) {
                                personas.get(opcionPersona - 1).addPerro(aux);
                                aux.setIsadopted(true);
                            }
                        }
                        if (size_actual == (personas.get(opcionPersona-1).getMascota().size())) {
                            System.out.println("El nombre de la mascota no logró encontrarse, intente nuevamente...");
                        }
                    
                    } while (size_actual == (personas.get(opcionPersona-1).getMascota().size()));
                }
                    contador_mascotas_adoptadas += 1;
                    
                    break;
            }
        } while (opcion != 2 && contador_mascotas_adoptadas != cantidad);
        
        System.out.println("Personas y sus mascotas:");
        for (PersonaNuevo aux : personas) {
            System.out.println(aux.toString());
        }
    }
    
    public static void menuInicio(){
        System.out.println("Ingrese 1 para adoptar una mascota:");
        System.out.println("Ingrese 2 para salir:");
    }
    
    public static void menuPersona(int size, ArrayList<PersonaNuevo> personas){
        System.out.println("Ingrese una opción para atender a una persona:");
        for (int i = 0; i < personas.size(); i++) {
            System.out.println("Presione " + (i+1) + " para atender a " + personas.get(i).getNombre());
        }
    }
}