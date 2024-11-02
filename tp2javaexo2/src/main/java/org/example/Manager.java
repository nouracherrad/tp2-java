package org.example;

public class Manager  extends Employe{
    private String service ;


    @Override
    public double calculerSalaire() {
        double salaire =getSalaire() + getSalaire()*0.20;
        return salaire ;

    }

    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    public String getService() {
        return service;
    }
}
