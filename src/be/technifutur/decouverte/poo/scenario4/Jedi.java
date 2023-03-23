package be.technifutur.decouverte.poo.scenario4;

public class Jedi extends Rebelle implements Force {
    public Jedi (String nom) {
        super(nom);
    }

    @Override
    public void utiliseForce(){
        System.out.println("Je désarme et repousse mes ennemis");
    }

    @Override
    public void combattre(){
        System.out.println("Je me bats au sabre laser avec discipline");
    }
}
