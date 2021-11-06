package Ejercicios_Extra.Ejercicio_07_Extra.entidades;
import Ejercicios_Extra.Ejercicio_07_Extra.entidades.Fraccion;
//Xavier
public class ServicioFraccion {
    
    public String sumaFraccion(Fraccion f,Fraccion g){
        int den = f.getDenominador()*g.getDenominador();
        int num = ((den/f.getDenominador())*f.getNumerador())+((den/g.getDenominador())*g.getNumerador());
        
        return "La suma de las fracciones es: " + num + "/" + den;
    }
    public String restaFraccion(Fraccion f,Fraccion g){
        int den = f.getDenominador()*g.getDenominador();
        int num = ((den/f.getDenominador())*f.getNumerador())-((den/g.getDenominador())*g.getNumerador());
        
        return "La resta de las fracciones es: " + num + "/" + den;
    }
    public String productoFraccion(Fraccion f,Fraccion g){
        int num = f.getNumerador()*g.getNumerador();
        int den = f.getDenominador()*g.getDenominador();
        
        return "El producto de las fracciones es: " + num + "/" + den;
    }
    public String divisionFraccion(Fraccion f,Fraccion g){
        int num = f.getNumerador()*g.getDenominador();
        int den = f.getDenominador()*g.getNumerador();
        
        return "La división de las fracciones es: " + num + "/" + den;
    }
}