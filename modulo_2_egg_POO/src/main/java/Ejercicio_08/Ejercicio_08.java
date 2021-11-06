package Ejercicio_08;
import java.util.Scanner;
import Ejercicio_08.entidades.Cadena;
//Xavier
public class Ejercicio_08 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena palabra = new Cadena();
        String frase_2;
        
        System.out.println("Ingrese una palabra:");
        palabra.setCadena(leer.next());
        palabra.setLongitud(palabra.getCadena().length());
        
        System.out.println("La cantidad de vocales de la palabra es: " + palabra.contarVocales());
        System.out.println("La palabra invertida es: " + palabra.invertirFrase());
        System.out.println("Ingrese un caracter e indicaré la cantidad de veces que está repetido: ");
        System.out.println(palabra.vecesRepetido(leer.next()));
        System.out.println("Ingrese otra frase para comparar sus longitudes:");
        frase_2 = leer.next();
        System.out.println(palabra.compararLongitud(frase_2.length()));
        System.out.println("Ingrese otra frase para unirla con la ingresada antes:");
        System.out.println(palabra.unirFrases(leer.next()));
        System.out.println("Ingrese un caracter, las letras (a) serán remplazadas por este: ");
        System.out.println(palabra.remplazar(leer.next()));
        System.out.println("Ingrese una letra para buscarla en la palabra:");
        System.out.println(palabra.contiene(leer.next()));
        
    }

}
