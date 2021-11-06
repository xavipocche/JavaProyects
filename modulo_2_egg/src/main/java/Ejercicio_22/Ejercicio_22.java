package Ejercicio_22;
//Xavier
public class Ejercicio_22 {
    public static void main(String[] args) {
        int[] vector = new int[100];
        for(int i=0 ;i<=vector.length-1 ;i++){
            vector[i] = i+1;
        }
        for(int i=vector.length-1 ; i>=0; i--){
            System.out.print("[" + vector[i] + "]");
        }
    }
}
