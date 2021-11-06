package Ejercicio_07;
import java.util.Scanner;
import Ejercicio_07.entidades.Persona;
import Ejercicio_07.servicios.CrearPersona;
//Xavier
public class Ejercicio_07 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] imc = new int [4];
        int [] edades = new int [4];
        int mayores = 0;
        int contador_imc_bajo = 0;
        int contador_imc_normal = 0;
        int contador_imc_alto = 0;;
        
        CrearPersona p = new CrearPersona();
        
        try{
            Persona e = null;
            System.out.println(e.toString());
        }catch(NullPointerException e){
            System.out.println("No puede mostrar a una persona en null");
        }
        
        Persona a = p.CrearPersona();
        Persona b = p.CrearPersona();
        Persona c = p.CrearPersona();
        Persona d = p.CrearPersona();
        
        System.out.println("Persona: " + a.getNombre() + " " + a.getApellido());
        System.out.println(a.calcularIMC());
        System.out.println(a.esMayorDeEdad());
        System.out.println(a.toString());
        System.out.println("============");
        
        System.out.println("Persona: " + b.getNombre() + " " + b.getApellido());
        System.out.println(b.calcularIMC());
        System.out.println(b.esMayorDeEdad());
        System.out.println(b.toString());
        System.out.println("============");
        
        System.out.println("Persona: " + c.getNombre() + " " + c.getApellido());
        System.out.println(c.calcularIMC());
        System.out.println(c.esMayorDeEdad());
        System.out.println(c.toString());
        System.out.println("============");
        
        System.out.println("Persona: " + d.getNombre() + " " + d.getApellido());
        System.out.println(d.calcularIMC());
        System.out.println(d.esMayorDeEdad());
        System.out.println(d.toString());
        System.out.println("============");
        
        // creo un vector para imc y edades para guardar todos los valores
        imc[0] = a.calcularIMC();    
        imc[1] = b.calcularIMC();    
        imc[2] = c.calcularIMC();    
        imc[3] = d.calcularIMC();
        
        for (int i = 0; i < imc.length; i++) {
            switch (imc[i]) {
                case -1:
                    contador_imc_bajo += 1;
                    break;
                case 0:
                    contador_imc_normal += 1;
                    break;
                case 1:
                    contador_imc_alto += 1;
                    break;
            } 
        }
        
        edades[0] = a.getEdad();
        edades[1] = b.getEdad();
        edades[2] = c.getEdad();
        edades[3] = d.getEdad();
        
        for (int i = 0; i < edades.length; i++) {
            if(edades[i] >= 18){
                mayores =  mayores + 1;
            } 
        }
        System.out.println("El porcentaje de personas que están por debajo de su peso normal es: " + (contador_imc_bajo*100)/4 + "%" );
        System.out.println("El porcentaje de personas que están en su peso normal es: " + (contador_imc_normal*100)/4 + "%" );
        System.out.println("El porcentaje de personas que están por encima de su peso normal es: " + (contador_imc_alto*100)/4 + "%" );
        System.out.println("El porcentaje de personas mayores de edad es del: " + (mayores*100)/4 + "%");
        System.out.println("El porcentaje de personas menores de edad es del: " + (100-(mayores*100)/4) + "%");
            
    }
}