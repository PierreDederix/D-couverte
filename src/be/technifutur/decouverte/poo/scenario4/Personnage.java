package be.technifutur.decouverte.poo.scenario4;

public abstract class Personnage {


    private String nom;

    public Personnage (String nom){
        if (nom != null &&! nom.isBlank()) {
            this.nom = nom;
        }
    }

    public  void utiliseForce(){

    }

    public String getNom(){return this.nom; }

    public abstract String getCamp();

    public abstract void combattre();


}
