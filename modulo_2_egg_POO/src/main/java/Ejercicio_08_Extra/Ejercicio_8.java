package Ejercicios_Extra.Ejercicio_08_Extra;
import java.util.Scanner;
import java.util.Date;
import Ejercicios_Extra.Ejercicio_08_Extra.entidades.Tiempo;
//Xavier
public class Ejercicio_8 {
    public static void main(String[] args) throws InterruptedException {
        Scanner leer = new Scanner(System.in);
        Tiempo t = new Tiempo();
        
        System.out.println("Ingrese una hora:");
        t.setHoras(leer.nextInt());
        
        System.out.println("Ingrese minutos:");
        t.setMinutos(leer.nextInt());

        System.out.println("Ingrese segundos:");
        t.setSegundos(leer.nextInt());
        
        System.out.println("La hora ingresada es: " + t.imprimitHoraCompleta());
        
        System.out.println("Ingrese 1 para visualizar la hora actual en tiempo real:");
        int opcion = leer.nextInt();

        //SIMULAR RELOJ EN TIEMPO REAL        
        
        while(opcion == 1){
            Date fecha = new Date();
            System.out.println(fecha.getHours() + ":" + fecha.getMinutes() + ":" + fecha.getSeconds() );
            Thread.sleep(1000);
            if(fecha.getSeconds() == 59){
                break;
            }
        }
        
    }

}
