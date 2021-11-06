package Ejercicios_Extra.Ejercicio_10_Extra.entidades;
import java.util.Scanner;
//Xavier
public class Fecha {
    private Scanner leer =new Scanner(System.in);
    private int dia = 1;
    private int mes = 1;
    private int anio = 1900;

    public Fecha() {
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }
    
    public String ingresarFecha(){
        System.out.println("Ingrese el año:");
        this.anio = leer.nextInt();
        
        if(anio > 2021 || anio < 1900){
            System.out.println("El año debe ser entre 1900 y 2021");
            this.anio = 1900;
        }
        
        System.out.println("Ingrese el mes:");
        this.mes = leer.nextInt();
        
        while(mes>12 || mes <1){
            System.out.println("El mes debe ser entre 1 y 12");
            this.mes = leer.nextInt();
        }
        
        int meses_31 [] = {1,3,5,7,8,10,12};
        int meses_30 [] = {4,6,9,11};
        
        boolean mes_31 = false;
        boolean mes_30 = false;
        System.out.println("Ingrese el día:");
        
        for (int i = 0; i < meses_31.length; i++) {
            if(meses_31[i] == this.mes){
                mes_31 = true;       
                break;
            }
        }
        
        if(mes_31 == false){
            for (int i = 0; i < meses_30.length; i++) {
                if(meses_30[i] == this.mes){
                    mes_30 = true;       
                    break;
                }
            }
        }
        
        if(mes_31 == true){
            this.dia = leer.nextInt();
            while(dia > 31 || dia < 1){
                System.out.println("No puede ingresar días menores a 1 y mayores a 31");
                this.dia = leer.nextInt();
            }
        }
        
        if(mes_30 == true){
            this.dia = leer.nextInt();
            while(dia > 30 || dia < 1){
                System.out.println("No puede ingresar días menores a 1 y mayores a 30");
                this.dia = leer.nextInt();
            }
        }
        
        if(mes_31 == false && mes_30 == false){
            this.dia = leer.nextInt();
            while(dia > 28 || dia < 1){
                System.out.println("No puede ingresar días menores a 1 y mayores a 28");
                this.dia = leer.nextInt();
            }
        }
        
        return "La fecha ingresada es: " + this.dia + "/" + this.mes + "/" + this.anio;
    }
    
    public int conocerDias(int mes){
        int dias = 0;
        int meses_31 [] = {1,3,5,7,8,10,12};
        int meses_30 [] = {4,6,9,11};
        
        for (int i = 0; i < meses_31.length; i++) {
            if(meses_31[i] == mes){
                dias = 31;
                break;
            }
        }
        
        if(dias == 0){
            for (int i = 0; i < meses_30.length; i++) {
                if (meses_30[i] == mes) {
                    dias = 30;
                    break;
                }
                else if(mes == 2){
                    dias =28;
                }
            }
        }
        
        else if(mes == 2){
            dias = 28;
        }
        
        return dias;
    }
    
    public String diaSiguiente(Fecha f){
        String mensaje = "";
        
        if((f.getDia() == 31 || f.getDia() == 30 || f.getDia() == 28) && f.getMes() < 12){
            mensaje = "El día siguiente es: " + "1" + "/" + (f.getMes()+1) + "/" + f.getAnio();
        }
        else if(f.getDia() == 31 && f.getMes() == 12){
            mensaje = "EL día siguiente es: " + "1" + "/" + "1" + "/" + (f.getAnio()+1);
        }
        else if((f.getDia() < 31 || f.getDia() < 30 || f.getDia() < 28)){
            mensaje = "El día siguiente es: " + (f.getDia()+1) + "/" + f.getMes() + "/" + f.getAnio();
        }
        
        return mensaje;
    }
    
    public String diaAnterior(Fecha f){
        String mensaje = "";
        
        if(f.getDia() == 1 && f.getMes() == 1){
            mensaje = "El día anterior es: " + "31" + "/" + "12" + "/" + (f.getAnio()-1);
        }
        else if(f.getDia() == 1 && (f.getMes() == 2 || f.getMes() == 4) || (f.getMes() == 6) || f.getMes() == 8 || f.getMes() == 9 || f.getMes() == 11){
            mensaje = "El día anterior es: " + "31" + "/" + (f.getMes()-1) + "/" + f.getAnio();
        }
        else if(f.getDia() == 1 && (f.getMes() == 5 || f.getMes() == 7 || f.getMes() == 10 || f.getMes() == 12 )){
            mensaje = "El día anterior es: " + "30" + "/" + (f.getMes()-1) + "/" + f.getAnio();
        }
        else if(f.getDia() == 1 && f.getMes()==3){
            mensaje = "El día anterior es: " + "28" + "/" + (f.getMes()-1) + "/" + f.getAnio();
        }
        else if(f.getDia() != 1){
            mensaje = "El día anterior es: " + (f.getDia()-1) + "/" + f.getMes() + "/" + f.getAnio();
        }
        return mensaje;
        
    }
    
    public boolean anioBiciesto(Fecha f){
        boolean logic = false;
        if(f.getAnio()%4 == 0){
            logic = true;
        }
        
        return logic;
    }
}