package Ejercicio_18;
//Xavier
public class Ejercicio_18 {
    public static void main(String[] args) {
        String n;
        for(int i=0; i<1000; i++){
            n = Integer.toString(i);
            if(!n.contains("3")){
                System.out.println(n);
            }
            else{
                for(int j=0; j<n.length();j++){
                    if(n.substring(j,j+1).equals("3")){
                        System.out.println(n.replace("3","E"));
                        break;
                    }
                } 
            }
        }
    }
}