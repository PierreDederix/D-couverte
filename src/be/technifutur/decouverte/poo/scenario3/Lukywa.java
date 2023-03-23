package be.technifutur.decouverte.poo.scenario3;

public class Lukywa extends VaisseauAncetre{
    public Lukywa(String nom)
    {
        super(1, nom);
    }

    @Override
    public void tirer(){
        System.out.println("PAN");
    }
}
