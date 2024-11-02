package org.example;

import java.util.ArrayList;
import java.util.List;

public class Categorie {
    private String nom ;
    private String description ;
    private List<Ordinateur> ordinateurs;

    public Categorie(String nom, String description, List<Ordinateur> ordinateurs) {
        this.nom = nom;
        this.description = description;
        this.ordinateurs = ordinateurs;
    }
    public String getNom() {
        return nom;
    }
    public String getDescription() {
        return description;
    }
    public List<Ordinateur> getOrdinateurs() {
        return ordinateurs;
    }
    public void supprimerordinateur(Ordinateur ordinateur) {
        ordinateurs.remove(ordinateur);
    }
    public void ajouterOrdinateur(Ordinateur ordinateur) {
        if (!ordinateurs.contains(ordinateur)) {
            ordinateurs.add(ordinateur);
        }}

        public List<Ordinateur> rechercherParPrix ( double prixCherchee){
            List<Ordinateur> ordinateurCherchee = new ArrayList<>();
            for (Ordinateur or : ordinateurs) {
                if (or.getPrix() <= prixCherchee) {
                    ordinateurCherchee.add(or);
                }
            }
            return ordinateurCherchee;
        }
    }


