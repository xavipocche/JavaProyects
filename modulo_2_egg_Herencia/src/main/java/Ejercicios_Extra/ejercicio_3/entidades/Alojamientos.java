package Ejercicios_Extra.ejercicio_3.entidades;

import java.util.Scanner;

/**
 *
 * @author Xavier Pocchettino
 */
public abstract class Alojamientos {
    protected Scanner leer = new Scanner(System.in);
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;

    public Alojamientos() {
    }

    public Alojamientos(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    
    public void crearAlojamiento(){
        System.out.println("Ingrese el nombre del Alojamiento:");
        nombre = leer.nextLine();
        System.out.println("Ingrese la dirección del Alojamiento:");
        direccion = leer.nextLine();
        System.out.println("Ingrese la localidad del Alojamiento:");
        localidad = leer.nextLine();
        System.out.println("Ingrese el nombre del gerente del Alojamiento:");
        gerente = leer.nextLine();
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente=" + gerente + '}';
    }
}