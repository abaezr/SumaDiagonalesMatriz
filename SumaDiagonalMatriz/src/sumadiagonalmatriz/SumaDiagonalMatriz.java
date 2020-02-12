/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumadiagonalmatriz;
import java.util.Scanner;
/**
 *
 * @author andresbaezrincon
 */
public class SumaDiagonalMatriz {

    public static void main(String[] args) {
        int vector[][] = new int [100][100];
        int suma1=0,suma2=0;
        System.out.print("Ingrese el tamaño de la matriz nxn(Maximo 100): ");
        Scanner num = new Scanner (System.in);
        int n = num.nextInt();
        System.out.println("Matriz "+n+"x"+n+": ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("Ingrese el numero de la fila "+(i+1)+", columna "+(j+1)+": ");
                int numerov = num.nextInt();
                vector[i][j] = numerov;
            }
        }
        System.out.println("\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(vector[i][j]+" ");
            suma1+=vector[i][i];
            suma2+=vector[n-i-1][i];
            System.out.print("\n");
        }
        System.out.println("La suma de la diagonal Principal es: "+suma1);
        System.out.println("La suma de la diagonal inferior es: "+suma2);
        System.out.println("La suma de las diagonales es: "+(suma1+suma2));
    }
    
}
