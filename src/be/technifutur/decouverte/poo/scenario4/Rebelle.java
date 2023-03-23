package be.technifutur.decouverte.poo.scenario4;

public abstract class Rebelle extends Personnage {
    public Rebelle(String nom){
        super(nom);
    }

    @Override
    public String getCamp(){
        return "Vive la révolution";
    }
}

