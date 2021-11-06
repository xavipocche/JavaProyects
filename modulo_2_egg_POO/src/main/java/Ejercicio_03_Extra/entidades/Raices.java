package Ejercicio_03_Extra.entidades;
//Xavier
public class Raices {
    private double a ; 
    private double b ;
    private double c ; 
    
    public Raices() {
    }

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        double discriminante = Math.pow(b, 2)-(4*a*c);
        
        return discriminante;
    }
    
    public boolean tieneRaices(Raices r){
        boolean logic;
        
        if(r.getDiscriminante()> 0){
            logic = true;
        }
        else{
            logic = false;
        }
        return logic;
    }
    
    public boolean tieneRaiz(Raices r){
        boolean logic;
        
        if(r.getDiscriminante() == 0){
            logic = true;
        }
        else{
            logic = false;
        }
        return logic;
    }
    
    public String obtenerRaiz(Raices r){
        double raiz;
        String mensaje;
        if(r.tieneRaiz(r) == true){
            raiz = (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
            mensaje = "La raíz de la ecuación es: " + raiz;
        }
        else if(r.getDiscriminante()>0){
            mensaje = "La ecuación no tiene solución única";
        }
        else{
            mensaje = "La ecuación no tiene solución real";
        }
        return mensaje;
    }
    
    public String calcular(Raices r){
        double x1;
        double x2;
        String mensaje;
        
        if(r.tieneRaices(r) == true){
            x1 = (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
            x2 = (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
            mensaje = "Las raíces de la ecuación son: " + x1 + " y " + x2;
        }
        else if(r.tieneRaiz(r) == true){
            x1 = (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
            mensaje = "La ecuación tiene solución única, esta es: " + x1;
        }
        else{
           mensaje = "La ecuación no tiene solución real"; 
        }
        
        return mensaje ;
    }
}