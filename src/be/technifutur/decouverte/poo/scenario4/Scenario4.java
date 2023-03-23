package be.technifutur.decouverte.poo.scenario4;

public class Scenario4 {
    public static void main(String[] args) {
        Personnage [] pers = {
                new Soldat("Léon"),
                new Jedi("Luc"),
                new Sith("Darkvador"),
                new Clone(),
        };
        Force f;

        for(Personnage p : pers){
            System.out.println(p.getNom());
            System.out.println(p.getCamp());
            if (p instanceof Force) {
                f = (Force) p;
                p.utiliseForce();
            }
            p.combattre();
        }
    }
}
