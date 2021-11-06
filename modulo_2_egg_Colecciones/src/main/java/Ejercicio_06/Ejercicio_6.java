package Ejercicio_06;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Xavier
public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        HashMap<String,Integer> productos = new HashMap();
        
        int opcion = 0;
        
        menu();
        
        do {
            System.out.println("Ingrese una opción:");
            opcion = leer.nextInt();
            leer.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nombre del producto:");
                    String nombre = leer.nextLine();
                    
                    System.out.println("Ingrese el precio del producto:");
                    Integer precio = leer.nextInt();
                    
                    productos.put(nombre, precio);
                    break;
                case 2:
                    if(productos.isEmpty() == false){
                        
                        System.out.println("Ingrese el nombre del producto:");
                        nombre = leer.nextLine();

                        if (productos.containsKey(nombre)) {
                            System.out.println("Ingrese el precio a actualizar:");
                            precio = leer.nextInt();
                            productos.replace(nombre, precio);
                        } else {
                            System.out.println("El producto ingresado no se encontró");
                        }
                    }
                    else{
                        System.out.println("No hay productos que modificar!!!");
                    }
                    break;
                case 3:
                    if(productos.isEmpty() == false){
                        
                        System.out.println("No hay productos:");
                    
                        System.out.println("Ingrese el nombre del producto a eliminar:");
                        nombre = leer.nextLine();

                        if (productos.containsKey(nombre)) {
                            productos.remove(nombre);
                            System.out.println("Se eliminó el producto");
                        } else {
                            System.out.println("El producto ingresado no se encontró");
                        }
                    }
                    else{
                        System.out.println("No hay productos que eliminar!!!");
                    }
                    break;
                case 4:
                    menu();
                    break;
                case 5:
                    for (Map.Entry<String, Integer> aux : productos.entrySet()) {
                        String key = aux.getKey();
                        Integer value = aux.getValue();
                        System.out.println("Nombre: " + key + " Precio: " + value);
                    }
                    break;
            }
        } while (opcion != 6);
        
    }
    public static void menu(){
        System.out.println("Ingrese 1 para añadir un producto:");
        System.out.println("Ingrese 2 para modificar el precio de un producto:");
        System.out.println("Ingrese 3 para eliminar un producto:");
        System.out.println("Ingrese 4 para mostrar este menú");
        System.out.println("Ingrese 5 para mostrar los productos:");
        System.out.println("Ingrese 6 para salir:");
    }
}