package be.technifutur.decouverte.exercices;

import be.technifutur.decouverte.collection.MyComparator;
import be.technifutur.decouverte.collection.Personne;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercice1 {

    public static void main(String[] args) {

        List<Personne> base = new ArrayList<>(Arrays.asList(Personne.getPersonnes()));
        List<Personne> resultat = new ArrayList<>();

        /* base.forEach(p -> {
            if (p.getAge()<40){
                resultat.add(p);
            }
        });

        resultat.forEach(p -> {
            System.out.println(p.getPrenom()+" "+p.getAge());
        }); */

        List<String> grands = Arrays.asList(Personne.getPersonnes())
                .stream()
                .filter (p -> p.getAge()>30)
                .map(p -> p.getNom()+" agé de "+p.getAge())
                .sorted()
                .collect(Collectors.toList());

        long count = Arrays.asList(Personne.getPersonnes())
                .stream()
                .filter(p -> p.getAge() > 30)
                .count();

        Optional<Personne> max = Arrays.asList(Personne.getPersonnes())
                .stream()
                .filter(p -> p.getAge() > 30)
                .max(Comparator.comparing(Personne::getNaissance));

        if (max.isPresent()){
            System.out.println(max.get());
        } else {
            System.out.println("Nobody");
        }

        List<Personne> personneList = Arrays.asList(Personne.getPersonnes())
                .stream()
                .filter(p -> p.getNom().length() > 7)
                .distinct()
                // .sorted(new MyComparator()) solution alternative
                .sorted(Comparator.comparing(Personne::getAge)
                        .thenComparing(Personne::getNom)
                        .thenComparing(Personne::getPrenom))
                .toList();

        boolean booleanList = Arrays.stream(Personne.getPersonnes())
                .allMatch(p -> p.getAge() > 20);

        System.out.println("-------------------------------------");

    Arrays.stream(Personne.getPersonnes())
            .filter(p -> p.getNaissance().withYear(2023).isAfter(LocalDate.now()))
            .map(p -> String.format(" %s %s ", p.getNom(), p.getPrenom()))
            .forEach(System.out::println);


    }
}
