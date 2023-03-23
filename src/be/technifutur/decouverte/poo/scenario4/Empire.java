package be.technifutur.decouverte.poo.scenario4;

public abstract class Empire extends Personnage{
    public Empire(String nom){
        super(nom);
    }

    @Override
    public String getCamp(){
        return "Vive l'Empire";
    }
}
