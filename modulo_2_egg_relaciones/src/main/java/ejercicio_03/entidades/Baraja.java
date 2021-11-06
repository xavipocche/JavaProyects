package ejercicio_03.entidades;
import java.util.ArrayList;
import java.util.Collections;
//Xavier
public class Baraja {
    private ArrayList<Cartas> mazo = new ArrayList();
    private ArrayList<Cartas> cartas_repartidas = new ArrayList();
    private int[] numeros = {1,2,3,4,5,6,7,10,11,12};
    private String[] palos = {"Espadas","Bastos","Oro","Copas"};
    
    public void crearCartas() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                Cartas a = new Cartas(numeros[j],palos[i]);
                mazo.add(a);
            }
        }
    }
    
    public void barajar(){
        Collections.shuffle(mazo);
    }
    
    public void siguienteCarta(int indice){
        if(indice >= mazo.size()){
            System.out.println("No quedan cartas por mostrar!!!");
        }
        else{
            System.out.println(mazo.get(indice));
        }
    }
    
    public int cartasDisponibles(){
        return mazo.size();
    }
    
    public void darCartas(int cant_cartas){
        for (int i = 0; i < cant_cartas; i++) {
            cartas_repartidas.add(mazo.get(i));
        }
        
        for (int j = 0; j < cant_cartas; j++) {
            mazo.remove(0); //Siempre coloco 0 xq el Array se redimensiona cada vez que elimino un elemento de él
        }
    }
    
    public void cartasMonton(){
        for (Cartas aux : cartas_repartidas) {
            System.out.println(aux.toString());
        }
    }
    
    public void mostrarBaraja(){
        for (Cartas aux : mazo) {
            System.out.println(aux.toString());
        }
    }
}