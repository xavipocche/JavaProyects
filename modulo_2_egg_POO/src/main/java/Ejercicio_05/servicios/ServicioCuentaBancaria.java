package Ejercicio_05.servicios;
import Ejercicio_05.entidades.CuentaBancaria;
import java.util.Scanner;
//Xavier
public class ServicioCuentaBancaria {
    
    private Scanner leer = new Scanner(System.in);
    
    public CuentaBancaria crear_cuenta(){
        System.out.println("Ingrese el número de cuenta:");
        int n_cuenta = leer.nextInt();
        System.out.println("Ingrese el DNI del usuario");
        long DNI = leer.nextInt();
        System.out.println("Ingrese el saldo inicial:");
        double saldo = leer.nextDouble();
        
        return new CuentaBancaria(n_cuenta, DNI, saldo);
    }
    
    public void ejecutarMenu(CuentaBancaria m){
        System.out.println("========== MENÚ ==========");
        System.out.println("Ingrese 1 para consultar el saldo en la cuenta:");
        System.out.println("Ingrese 2 para despositar dinero:");
        System.out.println("Ingrese 3 para retirar dinero:");
        System.out.println("Ingrese 4 para realizar una extracción rápida (menor o igual al 20% del saldo):");
        System.out.println("Ingrese 5 para consultar datos:");
        System.out.println("Ingrese 6 para mostrar este menú::");
        System.out.println("Ingrese 7 para salir:");
        System.out.println("=====Ingrese la operación a realizar:=====");
        
        int opcion;
        
        do{
            opcion = leer.nextInt();
            switch (opcion) {
                
                case 1:
                    System.out.println(m.ConsultarSaldo());
                    break;
                case 2:
                    System.out.println("Ingrese el monto a ingresar:");
                    m.ingresar(leer.nextDouble());
                    break;
                case 3:
                    System.out.println("Ingrese el monto a retirar:");
                    m.retirar(leer.nextDouble());
                    break;
                case 4:
                    System.out.println("Ingrese el monto a retirar NO MAYOR AL 20% DE SU SALDO");
                    m.extraccionRapida(leer.nextDouble());
                    break;
                case 5:
                    System.out.println(m.ConsultarDatos());
                    break;
                case 6:
                    m.mostrarMenu();
                    break;
                case 7:
                    System.out.println("Que tenga un buen día!");    
            }
        }while(opcion != 7);
        
    }
}