package Ejercicio_12.entidades;
import java.util.Scanner;
import java.util.Date;
//Xavier

public class Persona_2 {
    private String nombre;
    private Date fecha_nacimiento; //Atributo de tipo Date
    
    Scanner leer = new Scanner(System.in);

    public Persona_2() {
        //fecha_nacimiento = new Date(); // Esto es para que no se cree la fecha en null 
    }

    public Persona_2(String nombre, Date fecha_nacimiento) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    public void crearPersona(){
        System.out.println("Ingrese el nombre de la persona:");
        this.nombre = leer.nextLine();  
        System.out.println("Ingrese la fecha de nacimiento:");
        System.out.println("Día:");
        int dia = leer.nextInt();
        while(dia>31 || dia<1){
            System.out.println("El día debe ser entre 1 y 31!!!");
            dia = leer.nextInt();
        }
        System.out.println("Mes:");
        
        int mes = leer.nextInt();
        while(mes>12 || mes<1){
            System.out.println("El mes debe ser entre 1 y 12!!!");
            mes = leer.nextInt();
        }
        System.out.println("Año:");
        
        int anio = leer.nextInt();
        
        this.fecha_nacimiento = new Date(anio-1900,mes-1,dia);
    }
    
    public int calcularEdad(){
        Date fecha_actual = new Date();
        int edad = Math.abs((fecha_actual.getYear())-(fecha_nacimiento.getYear()));
        if(fecha_actual.getMonth()<fecha_nacimiento.getMonth())
            edad -= 1;
        return edad;
    }
    
    public boolean menorQue(int edad){ //Si la edad ingresada en el método es menor a la edad de la persona retorna true
        Date fecha_actual = new Date();
        boolean logic = false;
        
        int edad_ingresada = Math.abs((fecha_actual.getYear())-(fecha_nacimiento.getYear()));
        if(fecha_actual.getMonth()<fecha_nacimiento.getMonth())
            edad_ingresada -= 1; 
        
        if(edad_ingresada < edad){ 
            logic = true; 
        }
        
        return logic;
    }

    public String mostrarPersona() {
        return "Persona_2{" + "nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento + '}';
    }
}