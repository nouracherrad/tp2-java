package org.example;
public class Produit {
    private long id;
    private String nom;
    private String marque;
    private double prix;
    private String description;
    private int nombreEnStock;

    // Constructeur
    public Produit(long id, String nom, String marque, double prix, String description, int nombreEnStock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nombreEnStock = nombreEnStock;
    }

    // Getters et setters
    public long getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getMarque() {
        return marque;
    }
    public double getPrix() {
        return prix;
    }
    public String getDescription() {
        return description;
    }public int getNombreEnStock() {
        return nombreEnStock;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", description='" + description + '\'' +
                ", nombreEnStock=" + nombreEnStock +
                '}';
    }
}

