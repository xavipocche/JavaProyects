package Ejercicio_02;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//Xavier

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> razas = new ArrayList();
        
        System.out.println("Ingrese razas de perro:");
        razas.add(leer.next());
        System.out.println("¿Desea ingresar más razas? (S) (N)");
        String opcion = leer.next().toUpperCase();
        
        if(opcion.equals("S")){
            String raza;
            System.out.println("Ingrese las razas que desee o ingrese N para salir:");
            do{
                raza = leer.next();
                razas.add(raza);
                
            }while(!raza.equals("n") && !raza.equals("n"));
        }
        razas.remove(razas.size()-1);
        
        Iterator<String> it = razas.iterator() ;
        
        while (it.hasNext()) {
            String aux = it.next();
            System.out.print("[" + aux + "]");
            
        }
        System.out.println("");
        System.out.println("Ingrese una raza a buscar:");
        String raza = leer.next();
        int bandera = 0;
        
        Iterator<String> it_2 = razas.iterator();
        
        while (it_2.hasNext()) {
            String aux = it_2.next();
            if(aux.equals(raza)){
                System.out.println("Se encontró la raza!!!");
                razas.remove(aux);
                Collections.sort(razas);
                bandera += 1;
                break;
            }
        }
        
        if(bandera == 0){
            System.out.println("No se encontró la raza");
            Collections.sort(razas);
        }
        
        for (String aux : razas) {
            System.out.print("[" + aux + "]");
        }
    }
}