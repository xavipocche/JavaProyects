package Ejercicios_Extra.ejercicio_2;

import Ejercicios_Extra.ejercicio_2.entidades.Edificio;
import Ejercicios_Extra.ejercicio_2.entidades.EdificioDeOficinas;
import Ejercicios_Extra.ejercicio_2.entidades.Polideportivo;
import java.util.ArrayList;

/**
 * @author Xavier Pocchettino
 */

public class ejercicio_2 {
    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList();
        EdificioDeOficinas e;
        Polideportivo p;
        
        System.out.println("EDIFICIOS");
        System.out.println("\n");
        for (int i = 0; i < 2; i++) {
            e = new EdificioDeOficinas();
            e.crearEdificioOficinas();
            edificios.add(e);
            e.mostrarEdificio();
            System.out.println("\n");
        }
        int contador_techados = 0;
        int contador_abiertos = 0;
        
        System.out.println("POLIDEPORTIVO");
        System.out.println("\n");
        for (int i = 0; i < 2; i++) {
            p = new Polideportivo();
            p.crearPolideportivo();
            edificios.add(p);
            if(p.isTechado()){
                contador_techados += 1;
            }
            else{
                contador_abiertos += 1;
            }
        }
        
        for (Edificio aux : edificios) {
            System.out.println(aux.toString());
        }
        System.out.println("\n");
        System.out.println("La cantidad de polideportivos techados es: " + contador_techados);
        System.out.println("La cantidad de polideportivos abiertos es: " + contador_abiertos);
    }
}