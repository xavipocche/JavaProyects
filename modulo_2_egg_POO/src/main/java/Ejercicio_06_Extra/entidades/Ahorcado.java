package Ejercicio_06_Extra.entidades;
import java.util.Scanner;
//Xavier
public class Ahorcado {
    private Scanner leer = new Scanner(System.in);
    private String array_palabra[];
    private int letrasEncontradas;
    private int jugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(String[] array_palabra, int letrasEncontradas, int jugadasMaximas) {
        this.array_palabra = array_palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }

    public String[] getArray_palabra() {
        return array_palabra;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }
    
    public void crearJuego(){
        this.letrasEncontradas = 0;
        System.out.println("Ingrese la palabra para comenzar a jugar:");
        String palabra = leer.nextLine();
        this.array_palabra = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            this.array_palabra[i] = palabra.substring(i, i+1).toLowerCase(); 
        }
        System.out.println("Ingrese la cantidad de jugadas máximas:");
        this.jugadasMaximas = leer.nextInt();
        leer.nextLine();
    }
    
    public String mostrarLongitud(){
       return "Longitud de la palabra: " + this.array_palabra.length; 
    }
    
    public String buscar(String letras_ingresadas[]){
        int bandera = 0;
        System.out.println("Ingrese una letra a buscar en la palabra:");
        String letra = leer.nextLine().toLowerCase();
        String mensaje = "";
            
        if(!letra.equals(letras_ingresadas[0])){
            for(int i = 0; i < this.array_palabra.length; i++) {
                if ((this.array_palabra[i]).equals(letra)) {
                    mensaje = "La letra ingresada se encuentra en la palabra";
                    this.letrasEncontradas += 1;
                    bandera = 1;
                    letras_ingresadas[0] = letra;
                }
            }
            if (bandera == 0){
                mensaje = "La letra ingresada NO se encuentra en la palabra";
                this.jugadasMaximas -= 1;
            }
        }
        else if(letra.equals(letras_ingresadas[0])){
                System.out.println("La letra ingresada ya fue contada");
        }
        return mensaje;
    }
    
    public String encontradas(){
        String mensaje = "Encontró " + this.letrasEncontradas + " letras, restan " + (this.array_palabra.length-this.letrasEncontradas) + " letras";  
        return mensaje;
    }
    
    public int intentos(){
        return this.jugadasMaximas;
    }
    
    public void menu(){
        System.out.println("1 para mostrar la longitud de la palabra");
        System.out.println("2 para saber si una letra se encuentra o no en la palabra:");
        System.out.println("3 para saber cuántas letras ha encontrado y cuantas restan");
        System.out.println("4 para saber los intentos que restan");
        System.out.println("5 para mostrar nuevamente el menú");
    }
}