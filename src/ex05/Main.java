package ex05;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] matriz = new double[5][6];
//        String[] alumno = new String[5];
        String[] alumno = {"Mat", "Juh", "Bia", "Ama", "Cel"};


        for (int i = 0; i < matriz.length; i++){
//            System.out.print("Introduce el alumno: ");
//            alumno[i] = sc.nextLine();
            for( int j = 0; j < matriz[i].length -3; j++){
                System.out.print("Introduce la nota parcial de " + alumno[i] + " : ");
                matriz[i][j]= sc.nextDouble();
            }
            sc.nextLine();
        }

        double mejor = matriz[0][0];
        double peor = matriz[0][0];

        for(int i = 0; i < matriz.length; i++){
            double suma = 0;
            double promedio = 0;
            double mayor = matriz[i][0];
            double menor = matriz[i][0];

            for (int j =0 ; j < matriz[i].length -3; j++){
                suma += matriz[i][j];
                promedio = suma/ 3;
                if (matriz[i][j] > mayor ){
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] < menor){
                    menor = matriz[i][j];
                }
                if (matriz[i][j] > mejor){
                    mejor = matriz[i][j];
                }
                if (matriz[i][j] < peor){
                    peor = matriz[i][j];
                }
            }
            matriz[i][3] = promedio;
            matriz[i][4] = mayor;
            matriz[i][5] = menor;
        }


        //pintar la matriz con los nombres y notas
        for (int i = 0; i < matriz.length; i++){
            System.out.print(alumno[i] + " \t ");
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf("%.1f | ", matriz[i][j] );
            }
            System.out.println();
        }

        System.out.println("La mejor nota es: " + mejor);
        System.out.println("La peor nota es: " + peor);

    }
}
