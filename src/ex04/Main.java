package ex04;

public class Main {
    static void main(String[] args) {

        int[][] matriX = new int[5][5];

        for( int i = 0; i < matriX.length; i ++){
            for (int j = 0; j < matriX[i].length; j++){
                if (i == j || i + j == 4 ){
                    System.out.print(" X ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
