package Ejercicio_06.entidades;
import java.util.Scanner;
//Xavier
public class Cafetera {
    private double capacidadMaxima;
    private double cantidadActual;
    private Scanner leer = new Scanner(System.in);

    public Cafetera() {
    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera(){
        cantidadActual = capacidadMaxima;
    }
    
    public void vaciarCafetera(){
        cantidadActual = 0;
    }
    
    public void servirTaza(int taza){
        if(cantidadActual < taza){
            System.out.println("No se alcanzó a llenar la taza falta " + (taza-cantidadActual) + " de café");
            cantidadActual = 0;
        }
        else{
            cantidadActual = cantidadActual - taza;
            System.out.println("Se llenó la taza");
        }
    }
    
    public void agregarCafe(int cantidad){
        while(cantidad <= 0){
            System.out.println("La cantidad a añadir debe ser mayor a 0");
            cantidad = leer.nextInt();
        }
        if((cantidad + cantidadActual) >= capacidadMaxima){
            cantidadActual = capacidadMaxima;
        }
        else if((cantidad + cantidadActual) <= capacidadMaxima){
            cantidadActual = cantidadActual + cantidad;
        }
    }
}