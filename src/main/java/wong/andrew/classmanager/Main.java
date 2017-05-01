package wong.andrew.classmanager;

/**
 * Created by andrewwong on 5/1/17.
 */
public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[2];
        products[0] = new Apple(25);
        products[1] = new Banana(25);
       // products[2] = new Product(8.50, 2, 10);

        double sum = Inventory.sumUpInventoryValue(products);
        System.out.println(sum);
    }
}
