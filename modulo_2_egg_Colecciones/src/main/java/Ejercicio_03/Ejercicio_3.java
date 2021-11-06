package Ejercicio_03;
import java.util.Scanner;
import Ejercicio_03.entidades.Alumno;
import Ejercicio_03.servicios.ServicioAlumno;
import java.util.ArrayList;
//Xavier

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioAlumno s = new ServicioAlumno();
        ArrayList <Alumno> alumnos = new ArrayList();
        
        System.out.println("Ingrese la cantidad de alumnos:");
        int cantidad = leer.nextInt();
        
        for (int i = 0; i < cantidad; i++) {
            Alumno a = s.crearAlumno();
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese la nota " + (j+1) + " del alumno:");
                a.addNotas(leer.nextInt());
                
            }
            alumnos.add(a);
        }
        
        int bandera;
        String nombre;
        
        do {
            System.out.println("Ingrese el nombre del alumno al que desea calcular el promedio, ingrese (salir) para terminar la ejecución:");
            nombre = leer.next();
            bandera = 0;
            for (Alumno aux : alumnos) {
                if (aux.getNombre().equals(nombre)) {
                    System.out.println("La nota final de " + aux.getNombre() + " es: " + aux.notaFinal(aux));
                    bandera += 1;
                    break;
                }
            }
            if(bandera == 0 && !nombre.equals("salir")){
                System.out.println("No se encontró el nombre");
            }   
        } while (!nombre.equals("salir"));
    }
}