package Ejercicios_extra.Ejercicio_04_Extra;
import java.util.Scanner;
//Xavier
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese un número del 1 al 10 e indicaré su equivalente en romano:");
        n = leer.nextInt();
        if(n>=1 || n<=10){
            switch (n) {
                case 1:
                    System.out.println("I");
                    break;
                case 2:
                    System.out.println("II");
                    break;
                case 3:
                    System.out.println("III");
                    break;
                case 4:
                    System.out.println("IV");
                    break;
                case 5:
                    System.out.println("V");
                    break;
                case 6:
                    System.out.println("VI");
                    break;
                case 7:
                    System.out.println("VII");
                    break;
                case 8:
                    System.out.println("VIII");
                    break;
                case 9:
                    System.out.println("IX");
                    break;
                case 10:
                    System.out.println("X");
                    break;
                default:
                    System.out.println("El número ingresado debe ser entre 1 y 10");
                    break;
            }
        }
    }
}