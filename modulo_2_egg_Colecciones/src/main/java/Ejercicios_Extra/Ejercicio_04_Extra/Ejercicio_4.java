package Ejercicios_Extra.Ejercicio_04_Extra;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
//Xavier
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashMap<Integer,String> postales = new HashMap();
        
        postales.put(5587, "Barcala");
        postales.put(5517, "Barrancas");
        postales.put(5531, "Barrio Ferri");
        postales.put(5668, "Cartellone");
        postales.put(5529, "Colonia Bombal");
        postales.put(5593, "Lunlunta");
        postales.put(5529, "Rodel del Medio");
        postales.put(5511, "Gutierrez");
        postales.put(5591, "Isla Chica");
        postales.put(5572, "Isla Grande");
        
        menu();
        int postal;
        String ciudad;
        int opcion;
        do {
           System.out.println("Ingrese una opción:");
           opcion = leer.nextInt();
           leer.nextLine();
           switch(opcion){
               case 1:
                   System.out.println("Ingrese el código postal de la Ciudad:");
                   postal = leer.nextInt();
                   leer.nextLine();
                   System.out.println("Ingrese el nombre de la ciudad:");
                   ciudad = leer.nextLine();
                   postales.put(postal, ciudad);
                   break;
               case 2:
                   System.out.println("Ingrese el código postal de la Ciudad a borrar:");
                   postal = leer.nextInt();
                   if(postales.containsKey(postal)){
                       postales.remove(postal);
                   }
                   else{
                       System.out.println("El código ingresado no se encontró");
                   }
                   break;
               case 3:
                   for (Map.Entry<Integer, String> en : postales.entrySet()) {
                       Object key = en.getKey();
                       Object value = en.getValue();
                       System.out.println("CP: " + key + " Ciudad: " + value);
                   }
                   break;
               case 4:
                   System.out.println("Ingrese el código postal de la Ciudad a buscar:");
                   postal = leer.nextInt();
                   if(postales.containsKey(postal)){
                       System.out.println(postales.get(postal));
                   }
                   else{
                       System.out.println("El código ingresado no se encontró");
                   }
                   break;
               case 5:
                   System.out.println("Adiós");
                   break;
           }
        } while (opcion != 5);
    }
    public static void menu(){
        System.out.println("Ingrese 1 para añadir una ciudad:");
        System.out.println("Ingrese 2 para borrar una ciudad:");
        System.out.println("Ingrese 3 para mostrar todas las ciudades:");
        System.out.println("Ingrese 4 para buscar una ciudad con el código:");
        System.out.println("Ingrese 5 para salir:");
    }
}
