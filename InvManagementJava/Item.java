package InvManagementJava;

public class Item {
    int id;
    String name;
    int quantity;
    double price;

    public Item(int id, String name, int quantity, double price2){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price2;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setQuantity(int quantity){
       this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPrice(){
        return price;
    }
    public double getTotalPrice() {
        return quantity * price;
    }
}
