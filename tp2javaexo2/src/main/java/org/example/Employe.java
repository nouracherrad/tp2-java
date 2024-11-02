package org.example;

public abstract class Employe {
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    protected double salaire;
    public Employe(String nom, String prenom, String email, String telephone, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.salaire = salaire;
    }
    public Employe() {
    }
    public abstract double calculerSalaire();

    // Getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public double getSalaire() {
        return salaire;
    }
}
