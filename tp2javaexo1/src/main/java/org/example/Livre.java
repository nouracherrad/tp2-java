package org.example;

public class Livre {
    private int ISBN;
    private String titre;
    private Auteur auteur;
    public Livre(int ISBN, String titre, Auteur auteur) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteur = auteur;
    }
    public int getISBN() {
        return ISBN;
    }
    public String getTitre() {
        return titre;
    }
    public Auteur getAuteur() {
        return auteur;
    }
    public void afficher() {
        System.out.println("ISBN : " + ISBN + ", Titre : " + titre);
        System.out.print("Auteur : ");
        auteur.afficher();
    }
}
