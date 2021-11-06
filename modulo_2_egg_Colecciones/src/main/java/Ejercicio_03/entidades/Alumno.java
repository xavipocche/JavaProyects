package Ejercicio_03.entidades;
import java.util.ArrayList;
//Xavier
public class Alumno {
    private String nombre;
    private ArrayList <Integer> notas = new ArrayList();

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void addNotas(int notas) {
        this.notas.add(notas);
    }
    
    public double notaFinal(Alumno n){
        double nota = (double) (n.getNotas().get(0) + n.getNotas().get(1) + n.getNotas().get(2))/3;
        return nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }
}

