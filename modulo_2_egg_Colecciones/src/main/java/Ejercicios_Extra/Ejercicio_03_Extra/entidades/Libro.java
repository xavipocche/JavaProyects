package Ejercicios_Extra.Ejercicio_03_Extra.entidades;
//Xavier

import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private Integer n_ejemplares;
    private Integer n_prestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, Integer n_ejemplares, Integer n_prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.n_ejemplares = n_ejemplares;
        this.n_prestados = n_prestados;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getN_ejemplares() {
        return n_ejemplares;
    }

    public void setN_ejemplares(Integer n_ejemplares) {
        this.n_ejemplares = n_ejemplares;
    }

    public Integer getN_prestados() {
        return n_prestados;
    }

    public void setN_prestados(Integer n_prestados) {
        this.n_prestados = n_prestados;
    }
    
    public boolean prestamo(){
        boolean logic;
        if(this.n_ejemplares > 0){
            this.n_prestados += 1;
            this.n_ejemplares -= 1;
            logic = true;
        }
        else{
            logic = false;
        }
        
        return logic;
    }
    
    public boolean devolucion(){
        boolean logic;
        if(this.n_prestados > 0){
            this.n_prestados -= 1;
            this.n_ejemplares += 1;
            logic = true;
        }
        else{
            logic = false;
        }
        
        return logic;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.titulo);
        hash = 41 * hash + Objects.hashCode(this.autor);
        hash = 41 * hash + Objects.hashCode(this.n_ejemplares);
        hash = 41 * hash + Objects.hashCode(this.n_prestados);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.n_ejemplares, other.n_ejemplares)) {
            return false;
        }
        if (!Objects.equals(this.n_prestados, other.n_prestados)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", n_ejemplares=" + n_ejemplares + ", n_prestados=" + n_prestados + '}';
    }
}