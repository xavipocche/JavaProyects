package Ejercicio_08.entidades;
//Xavier
public class Cadena {
    private String cadena;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String cadena, int longitud) {
        this.cadena = cadena;
        this.longitud = longitud;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    public int contarVocales(){
        int contador_vocales = 0;
        for (int i = 0; i < longitud; i++) {
            if(cadena.substring(i,i+1).toUpperCase().equals("A") || cadena.substring(i,i+1).toUpperCase().equals("E") || cadena.substring(i,i+1).toUpperCase().equals("I") || cadena.substring(i,i+1).toUpperCase().equals("O") || cadena.substring(i,i+1).toUpperCase().equals("U")){
                contador_vocales += 1;   
            }
        }
        return contador_vocales;
    }
    
    public String invertirFrase(){
        String frase_invertida = "";
        for (int i = longitud; i >= 1; i--) {
                //System.out.print(cadena.substring(i-1,i));
                frase_invertida = frase_invertida + cadena.substring(i-1, i);
        }
        return frase_invertida;
    }
    
    public int vecesRepetido(String caracter){
        int contador = 0;
            for (int i = 0; i < longitud; i++) {
                if(cadena.substring(i,i+1).equals(caracter)){
                    contador += 1;
                }
            }
        
        return contador;
    }
    
    public boolean compararLongitud(int longitud){
        boolean logic;
        if(this.longitud == longitud){
            logic = true;
        }
        else{
            logic = false;
        }
        
        return logic;
    }
    
    public String unirFrases(String frase){
        String nueva_frase = this.cadena.concat(frase);
        
        return nueva_frase;
    }
    
    public String remplazar(String letra){
        String nueva_frase = this.cadena.replace("a", letra);
        
        return nueva_frase;
    }
    
    public boolean contiene(String letra){
        
        return this.cadena.contains(letra);
    }
}