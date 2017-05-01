package wong.andrew.classmanager;

/**
 * Created by andrewwong on 5/1/17.
 */
public class Apple extends Product {
    private double price = 2.00;
    private int id = 1;
    private int quantity;

    public Apple(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
