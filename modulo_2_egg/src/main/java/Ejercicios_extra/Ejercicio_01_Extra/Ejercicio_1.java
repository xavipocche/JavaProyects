package Ejercicios_extra.Ejercicio_01_Extra;
import java.util.Scanner;
//Xavier
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int min;
        int horas;
        int contador_dias;
        contador_dias = 0;
        System.out.println("Ingrese un valor en minutos:");
        min = leer.nextInt();
        horas = min/60;
        while(horas>=24){
            horas = horas - 24;
            contador_dias = contador_dias + 1;

        }
        if(contador_dias != 0){
            System.out.println(contador_dias + " días " + horas + " horas");
        }
        else{
            System.out.println(horas + " horas");
        } 
    }   
}
