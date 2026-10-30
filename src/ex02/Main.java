package ex02;

import java.util.Scanner;

public class Main {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero de filas: ");
        int filas = sc.nextInt();

        System.out.println("Escribe el numero de columnas: ");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("Escribe los valores: " + "[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n--Matriz Original--");
        for (int i = 0; i < matriz.length; i++){
            System.out.print("\t| ");
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }

        int[][] nuevaMatriz = new int[3][columnas];

        for (int c = 0; c < columnas; c++){
            int suma = 0;
            int mayor = matriz[0][c];
            int menor = matriz[0][c];
            for(int f = 0; f < filas; f++){
                suma += matriz[f][c];
                if(matriz[f][c] > mayor ){
                    mayor = matriz[f][c];
                }
                if(matriz[f][c] < menor){
                    menor = matriz[f][c];
                }
            }
            nuevaMatriz[0][c] = suma;
            nuevaMatriz[1][c] = mayor;
            nuevaMatriz[2][c] = menor;

        }
        System.out.println("\n-- Matriz de resultados --");

        for(int i = 0; i < nuevaMatriz.length; i++) {
            System.out.print("\t| ");

            for (int j = 0; j < nuevaMatriz[i].length; j++) {
                System.out.print(nuevaMatriz[i][j] + " | ");
            }

            System.out.println();
        }

    }
}
