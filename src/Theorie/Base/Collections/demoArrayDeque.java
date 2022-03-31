package Theorie.Base.Collections;

import java.util.ArrayDeque;

public class demoArrayDeque {
    public static void main(String[] args) {

        // Peut fonctionner comme une Stack et/ou une Queue

        ArrayDeque myArrayDeque = new ArrayDeque();

        /*
            Méthodes
         */

        // void addFirst(Object)
        // > Ajouter l'élément au début du deck

        System.out.println( "\n --- void addFirst(Object) --- \n" );
        myArrayDeque.addFirst(1);
        myArrayDeque.addFirst(2);
        myArrayDeque.addFirst(3);
        myArrayDeque.addFirst(4);

        System.out.println("myArrayDeque : " + myArrayDeque);

        // void addLast(Object)
        // > Ajouter l'élément à la fin du deck

        System.out.println( "\n --- void addLast(Object) --- \n" );
        myArrayDeque.addLast(10);
        myArrayDeque.addLast(11);
        myArrayDeque.addLast(12);
        myArrayDeque.addLast(13);

        System.out.println("myArrayDeque : " + myArrayDeque);

        // Object removeFirst()
        // >Ajouter l'élément au début du deck

        System.out.println( "\n --- Object removeFirst() --- \n" );
        System.out.println( "Premier élément de la liste supprimé : " + myArrayDeque.removeFirst() );

        System.out.println("myArrayDeque : " + myArrayDeque);

        // Object removeLast()
        // >Ajouter l'élément à la fin du deck

        System.out.println( "\n --- Object removeLast() --- \n" );
        System.out.println( "Dernier élément de la liste supprimé : " + myArrayDeque.removeLast() );

        System.out.println("myArrayDeque : " + myArrayDeque);

        // Object getFirst()
        // > Récupérer le premier élément sans le retirer du deck

        System.out.println( "\n --- Object getFirst() --- \n" );
        System.out.println( "Premier élément : " + myArrayDeque.getFirst() );

        System.out.println("myArrayDeque : " + myArrayDeque);

        // Object getLast()
        // > Récupérer le dernier élément sans le retirer du deck

        System.out.println( "\n --- Object getLast() --- \n" );
        System.out.println( "Dernier élément : " + myArrayDeque.getLast() );

        System.out.println("myArrayDeque : " + myArrayDeque);



    }
}
