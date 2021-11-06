package Ejercicios_Extra.ejercicio_2.entidades;

import java.util.ArrayList;

/**
 *
 * @author Xavier Pocchettino
 */
public final class EdificioDeOficinas extends Edificio {
    private Integer n_oficinas;
    private Integer n_personas_oficina;
    private Integer n_pisos = 5;
    private ArrayList<Integer> pisos = new ArrayList();
    private ArrayList<Integer> personasPorPiso = new ArrayList();
    
    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer n_oficinas, Integer n_personas_oficina, Integer n_pisos, Double largo, Double alto, Double ancho) {
        super(largo, alto, ancho);
        this.n_oficinas = n_oficinas;
        this.n_personas_oficina = n_personas_oficina;
        this.n_pisos = n_pisos;
    }

    public Integer getN_oficinas() {
        return n_oficinas;
    }

    public void setN_oficinas(Integer n_oficinas) {
        this.n_oficinas = n_oficinas;
    }

    public Integer getN_personas_oficina() {
        return n_personas_oficina;
    }

    public void setN_personas_oficina(Integer n_personas_oficina) {
        this.n_personas_oficina = n_personas_oficina;
    }

    public Integer getN_pisos() {
        return n_pisos;
    }

    public void setN_pisos(Integer n_pisos) {
        this.n_pisos = n_pisos;
    }
    
    @Override
    public double calcularSuperficie() {
        return largo*ancho*n_pisos;
    }

    @Override
    public double calcularVolumen() {
        return largo*ancho*alto;
    }
    
    public void crearEdificioOficinas(){
        super.crearEdificio();
        System.out.println("Ingrese el número de pisos:");
        setN_pisos(leer.nextInt());
        while(getN_pisos() <= 0){
            System.out.println("Los pisos deben ser mayores a 0");
            setN_pisos(leer.nextInt());
        }
        System.out.println("Ingrese el número de oficinas del edificio:");
        setN_oficinas(leer.nextInt());
        while(getN_oficinas()<getN_pisos()){
            System.out.println("El número de oficinas debe ser mayor o igual al número de pisos, ingrese nuevamente");
            setN_oficinas(leer.nextInt());
        }
        System.out.println("Ingrese el número de personas por oficina:");
        setN_personas_oficina(leer.nextInt());
        while(getN_personas_oficina()<= 0){
            System.out.println("La cantidad de personas debe ser mayor a 0");
            setN_personas_oficina(leer.nextInt());
        }
        distribuirOficinas();
        personasPorPiso();
    }
    
    private void distribuirOficinas(){
        for (int i = 0; i < n_pisos; i++) {
            pisos.add(n_oficinas/n_pisos);
        }
        if(n_oficinas%n_pisos != 0){
            for (int i = 0; i < n_oficinas%n_pisos; i++) {
                pisos.set(i, pisos.get(i) + 1);
                if (i == pisos.size()) {
                    i = 0;
                }
            }
        }
    }
    
    public int cantPersonas(){
        return n_oficinas*n_personas_oficina;
    }
    
    public void personasPorPiso(){
        for (int i = 0; i < pisos.size(); i++) {
            personasPorPiso.add(pisos.get(i)*n_personas_oficina);
        }
    }
    
    public void mostrarEdificio(){
        System.out.println("\n");
        System.out.println("Edificio");
        
        for (Integer aux : pisos) {
            System.out.print("[" + aux + "]");
        }
        
        System.out.println("\n");
        System.out.println("Cantidad de personas por piso:");
        
        for (Integer aux : personasPorPiso) {
            System.out.print("[" + aux + "]");
        }
        System.out.println("\n");
    }

    @Override
    public String toString() {
        String mensaje = super.toString() + "EdificioDeOficinas{" + "n_oficinas=" + n_oficinas + ", n_personas_oficina=" + n_personas_oficina + ", n_pisos=" + n_pisos + '}';
        mensaje = mensaje + " Superficie= " + calcularSuperficie() + " m2" + " Volumen=" + calcularVolumen() + " m3 " + "Cantidad de personas: " + cantPersonas();
        return mensaje;
    }
}