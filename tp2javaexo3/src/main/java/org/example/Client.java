package org.example;

import java.util.List;

public class Client {
    private String nom ;
    private String prenom ;
    private String adresse ;
    private  String email;
    private String ville ;
    private String telephone ;
    private List<Commande> commandes ;
    public Client(String prenom, String adresse, String email, String ville, String telephone, List<Commande> commandes) {
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.ville = ville;
        this.telephone = telephone;
        this.commandes = commandes;
    }
    public String getNom() {
        return nom;
    }public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getEmail() {
        return email;
    }

    public String getVille() {
        return ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }
     public void  ajouterCommande(Commande commande){
        if(!commandes.contains(commande)){
            commandes.add(commande);
        }
     }
     public void supprimerCommande(Commande commande){
        commandes.remove(commande);
     }
}
