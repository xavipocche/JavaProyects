package Ejercicios_extra.Ejercicio_08_Extra;
import java.util.Scanner;
//Xavier
public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int num;
        System.out.println("Ingrese números hasta que uno de ellos sea múltiplo de 5:");
        do{
            num = leer.nextInt();
            if(num>0){
                if(num%2==0){
                    pares = pares + 1;
                }
                else{
                    impares = impares + 1;
                }
            }
        }while(num%5 != 0);
        System.out.println("Los números ingresados son: " + (pares+impares));
        System.out.println("La cantidad de números pares es: " + pares);
        System.out.println("La cantidad de números impares es: " + impares);
    }
}