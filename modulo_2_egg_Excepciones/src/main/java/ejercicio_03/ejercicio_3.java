package ejercicio_03;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Xavier Pocchettino
 */

public class ejercicio_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String num1;
        String num2;
        Integer x;
        Integer y;
        System.out.println("Ingrese 2 números:");
        try{
            num1 = leer.next();
            num2 = leer.next();
            x = Integer.parseInt(num1);
            y = Integer.parseInt(num2);
            System.out.println(x/y);
        }catch(ArithmeticException e) {
            System.out.println("División por 0");
        }
        catch(InputMismatchException e){
            System.out.println("Error en ingreso de datos!");
        }
        catch(NumberFormatException e){
            System.out.println("No puede convertir texto a números!");
        }
    }
}