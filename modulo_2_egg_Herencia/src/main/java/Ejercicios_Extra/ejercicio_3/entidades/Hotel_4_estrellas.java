package Ejercicios_Extra.ejercicio_3.entidades;

/**
 *
 * @author Xavier Pocchettino
 */
public class Hotel_4_estrellas extends Hoteles {
    protected String Gimnasio;
    protected String nombreRestaurante;
    protected Integer capacidadRestaurante;

    public Hotel_4_estrellas() {
    }

    public Hotel_4_estrellas(String Gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantidadDeHabitaciones, Integer numeroCamas, Integer cantidadDePisos) {
        super(cantidadDeHabitaciones, numeroCamas, cantidadDePisos);
        this.Gimnasio = Gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getGimnasio() {
        return Gimnasio;
    }

    public void setGimnasio(String Gimnasio) {
        this.Gimnasio = Gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public void crearHotel() {
        int opcion;
        super.crearHotel();
        
        System.out.println("Ingrese 1 si el hotel tiene gimnasio tipo (A), ingrese 2 si es tipo (B):");
        opcion = leer.nextInt();
        leer.nextLine();
        while(opcion != 1 && opcion != 2){
            System.out.println("Debe ingresar 1 o 2:");
            opcion = leer.nextInt();
            leer.nextLine();
        }
        
        if(opcion == 1){
                Gimnasio = "A";
            }
        else if (opcion == 2) {
            Gimnasio = "B";
        }
        
        System.out.println("Ingrese el nombre del restaurante:");
        setNombreRestaurante(leer.nextLine());
        
        System.out.println("Ingrese la capacidad del restaurante:");
        setCapacidadRestaurante(leer.nextInt());
        while(getCapacidadRestaurante() <= 0){
            System.out.println("Debe ingresar una cantidad mayor a 0");
            setCapacidadRestaurante(leer.nextInt());
        }
    }
    
    //VALORES AGREGADOS
    private int valorAgregadoRestaurante(){
        int valor = 0;
        
        if(getCapacidadRestaurante() < 30){
            valor = 10;
        }
        else if(getCapacidadRestaurante() >= 30 && getCapacidadRestaurante() <= 50){
            valor = 30;
        }
        else if(getCapacidadRestaurante() > 50){
            valor = 50;
        }
        
        return valor;
    }
    private int valorAgregadoGimnasio(){
        int valor;
        
        if(getGimnasio().equals("A")){
            valor = 50;
        }
        else{
            valor = 30;
        }
        
        return valor;
    }

    @Override
    public double calcularPrecio() {
        setPrecioHabitaciones((super.calcularPrecio() + valorAgregadoRestaurante() + valorAgregadoGimnasio()));
        
        return getPrecioHabitaciones();
    }

    @Override
    public String toString() {
        return super.toString() + "Gimnasio=" + Gimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + '}';
    }
}