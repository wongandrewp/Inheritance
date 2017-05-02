package wong.andrew.classmanager;

/**
 * Created by andrewwong on 5/1/17.
 */
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Manager manager = new Manager(inventory);

        Product apple = new Product(2.00, 001, 100);
        Product banana = new Product(1.00, 002, 100);

        manager.addToInventory(apple);
        manager.addToInventory(banana);
        System.out.printf("Inventory value: $%.2f",manager.sumUpInventoryValue(inventory));
    }
}
