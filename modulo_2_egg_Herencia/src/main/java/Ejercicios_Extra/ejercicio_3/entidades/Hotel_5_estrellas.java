package Ejercicios_Extra.ejercicio_3.entidades;

/**
 *
 * @author Xavier Pocchettino
 */
public final class Hotel_5_estrellas extends Hotel_4_estrellas {
    private Integer cantidadSalonesConferencia;
    private Integer cantidadSuites;
    private Integer cantidadLimusinas;

    public Hotel_5_estrellas() {
    }

    public Hotel_5_estrellas(Integer cantidadSalonesConferencia, Integer cantidadSuites, Integer cantidadLimusinas, String Gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantidadDeHabitaciones, Integer numeroCamas, Integer cantidadDePisos) {
        super(Gimnasio, nombreRestaurante, capacidadRestaurante, cantidadDeHabitaciones, numeroCamas, cantidadDePisos);
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimusinas = cantidadLimusinas;
    }

    public Integer getCantidadSalonesConferencia() {
        return cantidadSalonesConferencia;
    }

    public void setCantidadSalonesConferencia(Integer cantidadSalonesConferencia) {
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
    }

    public Integer getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(Integer cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public Integer getCantidadLimusinas() {
        return cantidadLimusinas;
    }

    public void setCantidadLimusinas(Integer cantidadLimusinas) {
        this.cantidadLimusinas = cantidadLimusinas;
    }

    @Override
    public void crearHotel() {
        super.crearHotel();
        
        System.out.println("Ingrese la cantidad de salones de Conferencias:");
        setCantidadSalonesConferencia(leer.nextInt());
        while(getCantidadSalonesConferencia()<= 0){
            System.out.println("Debe ingresar una cantidad mayor a 0");
            setCantidadSalonesConferencia(leer.nextInt());
        }
        
        System.out.println("Ingrese la cantidad de Suites:");
        setCantidadSuites(leer.nextInt());
        while(getCantidadSuites() < 0){
            System.out.println("Debe ingresar una cantidad positiva");
            setCantidadSuites(leer.nextInt());
        }
        
        System.out.println("Ingrese la cantidad de Limusinas:");
        setCantidadLimusinas(leer.nextInt());
        while(getCantidadLimusinas() < 0){
            System.out.println("Debe ingresar una cantidad positiva");
            setCantidadLimusinas(leer.nextInt());
        }
    }

    @Override
    public double calcularPrecio() {
        setPrecioHabitaciones(super.calcularPrecio() + (15*getCantidadLimusinas())); 
        
        return getPrecioHabitaciones();
    }

    @Override
    public String toString() {
        return super.toString() + "cantidadSalonesConferencia=" + cantidadSalonesConferencia + ", cantidadSuites=" + cantidadSuites + ", cantidadLimusinas=" + cantidadLimusinas + '}';
    }
}