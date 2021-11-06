package ejercicio_02.entidades;
//Xavier
public final class Televisor extends Electrodomestico {
    private Integer resolucion;
    private boolean sintonizador_TDT;

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean sintonizador_TDT, Integer precio, String color, String consumo_energetico, double peso) {
        super(precio, color, consumo_energetico, peso);
        this.resolucion = resolucion;
        this.sintonizador_TDT = sintonizador_TDT;
    }
    
    public void crearTelevisor(){
        crearElectrodomestico();
        System.out.println("Ingrese la resolución del TV (pulgadas)");
        this.resolucion = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese si tiene sintonizador TDT");
        System.out.println("Presione 1 para si");
        System.out.println("Presione 2 para no");
        int opcion = leer.nextInt();
        leer.nextLine();
        if(opcion == 1){
            this.sintonizador_TDT = true;
        }
        else{
            this.sintonizador_TDT = false;
        }
    }
    
    public void precioFinal(){
        super.precioFinal();
        if(this.sintonizador_TDT == true){
            this.precio += 500;
        }
        if(this.resolucion > 40){
            this.precio += this.precio*0.3;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Televisor{" + "resolucion=" + resolucion + ", sintonizador_TDT=" + sintonizador_TDT + '}';
    }
}