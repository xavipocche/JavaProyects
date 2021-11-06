package ejercicio_03.entidades;
//Xavier
public class Cartas {
    private Integer n_carta;
    private String palo;
    
    public Cartas() {
    }
    
    public Cartas(Integer n_carta, String palo) {
        this.n_carta = n_carta;
        this.palo = palo;
    }

    public Integer getN_carta() {
        return n_carta;
    }

    public void setN_carta(Integer n_carta) {
        this.n_carta = n_carta;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    
    @Override
    public String toString() {
        return "Cartas{" + "n_carta=" + n_carta + ", palo=" + palo + '}';
    }
}