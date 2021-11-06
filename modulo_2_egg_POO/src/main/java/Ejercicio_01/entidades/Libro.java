package Ejercicio_01.entidades;
//Xavier
public class Libro {
    public int ISBN; // Atributos
    public String titulo;
    public String autor;
    public int paginas;

    public Libro(int ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro() {
    }
    
    public void crear_libro(int ISBN, String titulo, String autor, int paginas){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.paginas = paginas;
        this.paginas = paginas;
    }
    
    public void imprimir_libro(int ISBN, String titulo, String autor, int paginas){
        System.out.println("El título del libro es: " + titulo);
        System.out.println("El ISBN del libro es: " + ISBN);
        System.out.println("El autor del libro es: " + autor);
        System.out.println("La cantidad de páginas del libro es: " + paginas);
    }
    
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }
}
