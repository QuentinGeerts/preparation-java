package Theorie.Base.Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class demoQueue {
    public static void main(String[] args) {

        // FIFO : First In First Out
        // Ex : File d'attente

        /*
            Constructeur
         */

        Queue myQueue = new PriorityQueue();

        /*
            Méthodes
         */

        // boolean add(Object)
        // > Ajouter l'élément en première position

        System.out.println("\n--- boolean add(Object) ---\n");
        System.out.println("Élément ajouté ? " + myQueue.offer(1));
        System.out.println("Élément ajouté ? " + myQueue.offer(2));
        System.out.println("Élément ajouté ? " + myQueue.offer(3));
        System.out.println("Élément ajouté ? " + myQueue.offer(4));

        System.out.println("myQueue : " + myQueue);

        // Object poll()
        // > Retirer l'élément en première position
        // Renvoie null si la queue est vide

        System.out.println("\n--- Object poll() ---\n");
        System.out.println("Élément retiré : " + myQueue.poll());
        System.out.println("Élément retiré : " + myQueue.poll());
        System.out.println("Élément retiré : " + myQueue.poll());
        System.out.println("Élément retiré : " + myQueue.poll());
        System.out.println("Élément retiré : " + myQueue.poll());

        System.out.println("myQueue : " + myQueue);

        // Object peek()
        // > Récupérer l'élément en première position sans le retirer de la queue
        // Renvoie null si la queue est vide

        System.out.println("\n--- Object peek() ---\n");
        System.out.println("Élément prioritaire : " + myQueue.peek());
        System.out.println("Élément prioritaire : " + myQueue.peek());

        System.out.println("myQueue : " + myQueue);

    }
}
