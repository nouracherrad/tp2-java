package org.example;

 public class Ingénieur extends Employe {
    private String specialite;

    public Ingénieur(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    @Override
    public double calculerSalaire() {
        double salaire =getSalaire() * 1.15;
        return salaire ;
    }


    public String getSpecialite() {
        return specialite;
    }
}

