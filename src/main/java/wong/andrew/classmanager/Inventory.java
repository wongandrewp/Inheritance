package wong.andrew.classmanager;

/**
 * Created by andrewwong on 5/1/17.
 */
public class Inventory {
    public static double sumUpInventoryValue(Product[] products){
        double inventoryValue = 0;
        for(Product product : products) {
            double totalProductValue = product.getPrice() * product.getQuantity();
            inventoryValue += totalProductValue;
        }
        return inventoryValue;
    }

}
