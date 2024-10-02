# Inventory Management System

This is a simple Java-based Inventory Management System that allows users to add, update, remove, and view items in an inventory. The system uses an object-oriented approach to manage items and their details such as ID, name, quantity, and price.

## Features

Add Item: Add a new item to the inventory by providing an ID, name, quantity, and price.
Update Item: Update the quantity of an item using its ID.
Remove Item: Remove an item from the inventory by providing its ID.
View Inventory Report: Display all the items currently in the inventory along with their details.

## Getting Started

Prerequisites
Java Development Kit (JDK) installed.
A Java IDE or text editor (e.g., IntelliJ IDEA, Eclipse, or VS Code).

## Usage

When you run the program, you will be presented with the following options:

Welcome to the Inventory Management System
1. Add Item
2. Update Item
3. Remove Item
4. View Inventory Report
5. Exit

# Adding an Item
You will be prompted to enter the item's ID, name, quantity, and price.

Enter Item id: 1
Enter Item name: Apple
Enter Item quantity: 50
Enter Price of the Item: 0.99
Item added successfully!

# Updating an Item
You will be prompted to enter the item's ID and the new quantity.

Enter item ID to update: 1
Enter new quantity: 100
Item updated successfully!

# Removing an Item
You will be prompted to enter the item's ID to remove.

Enter item ID to remove: 1
Item removed successfully!

# Viewing Inventory Report
You can view the entire inventory, including all items and their details.

ID: 1, Name: Apple, Quantity: 50, Price: $0.99

## Project files

Item.java: Represents an individual item with attributes like ID, name, quantity, and price.
Inventory.java: Manages the list of items, allowing for adding, removing, and updating items.
Main.java: Contains the main method, which interacts with the user through a simple command-line interface.
