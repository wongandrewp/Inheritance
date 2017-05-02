package wong.andrew.classmanager;

import java.util.ArrayList;
/**
 * Created by andrewwong on 5/1/17.
 */
public class Inventory {

    private ArrayList<Product> products = new ArrayList<>();

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public Inventory(ArrayList<Product> products){
        this.products = products;
    }

    public Inventory(){}

}
