package Ejercicios_Extra.ejercicio_3.entidades;
/**
 *
 * @author Xavier Pocchettino
 */
public abstract class Hoteles extends Alojamientos {
    
    protected Integer cantidadDeHabitaciones;
    protected Integer numeroCamas;
    protected Integer cantidadDePisos;
    protected Double precioHabitaciones;

    public Hoteles() {
    }

    public Hoteles(Integer cantidadDeHabitaciones, Integer numeroCamas, Integer cantidadDePisos) {
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadDePisos = cantidadDePisos;
    }

    public Integer getCantidadDeHabitaciones() {
        return cantidadDeHabitaciones;
    }

    public void setCantidadDeHabitaciones(Integer cantidadDeHabitaciones) {
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
    }

    public Integer getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(Integer numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public Integer getCantidadDePisos() {
        return cantidadDePisos;
    }

    public void setCantidadDePisos(Integer cantidadDePisos) {
        this.cantidadDePisos = cantidadDePisos;
    }

    public Double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(Double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }
    
    protected void crearHotel(){
        super.crearAlojamiento();
        
        System.out.println("Ingrese la cantidad de Habitaciones del Hotel:");
        setCantidadDeHabitaciones(leer.nextInt());
        while(getCantidadDeHabitaciones() <= 0){
            System.out.println("Debe ingresar una cantidad mayor a 0");
            setCantidadDeHabitaciones(leer.nextInt());
        }
        
        System.out.println("Ingrese la cantidad de camas por habitación:");
        setNumeroCamas(leer.nextInt());
        while(getNumeroCamas() <= 0 && getNumeroCamas() >= 5){
            System.out.println("Debe ingresar una cantidad mayor a 0 y menor o igual a 5");
            setNumeroCamas(leer.nextInt());
        }
        
        System.out.println("Ingrese la cantidad de pisos del Hotel:");
        setCantidadDePisos(leer.nextInt());
        while(getCantidadDePisos()<= 0){
            System.out.println("Debe ingresar una cantidad mayor a 0");
            setCantidadDePisos(leer.nextInt());
            leer.nextLine();
        }
    }
    
    protected double calcularPrecio(){
        setPrecioHabitaciones((double) 50+(getCantidadDeHabitaciones()*getNumeroCamas()));
        
        return getPrecioHabitaciones();
    }    
    
    @Override
    public String toString() {
        return super.toString() + "Hoteles{" + "cantidadDeHabitaciones=" + cantidadDeHabitaciones + ", numeroCamas=" + numeroCamas + ", cantidadDePisos=" + cantidadDePisos + ", precioHabitaciones=" + precioHabitaciones + '}';
    }
}