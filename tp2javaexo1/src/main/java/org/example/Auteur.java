package org.example;

public class Auteur extends Personne{

   private int numAuteur;

    public int getNumAuteur() {
        return numAuteur;
    }

    public Auteur(String nom, String prenom, String email, String tel, int age, int numAuteur) {
        super(nom, prenom, email, tel, age);
        this.numAuteur = numAuteur;
    }

    public void afficher() {
        super.afficher();
        System.out.println("Numéro d'auteur : " + numAuteur);
    }
}
