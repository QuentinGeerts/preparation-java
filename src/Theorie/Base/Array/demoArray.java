package Theorie.Base.Array;

import java.util.Random;
import java.util.Scanner;

public class demoArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rng = new Random();

        /*
            Tableau à une dimension
         */

        System.out.println("\n --- Tableau à une dimension --- \n");
        int[] myArray = new int[5];
        System.out.println("Taille du tableau : " + myArray.length);

        // Accès à un indice hors de portée :
        // ArrayIndexOutOfException
        // System.out.println(myArray[5]);

        System.out.println("\nRemplissage du tableau :\n");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Entrez une valeur : ");
            myArray[i] = sc.nextInt();
        }

        System.out.print("\nParcours du tableau :\nmyArray : [");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
            if (i < myArray.length - 1) System.out.print(" - ");
        }
        System.out.println("]");

        System.out.println("\nTableau avec taille implicite :\n");

        int[] myArray2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < myArray2.length; i++) {
            System.out.println("myArray2[" + i + "] = " + myArray2[i]);
        }

        /*
            Tableau à plusieurs dimensions
         */

        System.out.println("\n --- Tableau à plusieurs dimensions --- \n");
        int[][] ints = new int[2][4];

        System.out.println("Taille du tableau : " + ints.length);
        System.out.println("Taille du tableau à l'indice 0 : " + ints[0].length);
        System.out.println("Taille du tableau à l'indice 1 : " + ints[1].length);
        System.out.println();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                ints[i][j] = rng.nextInt(10);
            }
        }

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.println("ints[" + i + "][" + j + "] = " + ints[i][j]);
            }
        }

        int[][][] ints1 = new int[3][3][3];

        for (int i = 0; i < ints1.length; i++) {
            for (int j = 0; j < ints1[i].length; j++) {
                for (int k = 0; k < ints1[i][j].length; k++) {
                    ints1[i][j][k] = rng.nextInt(10);
                    System.out.print(ints1[i][j][k]);
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
