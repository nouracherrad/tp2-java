package org.example;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MetierProduitImpl metier = new MetierProduitImpl();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Menu :");
            System.out.println("1. Afficher la liste des produits");
            System.out.println("2. Rechercher des produits par mot clé");
            System.out.println("3. Ajouter un nouveau produit dans la liste");
            System.out.println("4. Récupérer et afficher un produit par ID");
            System.out.println("5. Supprimer un produit par ID");
            System.out.println("6. Quitter");
            System.out.print("Choisissez une option : ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    List<Produit> produits = metier.getAll();
                    produits.forEach(System.out::println);
                    break;

                case 2:
                    System.out.print("Entrez un mot clé : ");
                    String motCle = scanner.nextLine();
                    List<Produit> resultats = metier.findByNom(motCle);
                    resultats.forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Entrez l'ID : ");
                    long id = scanner.nextLong();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Entrez le nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrez la marque : ");
                    String marque = scanner.nextLine();
                    System.out.print("Entrez le prix : ");
                    double prix = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Entrez la description : ");
                    String description = scanner.nextLine();
                    System.out.print("Entrez le nombre en stock : ");
                    int nombreEnStock = scanner.nextInt();

                    Produit nouveauProduit = new Produit(id, nom, marque, prix, description, nombreEnStock);
                    metier.add(nouveauProduit);
                    break;

                case 4:
                    System.out.print("Entrez l'ID du produit : ");
                    long idToFind = scanner.nextLong();
                    Produit produitTrouve = metier.findById(idToFind);
                    System.out.println(produitTrouve != null ? produitTrouve : "Produit non trouvé.");
                    break;

                case 5:
                    System.out.print("Entrez l'ID du produit à supprimer : ");
                    long idToDelete = scanner.nextLong();
                    metier.delete(idToDelete);
                    System.out.println("Produit supprimé.");
                    break;

                case 6:
                    running = false;
                    break;

                default:
                    System.out.println("Option invalide, veuillez réessayer.");
                    break;
            }
        }

        scanner.close();
        System.out.println("Au revoir !");
    }
}



