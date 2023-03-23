package be.technifutur.decouverte.poo.scenario1;

public class Scenario1 {

    public static void main(String[] args) {
        vaisseau v1 = new vaisseau();
        v1.nom = "Xwing";
        v1.nbMissile = -5;

        System.out.println(v1.nbMissile);

        v1.tirer();
        v1.tirer();
        v1.tirer();
        v1.tirer();
        v1.tirer();
        v1.tirer();
        System.out.println(v1.nbMissile);
    }
}
