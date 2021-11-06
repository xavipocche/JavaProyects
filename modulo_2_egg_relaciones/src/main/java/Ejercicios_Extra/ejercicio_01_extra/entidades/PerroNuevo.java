package Ejercicios_Extra.ejercicio_01_extra.entidades;
//Xavier
public class PerroNuevo {
    private String nombre;
    private String raza;
    private Integer edad;
    private String tamanio;
    private boolean isadopted;

    public PerroNuevo() {
    }

    public PerroNuevo(String nombre, String raza, Integer edad, String tamanio, boolean isadopted) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.isadopted = isadopted;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isIsadopted() {
        return isadopted;
    }

    public void setIsadopted(boolean isadopted) {
        this.isadopted = isadopted;
    }

    @Override
    public String toString() {
        return "PerroNuevo{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamaño=" + tamanio + '}';
    }
}