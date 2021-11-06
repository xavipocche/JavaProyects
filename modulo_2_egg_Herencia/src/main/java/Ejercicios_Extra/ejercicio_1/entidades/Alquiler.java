package Ejercicios_Extra.ejercicio_1.entidades;
import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author Xavier Pocchettino
 */
public final class Alquiler {
    private Scanner leer = new Scanner(System.in);
    private double precioAlquiler;
    private String nombre;
    private Long DNI;
    private Date fecha_alquiler;
    private Date fecha_devolucion;
    private Integer posicion_amarre;
    private Barcos barco;

    public Alquiler() {
        fecha_alquiler = new Date();
        fecha_devolucion = new Date();
    }

    public Alquiler(String nombre, Long DNI, Date fecha_alquiler, Date fecha_devolucion, Integer posicion_amarre, Barcos barco){
        this.nombre = nombre;
        this.DNI = DNI;
        this.fecha_alquiler = fecha_alquiler;
        this.fecha_devolucion = fecha_devolucion;
        this.posicion_amarre = posicion_amarre;
        this.barco = barco;
    }

    public Date getFecha_alquiler() {
        return fecha_alquiler;
    }

    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    public Integer getPosicion_amarre() {
        return posicion_amarre;
    }

    public Barcos getBarco() {
        return barco;
    }

    public void setBarco(Barcos barco) {
        this.barco = barco;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }
    
    public void crearAlquiler(){ //SUPERSETTER
        System.out.println("Ingrese el nombre de la persona:");
        nombre = leer.nextLine();
        System.out.println("Ingrese el DNI de la persona:");
        DNI = leer.nextLong();
        System.out.println("Ingrese la fecha del alquiler:");
        this.fecha_alquiler = validar_fecha();
        System.out.println("Ingrese la fecha de devolución:");
        setFechaDevolucion();
        
    }
    
    public void validar_amarre(Barcos amarres[], ArrayList<Barcos> barcos, ArrayList<Alquiler> alquileres){
        System.out.println("Ingrese la posición del amarre:");
        posicion_amarre = leer.nextInt();
        leer.nextLine();
        while(posicion_amarre < 1 || posicion_amarre > amarres.length){
            System.out.println("Debe ingresar una posición entre 1 y " + amarres.length);
            posicion_amarre = leer.nextInt();
            leer.nextLine();
        }
        for (Barcos aux : barcos) {
            if(aux.isAlquilado()){
                for (Alquiler aux_2 : alquileres) {
                    while(aux_2.getPosicion_amarre() == posicion_amarre){
                        System.out.println("El amarre seleccionado ya está ocupado, seleccione otro:");
                        posicion_amarre = leer.nextInt();
                        leer.nextLine();
                    }
                }
            }
        }
    };
    
    private Date validar_fecha(){ //VALIDACIÓN DE FECHA DEL ALQUILER
        System.out.println("Día:");
        int dia = leer.nextInt();
        while(dia>31 || dia<1){
            System.out.println("El día debe ser entre 1 y 31!!!");
            dia = leer.nextInt();
        }
        System.out.println("Mes:");
        
        int mes = leer.nextInt();
        while(mes>12 || mes<1){
            System.out.println("El mes debe ser entre 1 y 12!!!");
            mes = leer.nextInt();
        }
        System.out.println("Año:");
        
        int anio = leer.nextInt();
        
        return new Date(anio-1900,mes-1,dia);
    }
    
    private void setFechaDevolucion(){ //SE EJECUTA HASTA QUE LA FECHA DE DEVOLUCIÓN SEA POSTERIOR A LA DEL ALQUILER
        this.fecha_devolucion = validar_fecha();
        validarDevolucion();
    }
    
    private void validarDevolucion(){
        if(fecha_devolucion.before(fecha_alquiler)){
            System.out.println("La fecha de devolución debe ser posterior a la fecha del alquiler");
            setFechaDevolucion();
        }
    }

    @Override
    public String toString() {
        return "Alquiler{" + "precioAlquiler=" + precioAlquiler + "$" + ", nombre=" + nombre + ", DNI=" + DNI + ", fecha_alquiler=" + fecha_alquiler.toString() + ", fecha_devolucion=" + fecha_devolucion.toString() + ", posicion_amarre=" + posicion_amarre + ", barco=" + barco.toString() + '}';
    }
}