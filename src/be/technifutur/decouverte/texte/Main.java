package be.technifutur.decouverte.texte;

public class Main {
    public static void main(String[] args) {
        String texte1 = "Bonjour";                                              // var texte1 : T <- "Bonjour"
        char lettre = ' ';                                                      // var lettre : C <- ' '

        System.out.println(texte1.length());                                    // afficher longueur(texte1)
        System.out.println(texte1.charAt(2));                            // afficher caract(texte1, 3)
        System.out.println(texte1.substring(3));                    // afficher souschaine(texte1, 3, longueur(texte1))
        System.out.println(texte1.substring(3, 6));        // afficher souschaine(texte1, 3, 6)

        int index=1;
        System.out.println("Le caractère se trouve à la position "+ (index+1));
        System.out.println(index+1+"est la position ");
        String result = index*index+""; // méthode de sloux
        result = String.valueOf(index*index);

        String multiline = """
                ligne1
                    ligne2
                """;
                System.out.println(multiline);

                String testFormat = String.format("Le caractère %s se trouve à la position %s %n", lettre, index+1);
                System.out.println(testFormat);
                String format ="Le caractère %s se trouve à la position %s %n";
                System.out.printf(format, lettre, index+1);


    }
}
