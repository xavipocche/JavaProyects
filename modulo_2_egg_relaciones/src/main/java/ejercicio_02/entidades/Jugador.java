package ejercicio_02.entidades;
//Xavier
public class Jugador {
    private String nombre;
    private Integer id;
    private boolean mojado;
    
    //Constructor
    public Jugador() {
    }

    public Jugador(String nombre, Integer id, boolean mojado) {
        this.nombre = nombre;
        this.id = id;
    }
    //End Constructor
    
    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean getMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    //End Getters and Setters
    
    
    public void disparo(Revolver r){
        mojado = r.mojar();
        r.siguienteChorro();
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", id=" + id + ", mojado=" + mojado + '}';
    }
}