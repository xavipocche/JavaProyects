package Ejercicios_Extra.ejercicio_3.servicios;

import Ejercicios_Extra.ejercicio_3.entidades.Alojamientos;
import Ejercicios_Extra.ejercicio_3.entidades.Hoteles;
import java.util.Comparator;

/**
 *
 * @author Xavier Pocchettino
 */
public class Comparadores {
    
    public static Comparator<Alojamientos> ordenarPorNombre = new Comparator<Alojamientos>() {
        @Override
        public int compare(Alojamientos o1, Alojamientos o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
    };
    
    public static Comparator<Hoteles> ordenarPorPrecio = new Comparator<Hoteles>() {
        @Override
        public int compare(Hoteles o1, Hoteles o2) {
            return o2.getPrecioHabitaciones().compareTo(o1.getPrecioHabitaciones());
        }
    };
}