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
                System.out.print("Introduce valor ( " + i + ", " + j + " ): ");
                dimensiones[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < dimensiones.length; i++) {
            for (int j = 0; j < dimensiones[i].length; j++) {
                System.out.print(dimensiones[i][j] + " | ");
            }
        }

        int suma = 0;
        for (int i = 0; i < dimensiones.length; i++) {
            for (int j = 0; j < dimensiones[i].length; j++) {
                suma += dimensiones[i][i];
            }
        }
        System.out.println("la suma de las columnas: " + suma);

//        double sumaColumna = new double[i][i];
    }
}

//Crear una matriz de nxm de números enteros ingresados por el
//usuario, realizar la suma de cada columna y almacenarla en un
//vector de dimensión m.