package Ejercicios_Extra.Ejercicio_08_Extra.entidades;
import java.util.Scanner;
//Xavier
public class Tiempo {
    private Scanner leer = new Scanner(System.in);
    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo() {
    }

    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
        while(this.horas>23 || this.horas<0){
            System.out.println("La hora debe ser entre 0 y 23!!!");
            this.horas = leer.nextInt();
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
        while(this.minutos>59 || this.minutos<0){
            System.out.println("Los minutos deben ser entre 59 y 0!!!");
            this.minutos = leer.nextInt();
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
        while(this.segundos>59 || this.segundos<0){
            System.out.println("Los segundos deben ser entre 59 y 0!!!");
            this.segundos = leer.nextInt();
        }
    }
    
    public String imprimitHoraCompleta(){
        return this.horas + ":" + this.minutos + ":" + this.segundos;
    }
}