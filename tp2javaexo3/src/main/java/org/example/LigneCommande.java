package org.example;

public class LigneCommande {
    private double quantité;
    private Commande commande ;
    private Ordinateur ordinateur ;

    public LigneCommande(double quantité, Commande commande, Ordinateur ordinateur) {
        this.quantité = quantité;
        this.commande = commande;
        this.ordinateur = ordinateur;
    }
    public double getQuantité() {
        return quantité;
    }
    public Commande getCommande() {
        return commande;
    }public Ordinateur getOrdinateur() {
        return ordinateur;
    }
}
