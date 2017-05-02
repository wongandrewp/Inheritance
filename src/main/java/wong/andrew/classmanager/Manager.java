package wong.andrew.classmanager;

/**
 * Created by andrewwong on 5/2/17.
 */
public class Manager {
    private Inventory inventory;

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

    public void removeFromInventory(Product product){
        inventory.getProducts().remove(product);
    }

    public void decreaseQuantityOfProductInInventory(Product product, int removedQuantity){
        int initialQuantity = product.getQuantity();
        product.setQuantity(initialQuantity - removedQuantity);
    }

    public void increaseQuantityOfProductInInventory(Product product, int increasedQuantity){
        int initialQuantity = product.getQuantity();
        product.setQuantity(initialQuantity + increasedQuantity);
    }
}
