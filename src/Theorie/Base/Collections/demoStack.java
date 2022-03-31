package Theorie.Base.Collections;

import java.util.Stack;

public class demoStack {
    public static void main(String[] args) {

        // LIFO = Last In First Out
        // Exemple : Pile d'assiettes

        /*
            Constructeur
         */

        // Stack()
        // > Créer une stack vide

        Stack myStack = new Stack();

        /*
            Méthodes
         */

        // Object push(Object)
        // > Ajouter un élément en haut de la pile

        System.out.println("\n--- Object push(Object) ---\n");
        System.out.println("Élément ajouté : " + myStack.push(1));
        System.out.println("Élément ajouté : " + myStack.push(2));
        System.out.println("Élément ajouté : " + myStack.push(3));
        System.out.println("Élément ajouté : " + myStack.push(4));

        System.out.println("myStack : " + myStack);

        // Object pop()
        // > Retirer l'élément en haut de la pile

        System.out.println("\n--- Object pop() ---\n");
        System.out.println("Élément retiré : " + myStack.pop());
        System.out.println("Élément retiré : " + myStack.pop());

        System.out.println("myStack : " + myStack);

        // Object peek()
        // > Récupérer le dernier élément sans le retirer

        System.out.println("\n--- Object pop() ---\n");
        System.out.println("Dernier élément : " + myStack.peek());
        System.out.println("Dernier élément : " + myStack.peek());

        System.out.println("myStack : " + myStack);

        // boolean empty()
        // > Vider la stack

        System.out.println("\n--- boolean empty() ---\n");
        System.out.println("Stack vide ? : " + myStack.empty());

        // myStack.pop();
        // myStack.pop();
        System.out.println("Stack vide ? : " + myStack.empty());

        System.out.println("myStack : " + myStack);

        // int search()
        // > Récupérer l'index de l'élément recherché

        System.out.println("\n--- int search() ---\n");
        System.out.println("Index de l'élément 1 : " + myStack.search(1));
        System.out.println("Index de l'élément z : " + myStack.search('z'));

        System.out.println("myStack : " + myStack);

    }
}
