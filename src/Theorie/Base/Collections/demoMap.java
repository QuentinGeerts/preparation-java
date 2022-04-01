package Theorie.Base.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class demoMap {
    public static void main(String[] args) {

        // Map : Ensemble de clefs/valeurs
        // Ex : Dictionnaire

        /*
            Constructeurs
         */

        HashMap<String, String> myHashMap = new HashMap<>();

        /*
            Méthodes
         */

        // Object put(Object, Object)
        //  > Insèrer la clé et sa valeur associée fournies en paramètres

        System.out.println("\n--- Object put(Object, Object) ---\n");

        System.out.println( "Précédente valeur associée à la clef : " + myHashMap.put( "00001", "Quentin" ));
        System.out.println( "Précédente valeur associée à la clef : " + myHashMap.put( "00002", "Benjamin" ));
        System.out.println( "Précédente valeur associée à la clef : " + myHashMap.put( "00003", "William" ));
        System.out.println( "Précédente valeur associée à la clef : " + myHashMap.put( "00004", "Antoine" ));
        System.out.println( "Précédente valeur associée à la clef : " + myHashMap.put( "00004", "Jérémy" ));

        System.out.println("myHashMap : " + myHashMap);

        // boolean containsKey(Object)
        //  > Indiquer si la clé est contenue dans la collection

        System.out.println("\n--- boolean containsKey(Object) ---\n");

        System.out.println( "Contient la clé '00001' ? : " + myHashMap.containsKey( "00001" ));
        System.out.println( "Contient la clé '00000' ? : " + myHashMap.containsKey( "00000" ));

        System.out.println("myHashMap : " + myHashMap);

        // boolean containsValue(Object)
        //  > Indiquer si la valeur est contenue dans la collection

        System.out.println("\n--- boolean containsValue(Object) ---\n");

        System.out.println( "Contient la valeur 'Quentin' ? : " + myHashMap.containsValue( "Quentin" ));
        System.out.println( "Contient la valeur 'Zozo' ? : " + myHashMap.containsValue( "Zozo" ));

        System.out.println("myHashMap : " + myHashMap);

        // Set entrySet()
        //  > Renvoyer un ensemble contenant les paires clé/valeur de la collection

        System.out.println("\n--- Set entrySet() ---\n");

        Set<Map.Entry<String,String>> returnedEntrySet = myHashMap.entrySet();

        for (Entry<String, String> entry: returnedEntrySet) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println( "Set retourné ? : " + returnedEntrySet);

        System.out.println("myHashMap : " + myHashMap);

        // Object get(Object)
        //  > Renvoyer la valeur associée à la clé fournie en paramètre

        System.out.println("\n--- Object get(Object) ---\n");

        System.out.println( "Valeur récupérée pour la clef '00001' : " + myHashMap.get( "00001" ));
        System.out.println( "Valeur récupérée pour la clef '00001' : " + myHashMap.get( "00000" ));

        System.out.println("myHashMap : " + myHashMap);

        // boolean isEmpty()
        //  > Indiquer si la collection est vide

        System.out.println("\n--- boolean isEmpty() ---\n");

        System.out.println( "HashMap vide ? : " + myHashMap.isEmpty());

        System.out.println("myHashMap : " + myHashMap);

        // Set keySet()
        //  > Renvoyer un ensemble contenant les clés de la collection

        System.out.println("\n--- Set keySet() ---\n");

        Set<String> returnedKeySet = myHashMap.keySet();

        for (String key: returnedKeySet) {
            System.out.println(key);
        }
        System.out.println( "Set retourné ? : " + returnedKeySet);

        System.out.println("myHashMap : " + myHashMap);

        // Collection values()
        //  > Renvoyer une collection qui contient toutes les valeurs des éléments

        System.out.println("\n--- Collection values() ---\n");

        Collection<String> returnedValues = myHashMap.values();

        for (String value: returnedValues) {
            System.out.println(value);
        }
        System.out.println( "Set retourné ? : " + returnedValues);

        System.out.println("myHashMap : " + myHashMap);

        // void putAll(Map)
        //  > Insèrer toutes les clés/valeurs de l'objet fourni en paramètre

        System.out.println("\n--- void putAll(Map) ---\n");

        myHashMap.putAll(new HashMap<>() {{ put( "00005", "Mélanie" ); put( "00006", "Éric" ); }});

        System.out.println("myHashMap : " + myHashMap);

        // Object remove(Object)
        //  > Supprimer l'élément dont la clé est fournie en paramètre

        System.out.println("\n--- Object remove(Object) ---\n");

        System.out.println( "Valeur retirée : " +  myHashMap.remove("00001"));
        System.out.println( "Valeur retirée ? : " + myHashMap.remove("00002", "Benjamin") );
        System.out.println( "Valeur retirée ? : " + myHashMap.remove("00003", "Benjamin") );

        System.out.println("myHashMap : " + myHashMap);

        // int size()
        //  > Renvoyer le nombre d'éléments de la collection

        System.out.println("\n--- int size() ---\n");

        System.out.println( "Nombre d'entrées dans le dictionnaire : " +  myHashMap.size());

        System.out.println("myHashMap : " + myHashMap);

        // void clear()
        //  > Supprimer tous les éléments de la collection

        System.out.println("\n--- void clear() ---\n");

        myHashMap.clear();

        System.out.println("myHashMap : " + myHashMap);

    }
}
