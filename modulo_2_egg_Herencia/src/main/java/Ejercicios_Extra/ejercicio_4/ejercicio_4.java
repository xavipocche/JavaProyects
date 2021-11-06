package Ejercicios_Extra.ejercicio_4;
import Ejercicios_Extra.ejercicio_4.entidades.Empleados;
import Ejercicios_Extra.ejercicio_4.entidades.Estudiantes;
import java.util.Scanner;
import Ejercicios_Extra.ejercicio_4.entidades.Persona;
import Ejercicios_Extra.ejercicio_4.entidades.Personal_de_servicio;
import Ejercicios_Extra.ejercicio_4.entidades.Profesores;
import java.util.ArrayList;

/**
 * @author Xavier Pocchettino
 */

public class ejercicio_4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList();
        int opcion;
        int contador;
        String nombre;
        
        menu();
        do {
            System.out.println("Ingrese una opción:");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    Estudiantes es = new Estudiantes();
                    es.crearPersona();
                    personas.add(es);
                    break;
                case 2:
                    Profesores p = new Profesores();
                    p.crearPersona();
                    personas.add(p);
                    break;
                case 3:
                    Personal_de_servicio per = new Personal_de_servicio();
                    per.crearPersona();
                    personas.add(per);
                    break;
                case 4:
                    menu();
                    break;
            }
        } while (opcion != 5);
        
        menu_2();
        do {
            contador = 0;
            System.out.println("Ingrese una opción:");
            opcion = leer.nextInt();
            leer.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("Las personas a las que se les puede cambiar el estado civil son:");
                    System.out.println("\n");
                    for (Persona aux : personas) {
                        System.out.println(aux.toString());
                    }
                    System.out.println("\n");
                    System.out.println("Ingrese el nombre de la persona a la que cambiará el estado civil:");
                    nombre = leer.nextLine().toUpperCase();
                    for (Persona persona : personas) {
                        if(persona.getNombre().toUpperCase().equals(nombre)){
                            System.out.println("Ingrese el nuevo estado civil de la persona:");
                            persona.setEstado_civil(leer.nextLine());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Los empleados a los cuales se puede cambiar el número de despacho son:");
                    System.out.println("\n");
                    for (Persona aux : personas) {
                        if(aux instanceof Empleados){
                            contador ++;
                            System.out.println(aux.toString());
                        }
                    }
                    if(contador>0){
                        System.out.println("\n");
                        System.out.println("Ingrese el nombre del empleado al que sesea cambiar el número de despacho:");
                        nombre = leer.nextLine().toUpperCase();
                        for (Persona persona : personas) {
                            if (persona instanceof Empleados) {
                                if (persona.getNombre().toUpperCase().equals(nombre)) {
                                    System.out.println("Ingrese el nuevo número de despacho:");
                                    ((Empleados) persona).setNumeroDespacho(leer.nextInt());
                                    leer.nextLine();
                                }
                            }
                        }
                    }
                    else{
                        System.out.println("No hay empleados");
                    }
                    break;
                case 3:
                    System.out.println("Los estudiantes a los que puede matricular son:");
                    System.out.println("\n");
                    for (Persona aux : personas) {
                        if(aux instanceof Estudiantes){
                            contador ++;
                            System.out.println(aux.toString());
                        }
                    }
                    if(contador>0){
                        System.out.println("\n");
                        System.out.println("Ingrese el nombre del estudiante al que desea matricular");
                        nombre = leer.nextLine().toUpperCase();
                        for (Persona persona : personas) {
                            if (persona instanceof Estudiantes) {
                                if (persona.getNombre().toUpperCase().equals(nombre)) {
                                    System.out.println("Ingrese el nombre del curso al que matriculará al alumno:");
                                    ((Estudiantes) persona).setCurso(leer.nextLine());
                                }
                            }
                        }
                    }
                    else{
                        System.out.println("No hay estudiantes");
                    }
                    break;
                case 4:
                    System.out.println("Los profesores a los que puede cambiar el departamento son:");
                    System.out.println("\n");
                    for (Persona aux : personas) {
                        if(aux instanceof Profesores){
                            contador ++;
                            System.out.println(aux.toString());
                        }
                    }
                    if(contador > 0){
                        System.out.println("\n");
                        System.out.println("Ingrese el nombre del profesor al que trasladará");
                        nombre = leer.nextLine().toUpperCase();
                        for (Persona persona : personas) {
                            if (persona instanceof Profesores) {
                                if (persona.getNombre().toUpperCase().equals(nombre)) {
                                    System.out.println("Ingrese el nuevo departamento del profesor:");
                                    ((Profesores) persona).setDepartamento(leer.nextLine());
                                }
                            }
                        }
                    }
                    else{
                        System.out.println("No hay profesores");
                    }
                    break;
                case 5:
                    System.out.println("Los empleados de servicio a los cuales puede cambiar su sección son:");
                    System.out.println("\n");
                    for (Persona aux : personas) {
                        if(aux instanceof Personal_de_servicio){
                            contador ++;
                            System.out.println(aux.toString());
                        }
                    }
                    if(contador > 0){
                        System.out.println("\n");
                        System.out.println("Ingrese el nombre del personal a cambiar de sección:");
                        nombre = leer.nextLine().toUpperCase();
                        for (Persona persona : personas) {
                            if (persona instanceof Personal_de_servicio) {
                                if (persona.getNombre().toUpperCase().equals(nombre)) {
                                    System.out.println("Ingrese la nueva sección del personal de servicio:");
                                    ((Personal_de_servicio) persona).setSeccion(leer.nextLine());
                                }
                            }
                        }
                    }
                    else{
                        System.out.println("No hay personal de servicio");
                    }
                    break;
            }
        } while (opcion != 6);
        System.out.println("\n");
        System.out.println("Las personas que se ingresaron son:");
        System.out.println("\n");
        for (Persona aux : personas) {
            System.out.println(aux.toString());
        }
    }
    
    public static void menu(){
        System.out.println("\n");
        System.out.println("Ingrese 1 pare crear un Estudiante:");
        System.out.println("Ingrese 2 para crear un Profesor:");
        System.out.println("Ingrese 3 para crear Personal de servicio:");
        System.out.println("Ingrese 4 para mostrar este menú:");
        System.out.println("Ingrese 5 para dejar de crear personas:");
    }
    public static void menu_2(){
        System.out.println("\n");
        System.out.println("Ingrese 1 para cambiar el estado civil de una persona:");
        System.out.println("Ingrese 2 para reasignar el despacho de un empleado:");
        System.out.println("Ingrese 3 para matricular a un estudiante en otro curso:");
        System.out.println("Ingrese 4 para cambiar el departamento de un profesor:");
        System.out.println("Ingrese 5 para cambiar la sección del personal de servicio: ");
        System.out.println("Ingrese 6 para salir:");
    }
}