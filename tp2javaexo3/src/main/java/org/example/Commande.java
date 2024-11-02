package org.example;

import java.util.Date;

public class Commande {
    private String reference ;
    private String client ;
    private Date dateCommande ;
    private String etatDeCommande ;

    public Commande(String reference) {
        this.reference = reference;
        this.client = client;
        this.dateCommande = dateCommande;
        this.etatDeCommande = etatDeCommande;
    }

    public String getReference() {
        return reference;
    }

    public String getClient(


    ) {
        return client;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public String getEtatDeCommande() {
        return etatDeCommande;
    }

    public Commande() {
    }
}
