package ex01;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la dimension de filas: ");
        int filas = sc.nextInt();

        System.out.println("Introduce la dimension de columnas: ");
        int columnas = sc.nextInt();

        int[][] dimensiones = new int[filas][columnas];

        for (int i = 0; i < dimensiones.length; i++) {
            for (int j = 0; j < dimensiones[i].length; j++) {
                System.out.print("Introduce valor [ " + i + ", " + j + " ]: ");
                dimensiones[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n---Matriz Original---");
        for (int i = 0; i < dimensiones.length; i++) {
            for (int j = 0; j < dimensiones[i].length; j++) {
                System.out.print(dimensiones[i][j] + " | ");
            }
        }
        System.out.println();

        int[] sumaColumnas = new int[columnas];

        for (int j = 0; j < columnas; j++) {
            int suma = 0;
            for (int i = 0; i < filas; i++){
                suma += dimensiones[i][j];
            }
            sumaColumnas[j] = suma;
        }
        for (int i = 0; i < sumaColumnas.length; i++) {
            System.out.println("Suma de la columna " + i + ": " + sumaColumnas[i]);
        }

    }
}

//Crear una matriz de nxm de números enteros ingresados por el
//usuario, realizar la suma de cada columna y almacenarla en un
//vector de dimensión m.