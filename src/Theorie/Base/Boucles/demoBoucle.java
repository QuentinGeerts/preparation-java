package Theorie.Base.Boucles;

public class demoBoucle {
    public static void main(String[] args) {
        int[] myArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        /*
            while
         */

        System.out.println("\n --- While --- \n");
        int index = 0;
        while (index < myArray.length) {
            System.out.println("myArray[" + index + "] = " + myArray[index]);
            index++;
        }

        /*
            do ... while
         */

        System.out.println("\n --- Do while --- \n");
        index = 0;
        do {
            System.out.println("myArray[" + index + "] = " + myArray[index]);
            index++;
        } while(index < myArray.length);

        /*
            for
         */

        System.out.println("\n --- For --- \n");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("myArray[" + i + "] = " + myArray[i]);
        }


        /*
            foreach
         */

        System.out.println("\n --- Foreach --- \n");
        index = 0;
        for (int value : myArray) {
            System.out.println("myArray[" + index++ + "] = " + value);
        }

    }
}
