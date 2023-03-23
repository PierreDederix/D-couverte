package be.technifutur.decouverte.collection;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Personne implements Comparable<Personne> {
    private String nom;
    private String prenom;
    private LocalDate naissance;

    public Personne(String nom, String prenom, LocalDate naissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.naissance = naissance;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getNaissance() {
        return naissance;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", naissance=" + naissance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Personne personne = (Personne) o;

        if (!Objects.equals(nom, personne.nom)) return false;
        if (!Objects.equals(prenom, personne.prenom)) return false;
        return Objects.equals(naissance, personne.naissance);
    }

    @Override
    public int hashCode() {
        int result = nom != null ? nom.hashCode() : 0;
        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
        result = 31 * result + (naissance != null ? naissance.hashCode() : 0);
        return result;
    }

    public static Personne[] getPersonnes (){
        Personne p = new Personne("Jean", "Paul", LocalDate.of(1964, 5,16));
        return new Personne[]{
                new Personne("Jean", "Paul", LocalDate.of(1964, 5,16)),
                new Personne("Jean", "Marie", LocalDate.of(1970, 4,8)),
                new Personne("Athan", "Jaune", LocalDate.of(2000,3,13)),
                new Personne("Chrome", "ShinyAnd", LocalDate.of(1988,7,27)),
                new Personne("Mionel","Lessi",LocalDate.of(1989,6,24)),
                new Personne("Neville", "Londubat",LocalDate.of(1960,5,2)),
                new Personne("Larry", "Bambelle", LocalDate.of(1989,2,18)),
                new Personne("Cristiano","Ronaldo",LocalDate.of(1985,2,5)),
                new Personne("Cristiano", "SIUUUU", LocalDate.of(1980,5,25)),
                new Personne("L'éponge", "Bob", LocalDate.of(1999, 6, 30)),
                new Personne("Daddy", "Tacos", LocalDate.of(2001, 6,1)),
                p,
                p
        };
    }

    @Override
    public int compareTo(Personne o) {
        int result;
        result = this.nom.compareTo(o.nom);
        if (result == 0){
            result = this.prenom.compareTo(o.prenom);
        }if (result == 0){
            result = this.naissance.compareTo(o.naissance);
        }
        return result;
    }
    public int getAge(){
        return Period.between(this.naissance, LocalDate.now()).getYears();
    }
}
