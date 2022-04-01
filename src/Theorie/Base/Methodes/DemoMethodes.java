package Theorie.Base.Methodes;

import java.util.Arrays;

public class DemoMethodes {
    public static void main(String[] args) {
        direBonjour();
        direBonjourPrenom("Quentin");

        float nb1 = 0.1f, nb2 = 0.2f;
        float myResult = addition(nb1, nb2);
        System.out.println(nb1 + " + " + nb2 + " = " + myResult);

        int[] myIntTab = new int[] { 1, 2, 3, 4, 5 };

        for (int value : myIntTab) {
            System.out.print(value + " ");
        }

        System.out.println();

        tabRef(myIntTab);

        for (int value : myIntTab) {
            System.out.print(value + " ");
        }

    }

    public static void direBonjour() {
        System.out.println("Bonjour");
    }

    public static void direBonjourPrenom( String lastName ) {
        System.out.println("Bonjour " + lastName);
    }

    public static float addition(float number1, float number2) {
        return number1 + number2;
    }

    public static void tabRef(int[] int1) {
        int1[1] = 5;
    }
}
