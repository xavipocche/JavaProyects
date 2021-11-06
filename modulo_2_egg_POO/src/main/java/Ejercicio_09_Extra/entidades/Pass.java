package Ejercicios_Extra.Ejercicio_09_Extra.entidades;
import java.util.Scanner;
//Xavier
public class Pass {
    private Scanner leer = new Scanner(System.in);
    private String pass;
    private String nombre = "";
    private int dni;
    private int lock = 0;

    public Pass() {
    }

    public Pass(String pass, String nombre, int dni) {
        this.pass = pass;
        this.nombre = nombre;
        this.dni = dni;
    }

    public int getLock() {
        return lock;
    }
    
    public void setNombre(){
        String ingreso = "";
        System.out.println("Ingrese su contraseña para modificar el nombre:");
        if((ingreso = leer.next()).equals(this.pass)){
            System.out.println("Ingrese el nuevo nombre:");
            this.nombre = leer.next();
        }
        else{
            System.out.println("Contraseña incorrecta");
            this.lock += 1;
        }
    }

    public void setDni() {
        String ingreso = "";
        System.out.println("Ingrese su contraseña para modificar el DNI:");
        if((ingreso = leer.next()).equals(this.pass)){
            System.out.println("Ingrese el nuevo DNI:");
            this.dni = leer.nextInt();    
        }
        else{
            System.out.println("Contraseña incorrecta");
            this.lock += 1;
        }
    }

    public void setPass() {
        String ingreso = "";
        System.out.println("Ingrese su contraseña para ingresar una nueva:");
        if((ingreso = leer.next()).equals(this.pass)){
            System.out.println("Ingrese su nueva contraseña:");
            this.pass = leer.next();
            
            while(this.pass.length() < 10){
                System.out.println("La contraseña debe contener al menos 10 caracteres");
                this.pass = leer.nextLine();
            }
            this.lock = 0;
        }
        else{
            System.out.println("Contraseña incorrecta");
            this.lock += 1;
        }
    }
    
    public void crearPass(){
        System.out.println("Ingrese una contraseña:");
        
        this.pass = leer.nextLine();
        
        while(this.pass.length() < 10){
            System.out.println("La contraseña debe contener al menos 10 caracteres");
            this.pass = leer.nextLine();
        }
    }
    
    public String analizarPass(Pass p){
        int contador_z = 0;
        int contador_a = 0;
        String mensaje;
        
        for (int i = 0; i < this.pass.length(); i++) {
            if(this.pass.substring(i, i+1).equals("z") || this.pass.substring(i, i+1).equals("Z")){
                contador_z += 1;
            }
            else if(this.pass.substring(i, i+1).equals("a") || this.pass.substring(i, i+1).equals("A")){
                contador_a += 1;
            }
        }
        
        if(contador_z > 0 && contador_a >= 2){
            mensaje = "Su contraseña es de nivel ALTO";
        }
        else if(contador_z > 0){
            mensaje = "Su contraseña es de nivel MEDIO";
        }
        else{
            mensaje = "Su contraseña es de nivel BAJO";
        }
        
        return mensaje;
    }

    @Override
    public String toString() {
        return "Pass{" + "nombre=" + nombre + ", dni=" + dni + ", lock=" + lock + '}';
    }
}