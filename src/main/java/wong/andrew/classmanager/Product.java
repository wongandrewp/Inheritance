package wong.andrew.classmanager;

/**
 * Created by andrewwong on 5/1/17.
 */
public class Product {

    private double price;
    private int id;
    private int quantity;

    public Product(){};
    public Product(double price, int id, int quantity) {
        this.price = price;
        this.id = id;
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
