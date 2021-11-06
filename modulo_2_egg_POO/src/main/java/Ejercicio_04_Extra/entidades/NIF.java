package Ejercicio_04_Extra.entidades;
import java.util.Scanner;
//Xavier
public class NIF {
    private Long DNI;
    private String letra;
    private Scanner leer = new Scanner(System.in);
    
    public Long getDNI() {
        return DNI;
    }

    public void setDNI(Long DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    public void crearNif(){
        System.out.println("Ingrese su DNI:");
        
        this.DNI = leer.nextLong();
        
        Long resto = this.DNI%23;
        String[] array = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        for (int i = 0; i < array.length; i++) {
            if(i == resto){
                this.letra = array[i];
            }
        }  
    }
    
    public void mostrar(){
        String dni = this.DNI.toString();
        
        if(dni.length()<8){
            String ceros = "";
            for (int i = 0; i < ((8 - dni.length())); i++) {
                ceros = ceros + "0";   
            }
            System.out.print(ceros);  
        }
        System.out.print(this.DNI + "-" + this.letra);    
    }   
}