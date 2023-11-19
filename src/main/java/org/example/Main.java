package org.example;

import java.util.HashSet;

/*

    Scrivere una funzione che restituisca un HashSet riempito
    Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
    Verificare che l' elemento sia parte del Set e stampare il risultato

 */
public class Main {
    public static void main(String[] args) {

        HashSet<String> set = setCreator();
        printSet(set);

        HashSet<String> newSet = new HashSet<>(set);
        newSet.add("canarino");

        String elemento = "canarino";
        System.out.println("L'elemento " + elemento + " è presente nel set? " + set.contains(elemento));

    }
    public static void printSet(HashSet set) {
        System.out.println("Stampo il set: ");
        for (Object o : set) {
            System.out.println(o);
        }
    }

    public static HashSet<String> setCreator() {
        HashSet<String> set = new HashSet<>();
        set.add("cavallo");
        set.add("cane");
        set.add("gatto");
        return set;
    }
}