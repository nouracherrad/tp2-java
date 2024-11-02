
# LAB 2 POO Java :Héritage, Redéfinition, Polymorphisme,Classes abstraites et interfaces.

## Table of Contents
1. [Introduction](#introduction)
2. [Exercise 1: Library Management System](#exercise-1-library-management-system)
   - [Class: `Personne`](#class-personne)
   - [Class: `Adherent`](#class-adherent)
   - [Class: `Auteur`](#class-auteur)
   - [Class: `Livre`](#class-livre)
   - [Class: `Main`](#class-main)
3. [Exercise 2: Salary Management System](#exercise-2-salary-management-system)
   - [Class: `Employe`](#class-employe)
   - [Class: `Ingenieur`](#class-ingenieur)
   - [Class: `Manager`](#class-manager)
   - [Class: `Main`](#class-main-2)
4. [Exercise 3: Client Orders Management System](#exercise-3-client-orders-management-system)
   - [Class: `Ordinateur`](#class-ordinateur)
   - [Class: `Categorie`](#class-categorie)
   - [Class: `Commande`](#class-commande)
   - [Class: `LigneCommande`](#class-lignecommande)
   - [Class: `Client`](#class-client)
   - [Class: `Main`](#class-main-3)
5. [Exercise 4: Product Management System](#exercise-4-product-management-system)
   - [Class: `Produit`](#class-produit)
   - [Class: `IMetierProduit`](#class-imetierproduit)
   - [Class: `MetierProduitImpl`](#class-metierproduitimpl)
   - [Class: `Application`](#class-application)
6. [Conclusion](#conclusion)

## Introduction
This document outlines the implementation of various Java programs designed to perform specific operations related to library management, salary management, client orders, and product management. Each program demonstrates the use of key object-oriented programming principles such as inheritance, method overriding, polymorphism, abstract classes, and interfaces.

The **inheritance** feature is utilized to create hierarchical relationships between classes, allowing derived classes to inherit attributes and methods from their base classes. This promotes code reuse and reduces redundancy. **Method overriding** is applied in several exercises to customize the behavior of inherited methods, providing flexibility in how methods are executed based on the object's type. **Polymorphism** is leveraged to enable objects of different classes to be treated as objects of a common superclass, facilitating dynamic method binding and enhancing code scalability.

Moreover, the implementation of **abstract classes** and **interfaces** exemplifies the importance of defining contracts for behavior without enforcing a specific implementation. This allows for more modular code where classes can implement these contracts in their own ways, promoting separation of concerns and adherence to the principles of loose coupling and high cohesion.

## Exercise 1: Library Management System

### Class: `Personne`
This class represents a person with attributes like name, surname, email, phone, and age. It includes a constructor to initialize these attributes and a method to display them.

### Class: `Adherent`
This class extends `Personne` and adds a `numAdherent` attribute while overriding the display method to include this new attribute.

### Class: `Auteur`
Similar to `Adherent`, this class also extends `Personne`, adding a `numAuteur` attribute and overriding the display method.

### Class: `Livre`
This class represents a book with attributes such as ISBN and author, along with a display method to show the book's details.

### Class: `Main`
The main application class where instances of `Adherent`, `Livre`, and `Auteur` are created, and their details are displayed.

**Learning Interest:** This exercise allows discovering the concept of method overriding.

## Exercise 2: Salary Management System

### Class: `Employe`
An abstract class that defines the common attributes for employees, including name, surname, email, phone, and salary. It also declares an abstract method to calculate the salary.

### Class: `Ingenieur`
This class extends `Employe` and implements the salary calculation method, incorporating a 15% salary increase.

### Class: `Manager`
Like `Ingenieur`, this class extends `Employe` but implements the salary calculation with a 20% increase.

### Class: `Main`
The main application class that creates instances of `Ingenieur` and `Manager`, displaying their details.

**Learning Interest:** This exercise focuses on the use of abstract methods in class design.

## Exercise 3: Client Orders Management System

### Class: `Ordinateur`
Represents a computer with attributes like name, brand, price, description, and stock quantity. It includes methods to manage pricing based on quantity.

### Class: `Categorie`
This class handles categories of computers, maintaining a list of computers and methods to add, remove, and search computers by price.

### Class: `Commande`
Represents an order with attributes for reference, client, order date, and status.

### Class: `LigneCommande`
An association class that links a specific order to a computer and includes quantity attributes.

### Class: `Client`
This class holds client information along with a list of orders and methods to manage them.

### Class: `Main`
The main application class that instantiates objects and displays order details.

**Learning Interest:** This exercise allows the use of an association class to model relationships between objects.

## Exercise 4: Product Management System

### Class: `Produit`
Represents a product with attributes like ID, name, brand, price, description, and stock quantity.

### Class: `IMetierProduit`
An interface that declares methods for managing product objects, including adding, retrieving, searching, and deleting products.

### Class: `MetierProduitImpl`
Implements the `IMetierProduit` interface, managing a list of products.

### Class: `Application`
The main application class that provides a menu for users to interact with the product management system.

**Learning Interest:** This exercise emphasizes the use of interfaces for modular design and implementation.

## Conclusion
The Java programs developed serve distinct purposes in managing library operations, employee salaries, client orders, and product inventories. Each program is structured into well-defined classes and methods, promoting modularity and reusability. By employing **inheritance**, the programs illustrate how shared functionality can be effectively implemented across related classes. The use of **method overriding** and **polymorphism** enhances the flexibility of method behaviors, allowing for dynamic decision-making at runtime.

Furthermore, the incorporation of **abstract classes** and **interfaces** demonstrates the significance of defining behavior contracts while allowing for diverse implementations. This approach fosters cleaner code architecture, enabling better maintainability and scalability as new functionalities or requirements emerge. Overall, these principles collectively enhance the clarity, organization, and effectiveness of the object-oriented design in the Java programs.

