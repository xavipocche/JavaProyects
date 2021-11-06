package Ejercicio_26;
import java.util.Scanner;
//Xavier
public class Ejercicio_26 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int filas,columnas;
        System.out.println("Ingrese filas y columnas de la matriz:");
        filas = leer.nextInt();
        columnas = leer.nextInt();
        int matriz[][] = new int [filas][columnas];
        rellenar_matriz(matriz,filas,columnas);
        System.out.println("La matriz ingresada es:");
        imprimir_matriz(matriz,filas,columnas);
        antisimetrica(matriz,filas,columnas);
        
    }
public static void rellenar_matriz(int matriz[][],int filas, int columnas){
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese los elementos de la matriz:");
    for(int i=0; i<=filas-1; i++){
        for(int j=0; j<=columnas-1; j++){
            matriz[i][j] = leer.nextInt();
        }
    }
}
public static void imprimir_matriz(int matriz[][],int filas, int columnas){
    for(int i=0; i<=filas-1; i++){
        for(int j=0; j<=columnas-1; j++){
            System.out.print("[" + matriz[i][j] + "]");
        }
        System.out.println("");
    }
}
public static void antisimetrica(int matriz[][],int filas, int columnas){
    int[][] matriz_traspuesta_opuesta = new int[columnas][filas];
    int contador_igualdad;
    contador_igualdad = 0;
    for(int j=0; j<=columnas-1; j++){
        for(int i=0; i<=filas-1; i++){
            matriz_traspuesta_opuesta[j][i] = matriz[i][j]*-1;
        }
    }
    System.out.println("La matriz traspuesta opuesta es:");
    for(int i=0; i<=columnas-1; i++){
        for(int j=0; j<=filas-1; j++){
            System.out.print("[" + matriz_traspuesta_opuesta[i][j] + "]");
        }
        System.out.println("");
    }
    if(filas == columnas){
        for(int i=0; i<=filas-1; i++){
            for(int j=0; j<=columnas-1; j++){
                if(matriz[i][j] == matriz_traspuesta_opuesta[i][j]){
                    contador_igualdad = contador_igualdad + 1;
                }
            }
        }
    }           
    else{
        for(int i=0; i<=filas-1; i++){
            for(int j=0; j<=columnas-1; j++){
                if(matriz[i][j] == matriz_traspuesta_opuesta[j][i]){
                    contador_igualdad = contador_igualdad + 1;       
                }   
            }
        }
    }
    if(contador_igualdad == filas*columnas){
        System.out.println("La matriz es antisimétrica");
    }
    else{
        System.out.println("La matriz no es antisimétrica");
    }   
}
}