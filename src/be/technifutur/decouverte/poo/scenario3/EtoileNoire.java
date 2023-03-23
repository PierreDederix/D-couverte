package be.technifutur.decouverte.poo.scenario3;

public class EtoileNoire {

    public void attireVaisseau(VaisseauAncetre v){
        if (v instanceof Millenium){
            attireVaisseau((Millenium) v);
        } else if (v instanceof Xwing) {
            attireVaisseau((Xwing) v);
        } else {
            v.atterrir();
            System.out.println("vaisseau attiré");
            v.afficheCamps();
            v.decoller();
        }
    }
    public void attireVaisseau(Millenium m){
        m.atterrir();
        System.out.println("vaisseau attiré");
        m.afficheCamps();
        System.out.println("A l'aide Obi-Wan");
        m.tirer(3);
        m.decoller();
    }
    public void attireVaisseau(Xwing x){
        x.atterrir();
        System.out.println("vaisseau attiré");
        x.afficheCamps();
        System.out.println("A vos ordres, Dark Vador");
        x.decoller();
    }
}
