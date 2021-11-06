package Ejercicios_Extra.Ejercicio_02_Extra.entidades;
//Xavier
public class CantanteFamoso {
    private String nombre;
    private String discoConMasVentas;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombre, String discoConMasVentas) {
        this.nombre = nombre;
        this.discoConMasVentas = discoConMasVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }
    
    @Override
    public String toString() {
        return "CantanteFamoso{" + "nombre=" + nombre + ", discoConMasVentas=" + discoConMasVentas + '}';
    }
}