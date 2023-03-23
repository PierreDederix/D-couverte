package be.technifutur.decouverte.collection;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
//        testMap(new HashMap<>());
        Map<String, Set<Personne>> famille = getFamille(Personne.getPersonnes());

        for(Map.Entry<String, Set<Personne>> e : famille.entrySet()){
            System.out.println("Nom = " + e.getKey());
            for (Personne p : e.getValue()){
                System.out.println("Membres de la famille = " + p);
                System.out.println("Age " + p.getAge());
            }
            System.out.println("------------------------------------------------------------");
        }

        Map<Integer, Set<Personne>> decenie = getParDecenie(Personne.getPersonnes());
        for (Map.Entry<Integer, Set<Personne>> e : decenie.entrySet()) {
            // System.out.println("nom = " + e.getKey() + " \nfamille = " + e.getValue());
            System.out.println("========== ========== ========== " + e.getKey() + " ========== ========== ==========");
            for (Personne p :
                    e.getValue()) {
                System.out.println(p);
            }
        }


    }

    private static Map<Integer, Set<Personne>> getParDecenie(Personne[] personnes) {
        Map<Integer, Set<Personne>> dizaineMap = new TreeMap<>();
        for (Personne p : personnes) {
            int diz = p.getAge()/10*10;
            Set<Personne> familleSet = dizaineMap.get(diz);
            if (familleSet == null) {
                familleSet = new TreeSet<>(getComparator());

                dizaineMap.put(diz, familleSet);
            }
            familleSet.add(p);
        }
        return dizaineMap;
    }

    private static Comparator<Personne> getComparator() {
//        return new MyComparator();

//        Classe anonyme interne
//        return  new Comparator<Personne>() {
//            @Override
//            public int compare(Personne o1, Personne o2) {
//                return o1.getNaissance().compareTo(o2.getNaissance());
//            }
//        };

//        return (Personne o1, Personne o2)-> {
//                return o1.getNaissance().compareTo(o2.getNaissance());
//            };

//        return (o1, o2)-> o1.getNaissance().compareTo(o2.getNaissance());
        return Comparator.comparing(Personne::getNaissance)
                .thenComparing(Personne::getNom)
                .thenComparing(Personne::getPrenom);

        /*return TestMap::toto;*/
    }

    public static int toto(Personne p1, Personne p2){
        return p1.getNaissance().compareTo(p2.getNaissance());
    }

    private static Map<String, Set<Personne>> getFamille(Personne[] personnes) {
        LinkedHashMap<String, Set<Personne>> famillesMap = new LinkedHashMap<>();
        for (Personne p : Personne.getPersonnes()) {
            Set<Personne> personneSet = famillesMap.get(p.getNom());
            if(personneSet == null){
                personneSet= new HashSet<>();

                famillesMap.put(p.getNom(), personneSet);
            }
            personneSet.add(p);
        }
        return famillesMap;
    }

    private static void testMap(Map<String, Personne> map) {
        System.out.println("map.size() = " + map.size());
        for (Personne p : Personne.getPersonnes()) {
            System.out.println(map.put(p.getNom(), p));
        }
        System.out.println(map);
        System.out.println("map.size() = " + map.size());

        Iterator<String> stringIterator = map.keySet().iterator();
        Iterator<Personne> personneIterator = map.values().iterator();
        Iterator<Map.Entry<String, Personne>> entryIterator = map.entrySet().iterator();
        System.out.println("------------------------------------------------------------");
        while (stringIterator.hasNext()){
            String key = stringIterator.next();
            System.out.println(key);
            System.out.println(map.get(key));
        }
        System.out.println("------------------------------------------------------------");
        while (personneIterator.hasNext()){
            Personne next = personneIterator.next();
            System.out.println(next);
        }
        System.out.println("------------------------------------------------------------");
        while (entryIterator.hasNext()){
            Map.Entry<String, Personne> next = entryIterator.next();
            System.out.println("nom = " + next.getKey() + " \npersonne = " + next.getValue());
        }
    }
}
