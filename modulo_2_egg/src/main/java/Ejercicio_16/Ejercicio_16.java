package Ejercicio_16;
import java.util.Scanner;
//Xavier
public class Ejercicio_16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        int suma;
        suma = 0;
        System.out.println("Ingrese 20 números: ");
        for(int i=0; i<20; i++){
            n = leer.nextInt();
            if(n == 0){
                System.out.println("Se capturó el número 0");
                break;
            }
            else if(n < 0){
                
            }
            else{
                suma = suma + n;
            }
        }
        System.out.println("La suma de los números es: " + suma);
    }
}
