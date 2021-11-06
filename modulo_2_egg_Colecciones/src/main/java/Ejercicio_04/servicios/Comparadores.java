package Ejercicio_04.servicios;
import Ejercicio_04.entidades.Pelicula;
import java.util.Comparator;
//Xavier
public class Comparadores {
    
    public static Comparator<Pelicula> ordenarPorDuracionDesc = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getDuracion().compareTo(o1.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDuracionAsc = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDuracion().compareTo(o2.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorAutor = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getAutor().compareTo(o2.getAutor());
        }
    };
}