package be.technifutur.decouverte.poo.scenario3;

public class Millenium extends VaisseauAncetre {

    public Millenium(){
        super(10, "Millenium");
    }

    //overloading
    public void tirer(int nbmissile) {
        for (int i = 0; i < nbmissile; i++) {
            super.tirer();
        }
    }
}
