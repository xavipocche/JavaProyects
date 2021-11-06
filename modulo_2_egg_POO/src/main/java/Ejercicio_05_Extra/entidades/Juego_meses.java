package Ejercicio_05_Extra.entidades;
import java.util.Scanner;
//Xavier
public class Juego_meses {
    private Scanner leer = new Scanner(System.in);
    private String array[] = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesSecreto = array[11]; 
    
    public void adivinarMes(){
        int bandera = 0;
        String mes;
        do{
          System.out.println("Ingrese un mes:");
          mes = leer.nextLine().toLowerCase();
          for (int i = 0; i < array.length; i++) {
              if(mes.equals(this.mesSecreto)){
                  bandera = 1;
                  System.out.println("Acertó el mes!!!");
                  i = array.length;
              }
              else{
                  System.out.println("El mes ingresado es incorrecto, intente nuevamente");
                  i = array.length;
              }
          }    
        }while(bandera == 0);    
    }
}