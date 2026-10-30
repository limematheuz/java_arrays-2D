package ex05;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] matriz = new double[20][6];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Alumno " + (i + 1) + " - Introduce la nota " + (j + 1) + ": ");
                matriz[i][j] = sc.nextDouble();
            }
        }

        double mejorNota = matriz[0][0];
        double peorNota = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {

            double suma = 0;
            double mayor = matriz[i][0];
            double menor = matriz[i][0];

            for (int j = 0; j < 3; j++) {

                suma += matriz[i][j];

                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }

                if (matriz[i][j] > mejorNota) {
                    mejorNota = matriz[i][j];
                }

                if (matriz[i][j] < peorNota) {
                    peorNota = matriz[i][j];
                }
            }

            matriz[i][3] = suma / 3;
            matriz[i][4] = mayor;
            matriz[i][5] = menor;
        }

        System.out.println("\n-- Matriz de resultados --");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Alumno " + (i + 1) + " | ");

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " | ");
            }

            System.out.println();
        }

        System.out.println("\nMejor nota del curso: " + mejorNota);
        System.out.println("Peor nota del curso: " + peorNota);

    }
}