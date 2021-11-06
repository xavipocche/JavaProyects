package ejercicio_02.entidades;
//Xavier
public class Revolver {
    private int posicion_actual; //Posición actual (puede o no estar el agua)
    private int posicion_agua; //Posición del tambor donde estará el agua
    //Constructor
    public Revolver() {
    }

    public Revolver(Integer posicion_actual, Integer posicion_agua) {
        this.posicion_actual = posicion_actual;
        this.posicion_agua = posicion_agua;
    }
    //End Constructor
    
    //Getters and Setters
    public int getPosicion_actual() {
        return posicion_actual;
    }

    public void setPosicion_actual(Integer posicion_actual) {
        this.posicion_actual = posicion_actual;
    }

    public int getPosicion_agua() {
        return posicion_agua;
    }

    public void setPosicion_agua(Integer posicion_agua) {
        this.posicion_agua = posicion_agua;
    }
    
    //End Getters and Setters
    
    public void llenarRevolver(){
        this.posicion_actual = (int) (Math.random()*6+1);
        this.posicion_agua = (int) (Math.random()*6+1);
//        this.posicion_actual = 6;
//        this.posicion_agua = 5;
    }
    
    public boolean mojar(){
        boolean logic = false;
        if(posicion_actual == posicion_agua){
            logic = true;
        }
        
        return logic;
    }
    
    public void siguienteChorro(){
        if (posicion_actual < 6) {
            posicion_actual += 1;
        }
        else if(posicion_actual == 6){
            posicion_actual = 1;
        }
    }

    @Override
    public String toString() {
        return "Revolver_de_agua{" + "posicion_actual=" + posicion_actual + ", posicion_agua=" + posicion_agua + '}';
    }
}