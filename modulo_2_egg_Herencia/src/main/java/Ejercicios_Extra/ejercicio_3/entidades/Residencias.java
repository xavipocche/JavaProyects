package Ejercicios_Extra.ejercicio_3.entidades;

/**
 *
 * @author Xavier Pocchettino
 */
public class Residencias extends Alojamiento_Extrahotelero {
    private Integer cantidadHabitaciones;
    private boolean descuentos;
    private boolean campoDeportivo;

    public Residencias() {
    }

    public Residencias(Integer cantidadHabitaciones, boolean descuentos, boolean campoDeportivo, boolean privado, Double area, String nombre, String direccion, String localidad, String gerente) {
        super(privado, area, nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentos = descuentos;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isDescuentos() {
        return descuentos;
    }

    public void setDescuentos(boolean descuentos) {
        this.descuentos = descuentos;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public void crearAlojamiento() {
        int opcion;
        super.crearAlojamiento();
        
        System.out.println("Ingrese la cantidad de habitaciones de la Residencia:");
        setCantidadHabitaciones(leer.nextInt());
        while(getCantidadHabitaciones() <= 0){
            System.out.println("La cantidad de habitaciones debe ser mayor a 0");
            setCantidadHabitaciones(leer.nextInt());
        }
        System.out.println("Ingrese 1 si la residencia posee descuentos y 2 si no posee:");
        opcion = leer.nextInt();
        while(opcion != 1 && opcion !=2){
            System.out.println("Debe ingresar 1 o 2:");
        }
        
        if(opcion == 1){
            setDescuentos(true);
        }
        else if(opcion == 2){
            setDescuentos(false);
        }
        
        System.out.println("Ingrese 1 si la residencia posee campo deportivo y 2 si no posee:");
        opcion = leer.nextInt();
        while(opcion != 1 && opcion !=2){
            System.out.println("Debe ingresar 1 o 2:");
            opcion = leer.nextInt();
        }
        
        if(opcion == 1){
            setCampoDeportivo(true);
        }
        else if(opcion == 2){
            setCampoDeportivo(false);
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + "Residencias{" + "cantidadHabitaciones=" + cantidadHabitaciones + ", descuentos=" + descuentos + ", campoDeportivo=" + campoDeportivo + '}';
    }
}