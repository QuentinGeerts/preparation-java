package Exo.Base.Collections;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ExoCalculEcritAddition {

    public static void main(String[] args) {

        /*
            Demandez à l'utilisateur d'introduire deux nombres au clavier et faites
            l'addition de ces deux nombres en ne calculant que caractères par caractères.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez le premier nombre : ");
        String number1 = sc.nextLine();

        System.out.println("Entrez le second nombre : ");
        String number2 = sc.nextLine();

        Stack<Character> sNumber1 = new Stack<>();
        Stack<Character> sNumber2 = new Stack<>();

        for (int i = 0; i < number1.length(); i++) {
            sNumber1.push(number1.charAt(i));
        }
        for (int i = 0; i < number1.length(); i++) {
            sNumber2.push(number2.charAt(i));
        }

        int maxLength = sNumber1.size() > sNumber2.size() ? sNumber1.size() : sNumber2.size();
        Queue<String> sResult = new PriorityQueue<>();

        int report = 0;

        for (int i = 0; i < maxLength; i++) {
            int digit1 = sNumber1.size() > 0 ? Integer.parseInt(sNumber1.pop().toString()) : 0;
            int digit2 = sNumber2.size() > 0 ? Integer.parseInt(sNumber2.pop().toString()) : 0;

            int currentSum = digit1 + digit2 + report;

            System.out.println("Report = " + report);
            System.out.println(digit1 + " + " + digit2 + " + " + report + " = " + currentSum);

            if (currentSum > 9) {
                currentSum = currentSum - 10;
                report = 1;
            }

            sResult.offer(String.valueOf(currentSum));
        }

        System.out.println(sResult);

        String stringifyNumber = "";

        for (String digit : sResult) {
            stringifyNumber += digit;
        }

        int finalResult = Integer.parseInt(stringifyNumber);

        System.out.println(number1 + " + " + number2 + " = " + finalResult);


    }

}
