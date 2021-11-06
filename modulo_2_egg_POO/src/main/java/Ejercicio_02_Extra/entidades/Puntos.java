package Ejercicio_02_Extra.entidades;
import java.util.Scanner;
public class Puntos {
    private Scanner leer = new Scanner(System.in);
    private double x1;;
    private double x2;
    private double y1;
    private double y2;

    public Puntos() {
    }
    
    public void crearPuntos(){
        System.out.println("Ingrese x1:");
        this.x1 = leer.nextDouble();
        System.out.println("Ingrese y1:");
        this.y1 = leer.nextDouble();
        System.out.println("Ingrese x2:");
        this.x2 = leer.nextDouble();
        System.out.println("Ingrese y2:");
        this.y2 = leer.nextDouble();   
    }
    
    public double calcularDistancia(){
        double distancia = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        
        return distancia;
    }
}