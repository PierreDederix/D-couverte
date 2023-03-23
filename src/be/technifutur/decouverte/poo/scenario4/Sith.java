package be.technifutur.decouverte.poo.scenario4;

public class Sith extends Empire implements Force{
    public Sith(String nom){
        super(nom);
    }

    @Override
    public void utiliseForce(){
        System.out.println("J'électrifie et étrangle mes ennemis");
    }

    @Override
    public void combattre(){
        System.out.println("Je me bats au sabre laser en faisant des coups bas");
    }
}
