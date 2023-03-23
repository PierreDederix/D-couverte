package be.technifutur.decouverte.poo.scenario2;

import java.util.Objects;

public class VaisseauSecurise {
    // variables d'instance, contiennent l'état de l'objet
    // initialisée par défaut à la valeur par défaut du type
    private String nom = "X-wing";
    private int nbMissile;
    private int maxMissile;
    private boolean volant;

    //variables de classe
    private static int nbvolant;
    private static int nbausol;

    public VaisseauSecurise(int maxMissile, String nom){
        this.maxMissile = maxMissile;
        // Objects.nonNull(nom);
        if (this.nom != null && nom.isBlank()) {
            this.nom = nom;
        }
        nbausol ++;
    }

    public VaisseauSecurise(int maxMissile){
        this(maxMissile,"Vaisseau inconnue");
    }


    // méthode d'instance
    public void tirer() {
        if (this.nbMissile > 0) {
            System.out.println("PAN");
            this.nbMissile --;
        }else{
            System.out.println("POUF");
        }
    }

    public int getNbMissile(){
        return this.nbMissile;
    }

    public String getNom(){
        return this.nom;
    }

    //méthode de classe
    public static int getNbvolant(){
        return nbvolant;
    }

    public static int getNbausol(){
        return nbausol;
    }

    public boolean addMissile(int nbMissile){
        boolean possible = false;
        if(nbMissile>0 && this.nbMissile + nbMissile <= this.maxMissile){
            possible = true;
            this.nbMissile+=nbMissile;
        }
        return possible;
    }

    public boolean removeMissile(int nbMissile){
        boolean possible = false;
        if(nbMissile>0 && nbMissile <= this.nbMissile){
            possible = true;
            this.nbMissile-=nbMissile;
        }
        return possible;
    }

    public void decoller(){
        if (volant) {
            System.out.println("Impossible de décoller, ce vaisseau est déjà en l'air");
        }else {
            volant = true;
            System.out.println("Le vaisseau " + this.nom + " décolle");
             nbvolant ++;
             if (nbausol>0){
                 nbausol --;
             }
        }
    }


    public void atterrir(){
        if (volant == false) {
            System.out.println("Impossible de se poser, ce vaisseau est déjà au sol");
        }else {
            volant = false;
            System.out.println("Le vaisseau " + this.nom + " atterrit");
            nbausol ++;
            if (nbvolant>0){
                nbvolant --;
            }
        }
    }
}
