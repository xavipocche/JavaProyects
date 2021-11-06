package Ejercicio_27;
//Xavier
import java.util.Scanner;
public class Ejercicio_27 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        rellenar_matriz(matriz);
        System.out.println("La matriz ingresada es:");
        imprimir_matriz(matriz);
        matriz_magica(matriz);
    }
public static void rellenar_matriz(int matriz[][]){
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese los elementos de la matriz:");
    for(int i=0; i<=2; i++){
        for(int j=0; j<=2; j++){
            matriz[i][j] = leer.nextInt();
            //matriz[i][j] = (int)(Math.random()*10);
        }
    }
}
public static void imprimir_matriz(int matriz[][]){
    for(int i=0; i<=2; i++){
        for(int j=0; j<=2; j++){
            System.out.print("[" + matriz[i][j] + "]");
        }
        System.out.println("");
    }
}
public static void matriz_magica(int matriz[][]){    
    //Suma de diagonales
    int suma;
    int temp;
    int contador_sumas;
    suma = 0;
    temp = 0;
    contador_sumas = 0;
    
    //Diagonal principal
    for(int i=0; i<=2; i++){
        for(int j=0; j<=2; j++){
            if(i==j){
                suma = suma + matriz[i][j];
            }
        }
    }
    temp = suma;
    suma = 0;
    //Diagonal secundaria
    for(int i=0; i<=2; i++){
        for(int j=0; j<=2; j++){
            if(i+j == 2){
                suma = suma + matriz[i][j];
            }
        }
    }
    System.out.println("Suma diagonales:");
    System.out.println(temp);
    System.out.println(suma);
    if(temp == suma){
        //Suma filas
        System.out.println("Suma filas:");
        suma = 0;
        for(int i=0; i<=2; i++){
            for(int j=0; j<=2; j++){
                suma = suma + matriz[i][j];
                if(j == 2){
                    System.out.println(suma);
                    if(suma != temp){
                        i = 2;
                        j = 2;
                    }
                    else{
                        temp = suma;
                        contador_sumas = contador_sumas + 1;
                        suma = 0;
                    }
                }
            }
            
        }
        
        if(contador_sumas == 3){
            //Suma Columnas
            System.out.println("Suma columnas:");
            for(int j=0; j<=2; j++){
                for(int i=0; i<=2; i++){
                    suma = suma + matriz[j][i];
                    if(i == 2){
                        System.out.println(suma);
                        if(suma != temp){
                        i = 2;
                        j = 2;
                    }
                    else{
                        temp = suma;
                        contador_sumas = contador_sumas + 1;
                        suma = 0;
                        }
                    }
                }
            }
        }
    }
    else{
        System.out.println("La matriz no es mágica");
    }
    if(contador_sumas == 6){
        System.out.println("La matriz es mágica");
    }
    else{
        System.out.println("La matriz no es mágica");
    }
}

}