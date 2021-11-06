package Ejercicio_01;
import java.util.Scanner;
import java.util.ArrayList;
//Xavier

public class Ejercicio_1 {
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
        
        for(String var : razas){
            System.out.println(var);
        }
    }
}