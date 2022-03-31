package Theorie.Base.Collections;

import java.util.ArrayList;

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

        // Création d'une liste vide
        ArrayList myArrayList = new ArrayList();

        // Remplissage de la liste
        System.out.println(myArrayList.add(1));
        System.out.println(myArrayList.add('2'));
        System.out.println(myArrayList.add(true));
        System.out.println(myArrayList.add(4));


        int indexToFind = myArrayList.indexOf(false);
        if (indexToFind != -1) myArrayList.remove(indexToFind);

        System.out.println("Récupération de l'item à l'indice 2 : " + myArrayList.get(2));

        System.out.println("Nombre d'éléments dans la liste : " + myArrayList.size());

        System.out.println("Affichage avec une structure Foreach");
        for (Object element : myArrayList) {
            System.out.println(element);
        }

        System.out.println("Affichage avec une méthode forEach");
        myArrayList.forEach(element -> System.out.println(element));

        // boolean add(Object)	Ajouter un élément à la fin du tableau
        // boolean addAll(Collection)	Ajouter tous les éléments de la collection fournie en paramètre à la fin du tableau
        // boolean addAll(int, Collection)	Ajouter tous les éléments de la collection fournie en paramètre dans la collection à partir de la position précisée
        // void clear()	Supprimer tous les éléments du tableau
        // void ensureCapacity(int)	Augmenter la capacité du tableau pour s'assurer qu'il puisse contenir le nombre d'éléments passé en paramètre
        // Object get(index)	Renvoyer l'élément du tableau dont la position est précisée
        // int indexOf(Object)	Renvoyer la position de la première occurrence de l'élément fourni en paramètre
        // boolean isEmpty()	Indiquer si le tableau est vide
        // int lastIndexOf(Object)	Renvoyer la position de la dernière occurrence de l'élément fourni en paramètre
        // Object remove(int)	Supprimer dans le tableau l'élément fourni en paramètre
        // void removeRange(int, int)	Supprimer tous les éléments du tableau de la première position fournie incluse jusqu'à la dernière position fournie exclue
        // Object set(int, Object)	Remplacer l'élément à la position indiquée par celui fourni en paramètre
        // int size()	Renvoyer le nombre d'éléments du tableau
        // void trimToSize()	Ajuster la capacité du tableau sur sa taille actuelle



    }
}
