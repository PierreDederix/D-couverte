package be.technifutur.decouverte.structure;

import java.util.Scanner;

public class Stagiaires {
    public static void main(String[] args) {
        Personne[] stagiaires = new Personne[4];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < stagiaires.length; i++) {
            stagiaires[i] = new Personne();
            System.out.print("Nom : ");
            stagiaires[i].nom = scan.nextLine();
            System.out.print("Prenom : ");
            stagiaires[i].prenom = scan.nextLine();
            stagiaires[i].naissance = new MyDate();
            System.out.println("Date de naissance : ");
            System.out.print("jour : ");
            stagiaires[i].naissance.jour = Integer.parseInt(scan.nextLine());
            System.out.print("mois : ");
            stagiaires[i].naissance.mois = Integer.parseInt(scan.nextLine());
            System.out.print("an : ");
            stagiaires[i].naissance.an = Integer.parseInt(scan.nextLine());

            System.out.println(stagiaires[i].nom+" "+stagiaires[i].prenom+" "+stagiaires[i].naissance.jour+"/"+stagiaires[i].naissance.mois+"/"+stagiaires[i].naissance.an);
        }
    }
}
