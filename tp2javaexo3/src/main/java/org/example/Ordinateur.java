package org.example;

public class Ordinateur {
    private String nom ;
    private String marue ;
     private double prix ;
     private String description ;
     private int nbrStock ;
     private  String categorie ;

    public Ordinateur(String marue, double prix, String description, int nbrStock, String categorie) {
        this.marue = marue;
        this.prix = prix;
        this.description = description;
        this.nbrStock = nbrStock;
        this.categorie = categorie;
    }
    public String getNom() {
        return nom;
    }
    public String getMarue() {
        return marue;
    }
    public double getPrix() {
        return prix;
    }

    public int getNbrStock() {
        return nbrStock;
    }



    public double getPrixPourQuantite(int quantite) {
         double prixtotal =prix * quantite;
        return prixtotal;
    }
}
