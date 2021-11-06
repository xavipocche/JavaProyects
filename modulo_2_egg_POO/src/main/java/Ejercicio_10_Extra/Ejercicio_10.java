package Ejercicios_Extra.Ejercicio_10_Extra;
import java.util.Scanner;
import Ejercicios_Extra.Ejercicio_10_Extra.entidades.Fecha;
//Xavier
public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        Fecha f = new Fecha();
        
        System.out.println("Ingrese el mes que desea conocer la cantidad de días:");
        System.out.println(f.conocerDias(leer.nextInt()));
        System.out.println(f.ingresarFecha());
        System.out.println(f.diaAnterior(f));
        System.out.println(f.diaSiguiente(f));
        System.out.println("¿El año es biciesto?");
        System.out.println(f.anioBiciesto(f));
    }
}
