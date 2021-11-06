package ejercicio_02;
//Xavier
import java.util.ArrayList;
import ejercicio_02.entidades.Electrodomestico;
import ejercicio_02.entidades.Lavadora;
import ejercicio_02.entidades.Televisor;

public class ejercicio_2 {
    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos =  new ArrayList(); //Parte de ejercicio 3
        
        int total = 0;
        
        for (int i = 0; i < 2; i++) {
            Lavadora a = new Lavadora();
            a.crearLavadora();
            electrodomesticos.add(a);
        }
        
        for (int i = 0; i < 2; i++) {
            Televisor b = new Televisor();
            b.crearTelevisor();
            electrodomesticos.add(b);
        }
        
        for (Electrodomestico aux : electrodomesticos) {
            aux.precioFinal();
            System.out.println(aux.toString());
            System.out.println(aux.getPrecio());
            total += aux.getPrecio();
        }
        
        System.out.println("El total de los precios es: " + total);
    }
}
