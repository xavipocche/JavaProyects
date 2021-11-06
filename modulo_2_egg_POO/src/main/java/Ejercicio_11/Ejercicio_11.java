package Ejercicio_11;
import java.util.Scanner;
import java.util.Date;
//Xavier

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un día:");
        int dia = leer.nextInt();
        while(dia>31 || dia<1){
            System.out.println("El día debe ser entre 1 y 31!!!");
            dia = leer.nextInt();
        }
        System.out.println("Ingrese un mes:");
        int mes = leer.nextInt();
        while(mes>12 || mes<1){
            System.out.println("El mes debe ser entre 1 y 12!!!");
            mes = leer.nextInt();
        }
        System.out.println("Ingrese un año:");
        int anio = leer.nextInt();
        
        Date fecha = new Date(anio-1900,mes-1,dia);
        Date fechaActual = new Date();
        
        System.out.println("La fecha ingresada es: " + fecha);
        System.out.println("La fecha actual es: " + fechaActual);
        
        int diferencia = Math.abs((fecha.getYear())-(fechaActual.getYear()));
        if(fechaActual.getMonth()<fecha.getMonth()){
            diferencia -= 1;
        }
        System.out.println("La diferencia en años de ambas fechas es: " + diferencia);
    }
}