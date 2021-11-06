package Ejercicios_Extra.ejercicio_2.entidades;

/**
 *
 * @author Xavier Pocchettino
 */
public final class Polideportivo extends Edificio {
    private String nombre;
    private boolean techado;

    public Polideportivo() {
    }
    
    public Polideportivo(String nombre, boolean techado, Double largo, Double alto, Double ancho) {
        super(largo, alto, ancho);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }
    
    public void crearPolideportivo(){
        super.crearEdificio();
        System.out.println("Ingrese el nombre del Polideportivo:");
        setNombre(leer.nextLine());
        System.out.println("Ingrese 1 si el Polideportivo es techado:");
        System.out.println("Ingrese 2 si el Polideportivo es abierto:");
        int opcion = leer.nextInt();
        if(opcion == 1){
            setTechado(true);
        }
        else{
            setTechado(false);
        }
    }
    
    @Override
    public double calcularSuperficie() {
        return largo*ancho;
    }

    @Override
    public double calcularVolumen() {
        return largo*ancho*alto;
    }

    @Override
    public String toString() {
        String mensaje = super.toString() + "Polideportivo{" + "nombre=" + nombre + ", techado=" + techado + '}';
        mensaje = mensaje + " Superficie= " + calcularSuperficie() + " m2" + " Volumen=" + calcularVolumen() + " m3";
        return mensaje;
    }
}