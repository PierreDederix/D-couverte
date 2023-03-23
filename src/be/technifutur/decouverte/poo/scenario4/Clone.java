package be.technifutur.decouverte.poo.scenario4;

public class Clone extends Empire{
    public Clone (){
        super("Clone");
    }

    @Override
    public void combattre(){
        System.out.println("Je tire tout le temps à côté");
    }
}
