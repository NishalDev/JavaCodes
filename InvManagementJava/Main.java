package InvManagementJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWelcome to the Inventory Management System");
            System.out.println("1. Add Item");
            System.out.println("2. Update Item");
            System.out.println("3. Remove Item");
            System.out.println("4. View Inventory Report");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Item id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Item name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter Item quantity: ");
                    int quantity = sc.nextInt();
                    System.out.println("Enter Price of the Item: ");
                    double price = sc.nextDouble();
                    Item newItem = new Item(id, name, quantity, price);
                    inv.addItem(newItem);
                    break;
                case 2:
                    System.out.print("Enter item ID to update: ");
                    int updateId = sc.nextInt();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = sc.nextInt();
                    inv.updateItem(updateId, newQuantity);
                    break;
                case 3:
                    System.out.print("Enter item ID to remove: ");
                    int removeId = sc.nextInt();
                    inv.removeItem(removeId);
                    break;
                case 4:
                    inv.getInvReport();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option! Please choose again.");
            }
        } while (choice != 5);
        sc.close();
    }
}
