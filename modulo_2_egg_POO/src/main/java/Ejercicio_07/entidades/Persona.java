package Ejercicio_07.entidades;
//Xavier
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private int peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String genero, int peso, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public int calcularIMC(){
        double imc;
        int retorno = 0;
        imc = (peso/(altura*altura));
        if(imc < 20){
            retorno = -1;
        }
        else if(imc >= 20 && imc <= 25){
            retorno = 0;
        }
        else if(imc > 25){
            retorno = 1;
        }
        return retorno;
    }
    
    public boolean esMayorDeEdad() {
        boolean mayor;
        if(edad >= 18){
            mayor = true;
        }
        else{
            mayor = false;
        }
        
        return mayor;
    }
   
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero + ", peso=" + peso + ", altura=" + altura + '}';
    }
}