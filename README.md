# Java Application Exercises

## Table of Contents
1. [Introduction](#introduction)
2. [Exercise 1: Library Management System](#exercise-1-library-management-system)
   - [Classes: `Person`, `Member`, `Author`, `Book`](#classes-person-member-author-book)
3. [Exercise 2: Salary Management System](#exercise-2-salary-management-system)
   - [Class: `Employee`, `Engineer`, `Manager`](#class-employee-engineer-manager)
4. [Exercise 3: Order Management System](#exercise-3-order-management-system)
   - [Classes: `Computer`, `Category`, `Client`, `Order`, `OrderLine`](#classes-computer-category-client-order-orderline)
5. [Exercise 4: Product Management System](#exercise-4-product-management-system)
   - [Classes: `Product`, `IMetierProduit`, `MetierProduitImpl`](#classes-product-imetierproduit-metierproduitimpl)
6. [Conclusion](#conclusion)

## Introduction
This document outlines the implementation of various Java applications designed for managing different systems, including a library, employee salaries, client orders, and product management. Each exercise is structured into classes with specific methods that encapsulate the functionalities required.

## Exercise 1: Library Management System

### Classes: `Person`, `Member`, `Author`, `Book`

In this exercise, we developed a library management system with the following classes:

- **`Person`**: The base class with attributes like name, first name, email, phone number, and age. It includes a constructor and a method to display these details.
  
- **`Member`**: Inherits from `Person` and adds a `memberNumber` attribute, overriding the display method to include member-specific information.

- **`Author`**: Also inherits from `Person`, with an additional `authorNumber` attribute and a custom display method for author details.

- **`Book`**: Represents a book with attributes for ISBN, title, and an associated author. It includes a display method to show the book's details.

### Class: `Main`

This class contains the `main()` method to test the implementation. It instantiates a member, an author, and a book, displaying their respective details.

## Exercise 2: Salary Management System

### Classes: `Employee`, `Engineer`, `Manager`

This exercise focuses on managing employee salaries within a software development company:

- **`Employee`**: An abstract class that includes attributes for name, first name, email, phone number, and salary. It defines an abstract method to calculate salary.

- **`Engineer`**: A subclass of `Employee` that includes a specialty attribute and implements the salary calculation method, applying a 15% increase.

- **`Manager`**: Another subclass of `Employee`, containing a service attribute and a method that calculates salary with a 20% increase.

### Class: `Main`

In this class, the `main()` method tests the functionality by creating instances of `Engineer` and `Manager`, then displays their details.

## Exercise 3: Order Management System

### Classes: `Computer`, `Category`, `Client`, `Order`, `OrderLine`

This exercise involves creating an order management system for a computer sales company:

- **`Computer`**: Represents a computer with attributes like name, brand, price, description, and stock quantity. It includes a method to return the price based on quantity.

- **`Category`**: Manages a list of computers with methods to add, remove, and search for computers by price.

- **`Client`**: Represents a customer with personal information and a list of orders. It includes methods to add and remove orders.

- **`Order`**: Contains details such as reference, client, order date, and order status.

- **`OrderLine`**: Associates an order with a specific computer and includes a quantity attribute.

### Class: `Main`

The `main()` method in this class allows for testing the various classes by creating instances of computers, categories, and orders, then displaying the complete order details.

## Exercise 4: Product Management System

### Classes: `Product`, `IMetierProduit`, `MetierProduitImpl`

This exercise centers on managing a collection of product objects:

- **`Product`**: Defines attributes for a product, including ID, name, brand, price, description, and stock quantity.

- **`IMetierProduit`**: An interface declaring methods for product management, such as adding, retrieving, searching by name, and deleting products.

- **`MetierProduitImpl`**: Implements the interface, managing a list of products and providing the defined methods.

### Class: `Main`

The `main()` method presents a menu to the user, allowing interactions such as displaying products, searching by keyword, adding products, retrieving by ID, and deleting products.

## Conclusion
The Java applications developed in these exercises demonstrate the application of object-oriented programming concepts such as inheritance, abstraction, and interface implementation. Each program is modular, enhancing code clarity and maintainability while providing practical solutions for real-world scenarios.
lone this repository and explore the code to deepen your understanding of Java programming concepts!
