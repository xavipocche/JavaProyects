package Ejercicio_02_Extra;
import Ejercicio_02_Extra.entidades.Puntos;
//Xavier
public class Ejercicio_2 {
    public static void main(String[] args) {
        Puntos p = new Puntos();
        
        p.crearPuntos();
        
        System.out.println("La distancia entre puntos es: " + p.calcularDistancia());
    }

}
