package Ejercicios_Extra.Ejercicio_02_Extra.servicios;
import java.util.Scanner;
import Ejercicios_Extra.Ejercicio_02_Extra.entidades.CantanteFamoso;
import java.util.ArrayList;
//Xavier
public class servicioCantante {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public CantanteFamoso crearCantante(){
        System.out.println("Ingrese el nombre del cantante:");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el disco con más ventas");
        String disco = leer.nextLine();
        
        return new CantanteFamoso(nombre,disco);
    }
    
    public void mostrarCantantes(ArrayList <CantanteFamoso> lista){
        for (CantanteFamoso aux : lista) {
            System.out.println(aux.toString());
        }
    }
}