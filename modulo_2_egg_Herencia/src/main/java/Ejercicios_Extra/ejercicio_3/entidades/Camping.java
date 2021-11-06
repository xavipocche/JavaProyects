package Ejercicios_Extra.ejercicio_3.entidades;

/**
 *
 * @author Xavier Pocchettino
 */
public final class Camping extends Alojamiento_Extrahotelero {
    private Integer capacidadCarpas;
    private Integer cantidadBanios;
    private boolean restaurante;

    public Camping() {
    }

    public Camping(Integer capacidadCarpas, Integer cantidadBanios, boolean restaurante, boolean privado, Double area, String nombre, String direccion, String localidad, String gerente) {
        super(privado, area, nombre, direccion, localidad, gerente);
        this.capacidadCarpas = capacidadCarpas;
        this.cantidadBanios = cantidadBanios;
        this.restaurante = restaurante;
    }

    public Integer getCapacidadCarpas() {
        return capacidadCarpas;
    }

    public void setCapacidadCarpas(Integer capacidadCarpas) {
        this.capacidadCarpas = capacidadCarpas;
    }

    public Integer getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(Integer cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public void crearAlojamiento() {
        int opcion;
        super.crearAlojamiento();
        
        System.out.println("Ingrese la cantidad de carpas del Camping:");
        setCapacidadCarpas(leer.nextInt());
        while(getCapacidadCarpas() <= 0){
            System.out.println("La cantidad de carpas debe ser mayor a 0");
            setCapacidadCarpas(leer.nextInt());
        }
        
        System.out.println("Ingrese la cantidad de baños:");
        setCantidadBanios(leer.nextInt());
        while(getCapacidadCarpas() <= 0){
            System.out.println("La cantidad de baños debe ser mayor a 0");
            setCantidadBanios(leer.nextInt());
        }
        
        System.out.println("Ingrese 1 si el Camping posee restaurante y 2 si no posee:");
        opcion = leer.nextInt();
        
        while(opcion != 1 && opcion != 2){
            System.out.println("Debe ingresar 1 o 2");
        }
        
        if(opcion == 1){
            setRestaurante(true);
        }
        else if(opcion == 2){
            setRestaurante(false);
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + "Camping{" + "capacidadCarpas=" + capacidadCarpas + ", cantidadBanios=" + cantidadBanios + ", restaurante=" + restaurante + '}';
    }
}