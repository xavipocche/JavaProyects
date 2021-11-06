package Ejercicio_05;
import Ejercicio_05.entidades.CuentaBancaria;
import Ejercicio_05.servicios.ServicioCuentaBancaria;
//Xavier
public class Ejercicio_05 {
    public static void main(String[] args) {
        //Creo un objeto de la clase ServicioCuentaBancaria
        ServicioCuentaBancaria c = new ServicioCuentaBancaria(); 
        
        //Creo el objeto de la clase CuentaBancaria utilizando un método de la clase ServicioCuentaBancaria
        CuentaBancaria m = c.crear_cuenta();
        
        //Ejecuto el menú para realizar diferentes operaciones con el objeto m de la clase CuentaBancaria
        c.ejecutarMenu(m);
    }
}
