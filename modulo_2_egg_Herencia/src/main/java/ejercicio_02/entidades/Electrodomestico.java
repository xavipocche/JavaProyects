package ejercicio_02.entidades;
//Xavier
import java.util.Scanner;
public abstract class Electrodomestico{
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected double precio = 1000;
    protected String color;
    protected String consumo_energetico;
    protected double peso;

    public Electrodomestico() {
    }

    protected Electrodomestico(Integer precio, String color, String consumo_energetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo_energetico() {
        return consumo_energetico;
    }

    public void setConsumo_energetico(String consumo_energetico) {
        this.consumo_energetico = consumo_energetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(String letra){
        if(!this.consumo_energetico.equals("A") && !this.consumo_energetico.equals("B") && !this.consumo_energetico.equals("C") && !this.consumo_energetico.equals("D") && !this.consumo_energetico.equals("E") && !this.consumo_energetico.equals("F")){
            System.out.println("El consumo ingresado no es válido...");
            this.consumo_energetico = "F";
        }
    }
    
    private void comprobarColor(String color){
        if(!this.color.equals("BLANCO") && !this.color.equals("NEGRO") && !this.color.equals("ROJO") && !this.color.equals("AZUL") && !this.color.equals("GRIS")){
            System.out.println("El color ingresado no es válido...");
            this.color = "BLANCO";
        }
    }
    
    protected void crearElectrodomestico(){
        System.out.println("Ingrese el color del Electrodoméstico:");
        this.color = leer.nextLine().toUpperCase();
        comprobarColor(this.color);
        System.out.println("Ingrese el consumo energético del Electrodoméstico:");
        this.consumo_energetico = leer.nextLine().toUpperCase();
        comprobarConsumoEnergetico(this.consumo_energetico);
        System.out.println("Ingrese el peso del Electrodoméstico");
        this.peso = Math.round(leer.nextDouble());
    }
    
    public void precioFinal(){
        switch(this.consumo_energetico){
            case "A":
                this.precio += 1000;
                break;
            case "B":
                this.precio += 800;
                break;
            case "C":
                this.precio += 600;
                break;
            case "D":
                this.precio += 500;
                break;
            case "E":
                this.precio += 300;
                break;
            case "F":
                this.precio += 100;
                break;
        }
        
        if(peso >= 1 && peso <= 19){
            this.precio += 100;
        }
        else if(peso >= 20 && peso <= 49){
            this.precio += 500;
        }
        else if(peso >= 50 && peso <= 79){
            this.precio += 800;
        }
        else if(peso >= 80){
            this.precio += 1000;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo_energetico=" + consumo_energetico + ", peso=" + peso + '}';
    }
}