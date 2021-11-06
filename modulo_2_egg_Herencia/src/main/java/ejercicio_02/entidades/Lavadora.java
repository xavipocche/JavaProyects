package ejercicio_02.entidades;
//Xavier
public final class Lavadora extends Electrodomestico {
    private double carga;
    
    public Lavadora() {
    }

    public Lavadora(Integer Carga, Integer precio, String color, String consumo_energetico, double peso) {
        super(precio, color, consumo_energetico, peso);
        this.carga = Carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(Integer Carga) {
        this.carga = Carga;
    }
    
    public void crearLavadora(){
        crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora");
        this.carga = leer.nextDouble();
        leer.nextLine();
    }
    
    @Override
    public void precioFinal(){ 
        super.precioFinal();
        if(carga > 30){
            this.precio += 500;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Lavadora{" + "carga=" + carga + '}';
    }
}