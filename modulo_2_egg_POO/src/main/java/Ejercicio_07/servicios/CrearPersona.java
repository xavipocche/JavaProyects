package Ejercicio_07.servicios;
import Ejercicio_07.entidades.Persona;
import java.util.Scanner;
//Xavier
public class CrearPersona {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");;
    
    public Persona CrearPersona(){
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = leer.nextLine();
        
        System.out.println("Ingrese el apellido de la persona:");
        String apellido = leer.nextLine();
        
        System.out.println("Ingrese la edad de la persona:");
        int edad = leer.nextInt();
        leer.nextLine();
        
        System.out.println("Ingrese el género de la persona (M) (F) (O):");
        String genero;
        while(true){
            genero = leer.next();
            genero = genero.toUpperCase();
            if(genero.equals("M") || genero.equals("F") || genero.equals("O")){
                break;
            }
            else{
                System.out.println("Género no válido ingrese nuevamente:");
            }
        }
        
        System.out.println("Ingrese el peso de la persona:");
        int peso = leer.nextInt();
        
        System.out.println("Ingrese la altura de la persona:");
        double altura = leer.nextDouble();
        
        leer.nextLine();
        return new Persona(nombre,apellido,edad,genero,peso,altura);
    }
}