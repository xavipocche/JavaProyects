package Ejercicios_extra.Ejercicio_15_Extra;
import java.util.Scanner;
//Xavier
public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
    int edad;
    while(true){
        System.out.println("Ingrese el nombre de la persona o la palabra (NO) para finalizar:");
        leer.nextLine();
        nombre = leer.nextLine();
        nombre = nombre.toUpperCase();
        if (nombre.equals("NO")){
            break;
        }
        System.out.println("Ingrese la edad de " + nombre + ":");
        edad = leer.nextInt();    
        datos(nombre,edad);
    }
    }
public static void datos(String nombre, int edad){
    if(edad >= 18){
            System.out.println(nombre + " es mayor de edad");
            System.out.println("");
        }
    else{
        System.out.println(nombre + " es menor de edad ");
        System.out.println("");
    }
}
}
