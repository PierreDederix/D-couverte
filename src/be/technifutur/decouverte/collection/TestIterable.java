package be.technifutur.decouverte.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestIterable {

    public static void main(String[] args) {
        Personne[] personnes = Personne.getPersonnes();
        //testForEach(personnes);
        Iterable<Personne> personneIterable = Arrays.asList(personnes);

        Iterator<Personne> iterator = personneIterable.iterator();
        while (iterator.hasNext()){
            Personne personne = iterator.next();
            System.out.println(personne.getNom());
        }
        /* while (personneIterable.iterator().hasNext()){
            Personne personne = personneIterable.iterator().next();
            System.out.println(personne.getNom());
        } */

        for (Personne p : personneIterable){
            System.out.println(p.getPrenom());
        }
    }

    private static void testForEach(Personne[] personnes) {
        for (Personne p : personnes){
            System.out.println(p);
        }
    }
}
