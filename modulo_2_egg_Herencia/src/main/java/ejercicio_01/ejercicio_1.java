package ejercicio_01;
//Xavier
import ejercicio_01.entidades.Animal;
import ejercicio_01.entidades.Caballo;
import ejercicio_01.entidades.Gato;
import ejercicio_01.entidades.Perro;

public class ejercicio_1 {
    public static void main(String[] args) {
        Animal perro = new Perro("Bon","Carnívoro",8,"Boxer");
        Animal perro2 = new Perro("Nasus","Renektons",100000,"Egipcio");
        Animal gato = new Gato("Gatito","Atún",5,"Siames");
        Animal caballo = new Caballo("Ferrari","Pasto",3,"Purasangre");
        
        perro.alimentarse();
        perro2.alimentarse();
        gato.alimentarse();
        caballo.alimentarse();
        
        System.out.println(perro.toString());
        System.out.println(perro2.toString());
        System.out.println(gato.toString());
        System.out.println(caballo.toString());
    }
}
