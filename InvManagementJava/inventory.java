package InvManagementJava;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    // CRUD operation
    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item got added successfully!");
    }

    public void updateItem(int id, int quantity) {
        for (Item item : items) {
            if (item.getId() == id) {
                item.setQuantity(quantity);
                System.out.println("Item updated successfully!");
            }
        }
    }

    public void removeItem(int id) {
        items.removeIf(item -> item.getId() == id);
        System.out.println("Item got removed successfully!");
    }

    public void getInvReport() {
        System.out.println("Inventory Report:");
        for (Item item : items) {
            System.out.printf("ID: %d, Name: %s, Quantity: %d, Price: %.2f, Total Value: %.2f%n", item.getId(),
                    item.getName(), item.getQuantity(), item.getPrice(), item.getTotalPrice());
        }
    }

    public Item getItemById(int id){
        for(Item item: items){
            if(item.getId() == id){
                return item;             
            }
        }
        return null;
    }

}
