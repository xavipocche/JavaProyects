package ejercicio_01;
import ejercicio_01.entidades.Perro;
import ejercicio_01.entidades.Persona;
import ejercicio_01.servicios.PerroService;
import ejercicio_01.servicios.ServicioPersona;
import
 java.util.ArrayList;
//Xavier
public class ejercicio_1 {
    public static void main(String[] args) {
        ServicioPersona sp = new ServicioPersona();
        PerroService ps = new PerroService();
        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Perro> perros = new ArrayList();
        
        for (int i = 0; i < 2; i++) {
            Persona a = sp.crearPersona();
            personas.add(a);
        }
        for (Persona aux : personas) {
            System.out.println(aux.toString());
        }
    }
}
