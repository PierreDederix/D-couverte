package be.technifutur.decouverte.poo.scenario2;

public class Scenario2 {
    public static void main(String[] args) {
        VaisseauSecurise v1 = new VaisseauSecurise(5, "X-wing");
        VaisseauSecurise v2 = new VaisseauSecurise(5, "X-wing");
        VaisseauSecurise v3 = new VaisseauSecurise(5, "X-wing");
        VaisseauSecurise v4 = new VaisseauSecurise(5, "X-wing");
        VaisseauSecurise v5 = new VaisseauSecurise(5, "X-wing");
        v2.addMissile(5);
        v2.decoller();
        v3.decoller();
        v3.atterrir();
        v3.decoller();
        System.out.println(v2.getNbMissile());
        System.out.println(VaisseauSecurise.getNbvolant());
        System.out.println(VaisseauSecurise.getNbausol());

        v2.tirer();
        v2.tirer();
        v2.tirer();
        System.out.println(v2.getNbMissile());

        v2.addMissile(2);
        System.out.println(v2.getNbMissile());

        v2.tirer();
        System.out.println(v2.getNbMissile());

        v2.removeMissile(2);
        System.out.println(v2.getNbMissile());

        v2.tirer();
        v2.tirer();
        System.out.println(v2.getNbMissile());
        System.out.println(v2.getNom());
    }
}
