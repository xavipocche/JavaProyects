package Ejercicio_03_Extra;
import Ejercicio_03_Extra.entidades.Raices;
import java.util.Scanner;
//Xavier
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el coeficiente a de la ecuación:");
        double a = leer.nextInt();
        
        System.out.println("Ingrese el coeficiente b de la ecuación:");
        double b = leer.nextInt();
        
        System.out.println("Ingrese el coeficiente c de la ecuación:");
        double c = leer.nextInt();
        
        Raices r = new Raices(a,b,c);
        
        System.out.println(r.getDiscriminante());
        System.out.println(r.tieneRaices(r));
        System.out.println(r.tieneRaiz(r));
        //System.out.println(r.obtenerRaiz(r));
        System.out.println(r.calcular(r)); //Este método ya calcula todo
    }
}
