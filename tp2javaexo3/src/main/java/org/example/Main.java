package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ordinateur ordinateur1 = new Ordinateur("hp", 3500, "il a 4G ram", 100, "A");
        Ordinateur ordinateur2 = new Ordinateur("mac", 8000, "32g ram", 250, "b");
        Ordinateur ordinateur3 = new Ordinateur("lenovo", 15000, "lokijhgf", 20, "c");

        List<Ordinateur> ordinateurs = new ArrayList<>();
        ordinateurs.add(ordinateur1);
        ordinateurs.add(ordinateur2);
        ordinateurs.add(ordinateur3);
        Categorie cat = new Categorie("cat1", "pc utilisee", ordinateurs);
        Client client = new Client("noura", "azemmour", "noura@gmail.com", "azemmour", "0689562341",
                new ArrayList<>());

        Commande commande1 = new Commande("ref1");

        LigneCommande ligne1 = new LigneCommande(1, commande1, ordinateur1);
        LigneCommande ligne2 = new LigneCommande(2, commande1, ordinateur2);
        LigneCommande ligne3 = new LigneCommande(3, commande1, ordinateur3);

        System.out.println("Commande : " + commande1.getReference());
        System.out.println("Client : " + client.getPrenom() );
        System.out.println("Ordinateurs commandés :");
        System.out.println(" - " + ordinateur1.getMarue() + ", Quantité : 1, Prix total : " + ordinateur1.getPrixPourQuantite(1));
        System.out.println(" - " + ordinateur2.getMarue() + ", Quantité : 2, Prix total : " + ordinateur2.getPrixPourQuantite(2));
        System.out.println(" - " + ordinateur3.getMarue() + ", Quantité : 3, Prix total : " + ordinateur3.getPrixPourQuantite(3));
    }
}



