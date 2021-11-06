package Ejercicios_Extra.Ejercicio_09_Extra;
import java.util.Scanner;
import Ejercicios_Extra.Ejercicio_09_Extra.entidades.Pass;
//Xavier
public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Pass p = new Pass();
        
        p.crearPass();
        
        System.out.println("A) Para modificar una contraseña:");
        System.out.println("B) Para verificar seguridad de contraseña:");
        System.out.println("C) Modificar nombre:");
        System.out.println("D) Modificar DNI;");
        System.out.println("E) Para mostrar datos:");
        System.out.println("F) Para salir:");
        
        String opcion;
        
        do{
            System.out.println("Ingrese una opción:");
            opcion = leer.next().toUpperCase();
            switch (opcion) {
                case "A":
                    p.setPass();
                    break;
                case "B":
                    System.out.println(p.analizarPass(p));
                    break;
                case "C":
                    p.setNombre();
                    break;
                case "D":
                    p.setDni();
                    break;
                case "E":
                    System.out.println(p.toString());
                    break;
                case "F":
                    System.out.println("Adiós");
                    break;
            }
        }while(!opcion.equals("F") && p.getLock() != 3);
        
        if(p.getLock() == 3){
                    System.out.println("Se ha bloqueado el acceso, ingresó mal la contraseña 3 veces");
        }
    }
}