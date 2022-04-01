package Exo.Base.Collections;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class ExoNombresPremiers {

    public static void main(String[] args) {
        /*
            Grâce à une boucle "while" et à l'aide d'une collection,
            calculez les nombres premiers inférieur à une nombre entier
            entré au clavier.
         */

        Scanner sc = new Scanner(System.in);

        Queue PrimeNumbers = new PriorityQueue();
        System.out.println("Entrez un nombre (limite à atteindre) : ");
        int maxValue = Integer.parseInt(sc.nextLine());

        int currentValue = 2;

        while (currentValue < maxValue) {
            boolean isPrimeNumber = true;
            int divider = 2;

            while (divider < currentValue) {
                if (currentValue % divider == 0) isPrimeNumber = false;
                divider ++;
            }

            if (isPrimeNumber) PrimeNumbers.offer(currentValue);

            currentValue ++;
        }

        PrimeNumbers.forEach( number -> System.out.println(number + " ") );

    }

}
