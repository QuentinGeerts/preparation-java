package Theorie.Base.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demoCollections {
    public static void main(String[] args) {

    /*
        Collections :

        - Interface
            - Classe qui implémente l'interface

        - LIST
            - ArrayList : Tableau dynamique de taille variable
            - Vector : Tableau dynamique de taille variable
            - Stack : Mécanisme de pile de type LIFO
            - LinkedList : Liste chaînée utilisable comme une pile LIFO ou une file FIFO

        - MAP
            - Hashtable : Tableau associatif dont les clés ne peuvent être nulles
            - HashMap : Tableau associatif dont une clé et des valeurs peuvent être nulles
            - WeakHashMap : Tableau associatif où si une clé n'est plus référencée, la paire clé-valeur est ignorée
            - TreeMap : Tableau associatif dont les clés sont ordonnées par ordre croissant

        - SET
            - HashSet : Ensemble associé à un map
            - TreeSet : Ensemble associé à un TreeMap et dont les objets sont en ordre croissant

     */

        System.out.println(" --- LIST --- ");

        // ArrayList()
        // > Créer une instance vide de la collection avec une capacité initiale de 10

        List myDefaultArrayList = new ArrayList();

        // ArrayList(Collection<? extends E> c)
        // > Créer une instance contenant les éléments de la collection fournie en paramètre dans l'ordre obtenu en utilisant son iterator

        ArrayList myArrayListBasedOnAnotherList = new ArrayList(myDefaultArrayList);

        // ArrayList(int initialCapacity)
        // > Créer une instance vide de la collection avec la capacité initiale fournie en paramètre

        ArrayList myArrayListWithACapacity = new ArrayList(20);


        /*
            Méthodes
         */

        // boolean add(Object)
        // > Ajouter un élément à la fin du tableau

        System.out.println("\n--- boolean add(Object) ---\n");
        System.out.println("Élément ajouté ? : " + myDefaultArrayList.add("a"));
        System.out.println("Élément ajouté ? : " + myDefaultArrayList.add(1));
        System.out.println("Élément ajouté ? : " + myDefaultArrayList.add(true));

        System.out.println("\nmyDefaultArrayList : " + myDefaultArrayList);

        // boolean addAll(Collection)
        // > Ajouter tous les éléments de la collection fournie en paramètre à la fin du tableau

        System.out.println("\n--- boolean addAll(Collection) ---\n");
        System.out.println("Élémént(s) ajouté(s) : " + myDefaultArrayList.addAll(myDefaultArrayList));

        System.out.println("\nmyDefaultArrayList : " + myDefaultArrayList);

        // boolean addAll(int, Collection)
        // > Ajouter tous les éléments de la collection fournie en paramètre dans la collection à partir de la position précisée

        System.out.println("\n--- boolean addAll(int, Collection) ---\n");
        System.out.println("Élémént(s) ajouté(s) : " + myDefaultArrayList.addAll(2, new ArrayList(Arrays.asList(2, 4, 5, 6))));

        System.out.println("\nmyDefaultArrayList : " + myDefaultArrayList);

        // Object get(index)
        // > Renvoyer l'élément du tableau dont la position est précisée

        System.out.println("\n--- Object get(index) ---\n");
        System.out.println("Valeur à l'indice 5 : " + myDefaultArrayList.get(5));

        // void ensureCapacity(int)
        // > Augmenter la capacité du tableau pour s'assurer qu'il puisse contenir le nombre d'éléments passé en paramètre

        // Ne pas faire

        // int indexOf(Object)
        // > Renvoyer la position de la première occurrence de l'élément fourni en paramètre

        System.out.println("\n--- int indexOf(Object) ---\n");
        System.out.println("Position du premier l'élément 1 dans la liste : " + myDefaultArrayList.indexOf(1));

        // int lastIndexOf(Object)
        // > Renvoyer la position de la dernière occurrence de l'élément fourni en paramètre

        System.out.println("\n--- int lastIndexOf(Object) ---\n");
        System.out.println("Position du dernier élément 1 dans la liste : " + myDefaultArrayList.lastIndexOf(1));

        // boolean isEmpty()
        // > Indiquer si le tableau est vide

        System.out.println("\n--- boolean isEmpty() ---\n");
        System.out.println(myDefaultArrayList.isEmpty());

        // Object remove(int)
        // > Supprimer dans le tableau l'élément fourni en paramètre

        System.out.println("\n--- Object remove(int) ---\n");
        System.out.println("Élément retiré : " + myDefaultArrayList.remove(0));
        System.out.println(myDefaultArrayList);

        // boolean removeAll(Collection)
        // > Supprimer tous les éléments du tableau de la première position fournie incluse jusqu'à la dernière position fournie exclue

        System.out.println("\n--- boolean removeAll(Collection) ---\n");
        System.out.println( "Valeurs retirées ? " + myDefaultArrayList.removeAll(Arrays.asList("z")) );
        System.out.println( "Valeurs retirées ? " + myDefaultArrayList.removeAll(Arrays.asList(1, true, "z")) );

        System.out.println("\nmyDefaultArrayList : " + myDefaultArrayList);

        // Object set(int, Object)
        // > Remplacer l'élément à la position indiquée par celui fourni en paramètre

        System.out.println("\n--- Object set(int, Object) ---\n");
        System.out.println( "Ancienne valeur : " + myDefaultArrayList.set(0, 100) );

        System.out.println("\nmyDefaultArrayList : " + myDefaultArrayList);

        // int size()
        // > Renvoyer le nombre d'éléments du tableau

        System.out.println("\n--- int size() ---\n");
        System.out.println( myDefaultArrayList.size() );

        // void trimToSize()
        // > Ajuster la capacité du tableau sur sa taille actuelle

        // Ne pas faire

        // void clear()
        // > Supprimer tous les éléments du tableau

        System.out.println("\n--- void clear() ---\n");
        myDefaultArrayList.clear();

        System.out.println("\nmyDefaultArrayList : " + myDefaultArrayList);

    }
}
