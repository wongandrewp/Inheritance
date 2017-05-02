package wong.andrew.classmanager;

/**
 * Created by andrewwong on 5/2/17.
 */
public class Manager {
    private Inventory inventory = new Inventory();


    public Manager(){}
    public Manager(Inventory inventory){
        this.inventory = inventory;
    }

    public static double sumUpInventoryValue(Inventory inventory){
        double inventoryValue = 0;
        for(Product product : inventory.getProducts()) {
            double totalProductValue = product.getPrice() * product.getQuantity();
            inventoryValue += totalProductValue;
        }
        return inventoryValue;
    }

    public void addToInventory(Product product){
        inventory.getProducts().add(product);
    }

}
