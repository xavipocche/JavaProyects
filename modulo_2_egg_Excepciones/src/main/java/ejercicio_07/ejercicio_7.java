package ejercicio_07;

import static ejercicio_07.Uno.metodo;
import static ejercicio_07.Dos.metodo_2;
import static ejercicio_07.Tres.metodo_3;

/**
 * @author Xavier Pocchettino
 */

public class ejercicio_7 {

    public static void main(String[] args) {
        try{
//            System.out.println(metodo()); //Elijo cuál método usar de las distintas clases
//            System.out.println(metodo_2());
            System.out.println(metodo_3());
        }catch(Exception e){
            System.err.println("Excepción");
            e.printStackTrace();
        }
    }

}