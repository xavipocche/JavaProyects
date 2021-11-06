package Ejercicios_Extra.ejercicio_3.entidades;

/**
 *
 * @author Xavier Pocchettino
 */
public abstract class Alojamiento_Extrahotelero extends Alojamientos {
    protected boolean privado;
    protected Double area;

    public Alojamiento_Extrahotelero() {
    }

    public Alojamiento_Extrahotelero(boolean privado, Double area, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.area = area;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    @Override
    public void crearAlojamiento() {
        int opcion;
        super.crearAlojamiento();
        System.out.println("Ingrese 1 si el Alojamiento es privado y 2 si no lo es:");
        opcion = leer.nextInt();
        while(opcion != 1 && opcion != 2){
            System.out.println("Debe ingresar 1 o 2:");
            opcion = leer.nextInt();
        }
        
        if(opcion == 1){
            setPrivado(true);
        }
        else if(opcion == 2){
            setPrivado(false);
        }
        
        System.out.println("Ingrese el área del alojamiento:");
        setArea(leer.nextDouble());
        while(getArea()<0){
            System.out.println("El área ingresada debe ser mayor a 0:");
            setArea(leer.nextDouble());
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + "Alojamiento_Extrahotelero{" + "privado=" + privado + ", area=" + area + '}';
    }
}