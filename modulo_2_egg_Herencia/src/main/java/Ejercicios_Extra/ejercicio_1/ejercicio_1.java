package Ejercicios_Extra.ejercicio_1;

import java.util.Scanner;
import java.util.ArrayList;
import Ejercicios_Extra.ejercicio_1.entidades.Alquiler;
import Ejercicios_Extra.ejercicio_1.entidades.Barcos;
import Ejercicios_Extra.ejercicio_1.entidades.Veleros;
import Ejercicios_Extra.ejercicio_1.entidades.Barcos_a_motor;
import Ejercicios_Extra.ejercicio_1.entidades.Yates_de_lujo;

/**
 * @author Xavier Pocchettino
 */

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Alquiler> alquileres = new ArrayList(); 
        ArrayList<Barcos> barcos = new ArrayList();
        Alquiler a;
        Veleros v;
        Barcos_a_motor b;
        Yates_de_lujo y;
        int i = 1;
        
        System.out.println("Ingrese la cantidad de veleros a crear:");
        int veleros = leer.nextInt();
        for (i = 1; i < veleros+1; i++) {
            v = new Veleros();
            v.crearVelero(1 + Math.random()*100);
            barcos.add(v);
        }
        
        System.out.println("Ingrese la cantidad de barcos a motor a crear:");
        int barcos_motor = leer.nextInt();
        for (i = veleros+1; i < veleros+barcos_motor+1; i++) {
            b = new Barcos_a_motor();
            b.crearBarcoaMotor(1 + Math.random()*100);
            barcos.add(b);
            
        }
        
        System.out.println("Ingrese la cantidad de yates a crear:");
        int yates = leer.nextInt();
        for (i = veleros+barcos_motor+1; i < veleros+barcos_motor+yates+1; i++) {
            y = new Yates_de_lujo();
            y.crearYate(1 + Math.random()*100);
            barcos.add(y);
        }
        
        Barcos amarres[] = new Barcos[veleros+barcos_motor+yates];

        System.out.println("\n");
        i = 1;
        for (Barcos aux : barcos) {
            System.out.println(aux.toString() + "posición n°" + i);
            i += 1;
            
        }
        
        System.out.println("Ingrese la cantidad de amarres a alquilar:");
        int cantidad = leer.nextInt();
        while(cantidad < 1 || cantidad > barcos.size()){
                System.out.println("Debe ingresar una opción entre 1 y " + barcos.size());
                cantidad = leer.nextInt();
            }
        
        for (i = 0; i < cantidad; i++){  
            a = new Alquiler();
            a.validar_amarre(amarres,barcos,alquileres);
            a.crearAlquiler();
            System.out.println("Ingrese el barco que desea amarrar la persona (índice):");
            int indice = leer.nextInt();
            while(indice < 1 || indice > barcos.size()){
                System.out.println("Debe ingresar una opción entre 1 y " + barcos.size());
                indice = leer.nextInt();
            }
            
            while(barcos.get(indice-1).isAlquilado()){
                System.out.println("El barco seleccionado ya fue amarrado, seleccione otro:");
                indice = leer.nextInt();
                
                while(indice < 1 || indice > barcos.size()){
                    System.out.println("Debe ingresar una opción entre 1 y " + barcos.size());
                    indice = leer.nextInt();
                }
            }
            
            amarres[a.getPosicion_amarre()-1] = barcos.get(indice-1);
            a.setBarco(barcos.get(indice-1));
            barcos.get(indice-1).setAlquilado(true);
            barcos.get(indice-1).calcularPrecio(a);
            System.out.println(a.toString());
            alquileres.add(a);
            System.out.println("\n");
        }
        
        for (Alquiler aux : alquileres) {
            System.out.println(aux.toString());
        }
    }
}