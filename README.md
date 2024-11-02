# Project Repository for Java Exercises

This repository contains four Java exercises designed to enhance object-oriented programming skills, implement data management concepts, and explore practical applications of Java in various domains. Below is a detailed description of each exercise, including the objectives, classes implemented, and key functionalities.

## 1. Customer Order Management System
This exercise focuses on developing an application for managing customer orders in a computer sales company. The application facilitates the following functionalities:

- **Entities Managed**:
  - **Ordinateur**: Represents computers available for sale, with attributes such as:
    - `marque` (Brand)
    - `prix` (Price)
    - `description` (Description)
    - `nbrStock` (Stock Quantity)
    - `categorie` (Category)
    - The class includes a method `getPrixPourQuantite(int quantite)` to calculate the total price based on the ordered quantity.
  
  - **Categorie**: Groups computers into specific categories, allowing for organization and management. It includes:
    - `nom` (Name)
    - `description` (Description)
    - `ordinateurs` (List of Computers): Methods to add or remove computers from the category.

  - **Client**: Represents customers of the company, containing details such as:
    - `nom` (Last Name)
    - `prenom` (First Name)
    - `email` (Email Address)
    - `telephone` (Phone Number)
    - This class also manages a list of past orders made by the client.

  - **Commande**: Represents an order placed by a client with attributes like:
    - `reference` (Order Reference)
    - `dateCommande` (Order Date)
    - `etatDeCommande` (Order Status)
    - `client` (Client): A reference to the client who placed the order.

  - **LigneCommande**: An associative class that links a specific computer to a customer order, including:
    - `quantité` (Quantity)
    - `commande` (Order): A reference to the associated order.
    - `ordinateur` (Computer): A reference to the associated computer.

## 2. Library Management System
This exercise involves creating an application to manage books and library members. Key features of the system include:

- **Entities Managed**:
  - **Livre** (Book): Represents a book with attributes such as title, author, ISBN, and availability status.
  - **Adherent** (Member): Represents library members, storing personal details and a list of borrowed books.

- **Functionalities**:
  - Adding and removing books from the library.
  - Registering new members.
  - Checking out and returning books with appropriate tracking of availability.
  - Searching for books and members based on specific criteria.

## 3. Product Management with Interface Implementation
In this exercise, the focus is on manipulating a collection of product objects using lists and interfaces, providing a solid understanding of Java collections and polymorphism. 

- **Key Components**:
  - **Produit**: Represents products with the following attributes:
    - `id`: Unique identifier for the product.
    - `nom`: Name of the product.
    - `marque`: Brand of the product.
    - `prix`: Price of the product.
    - `description`: Description of the product.
    - `nombreEnStock`: Stock quantity available.

  - **IMetierProduit**: An interface that declares essential methods for managing product objects, including:
    - `add(Produit p)`: Adds a product to the list.
    - `getAll()`: Returns a list of all products.
    - `findByNom(String motCle)`: Finds products whose names contain the specified keyword.
    - `findById(long id)`: Retrieves a product by its ID.
    - `delete(long id)`: Deletes a product by its ID.

  - **MetierProduitImpl**: This class implements the `IMetierProduit` interface and manages a list of products. It provides concrete implementations for all methods defined in the interface, leveraging Java Streams for efficient querying.

- **User Interaction**: The application presents a console-based menu allowing users to perform operations such as adding, searching, retrieving, and deleting products interactively.



## Conclusion
These exercises aim to strengthen Java programming skills, emphasizing the use of object-oriented principles, data management techniques, and interface implementation. Each exercise is designed to be modular, well-documented, and can be executed independently. This repository serves as a comprehensive collection of practical programming exercises that are suitable for both learning and reference purposes.

Feel free to clone this repository and explore the code to deepen your understanding of Java programming concepts!
