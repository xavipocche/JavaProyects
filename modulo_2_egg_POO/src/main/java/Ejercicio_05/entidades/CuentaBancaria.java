package Ejercicio_05.entidades;
//Xavier
public class CuentaBancaria {
    private int n_cuenta;
    private long DNI;
    private double saldo_actual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int n_cuenta, long DNI, double saldo_actual) {
        this.n_cuenta = n_cuenta;
        this.DNI = DNI;
        this.saldo_actual = saldo_actual;
    }

    public int getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(int n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }
    
    public void ingresar(double dinero){
        saldo_actual = saldo_actual + dinero;
    }
    
    public void retirar(double dinero){
        if(dinero < saldo_actual){
            saldo_actual = saldo_actual - dinero;
        }
        else{
            saldo_actual = 0;
        }
    }
    
    public void extraccionRapida(double dinero){
        if(dinero <= saldo_actual*0.2){
            saldo_actual = saldo_actual - dinero;
        }
        else{
            System.out.println("No puede extraer más del 20% del total del saldo disponible");
        }
    }
    
    public String ConsultarSaldo(){
        return "Su saldo actual es: " + saldo_actual;
    }

    public String ConsultarDatos(){
        return "CuentaBancaria{" + "n_cuenta=" + n_cuenta + ", DNI=" + DNI + ", saldo_actual=" + saldo_actual +"}";
    }
    
    public void mostrarMenu(){
        System.out.println("Ingrese la operación a realizar:");
        System.out.println("Ingrese 1 para consultar el saldo en la cuenta:");
        System.out.println("Ingrese 2 para despositar dinero:");
        System.out.println("Ingrese 3 para retirar dinero:");
        System.out.println("Ingrese 4 para realizar una extracción rápida (menor o igual al 20% del saldo):");
        System.out.println("Ingrese 5 para consultar datos:");
        System.out.println("Ingrese 6 para mostrar este menú::");
        System.out.println("Ingrese 7 para salir:");
    
    }
}

