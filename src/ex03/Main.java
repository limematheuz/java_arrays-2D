package ex03;

public class Main {
    static void main(String[] args) {

        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (i == 0 || i == 4 || i == j){
                    System.out.print(" X ");
                } else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
/*
 * Exercici 03: Dibuixar una figura amb una matriu
 *
 * 1. Declarar una matriu de 5 files i 5 columnes.
 *
 * 2. Recórrer tota la matriu amb dos bucles for:
 *    - Un bucle per recórrer les files.
 *    - Un bucle per recórrer les columnes.
 *
 * 3. Dibuixar la figura següent en una sola passada:
 *
 *    X X X X X
 *      X
 *        X
 *          X
 *    X X X X X
 *
 * 4. Utilitzar condicions if per determinar en quines
 *    posicions s'ha de mostrar una X.
 *
 * 5. A les posicions on no hi hagi una X, mostrar espais
 *    per mantenir l'alineació de la figura.
 *
 * 6. Mostrar cada fila en una línia diferent.
 *
 * 7. No utilitzar més d'un recorregut complet de la matriu
 *    per dibuixar la figura.
 */