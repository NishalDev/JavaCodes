package JavaMiniproject;

public class Item {
    int id;
    String name;
    int quantity;
    double price;

    public Item(int id, String name, int quantity, int price){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return quantity * price;
    }
}
