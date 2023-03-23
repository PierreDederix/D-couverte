package be.technifutur.decouverte.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

    public static void main(String[] args) {
        Set<Personne> hashSet = new TreeSet<>();
        System.out.println(hashSet.size());
        for (Personne p : Personne.getPersonnes()) {
            boolean add = hashSet.add(p);
            System.out.println(add);
        }
        System.out.println(hashSet.size());
        for (Personne p : hashSet) {
            System.out.println(p);
        }
    }
}
