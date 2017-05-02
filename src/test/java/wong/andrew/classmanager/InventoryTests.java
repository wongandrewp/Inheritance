package wong.andrew.classmanager;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by andrewwong on 5/1/17.
 */
public class InventoryTests {

    @Test
    public void sumUpInventoryValue_SimpleProducts_ReturnsSum(){
        //Arrange
        Product apple = new Product(2.00, 001, 5);
        Product banana = new Product(1.00, 002, 5);
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(apple);
        products.add(banana);

        Manager manager = new Manager();
        Inventory inventory = new Inventory(products);

        double expectedSum = 15.00;

        //Act
        double actualSum = manager.sumUpInventoryValue(inventory);

        //Assert
        assertEquals(expectedSum, actualSum, .001D);
    }

    @Test
    public void addToInventory_AddProduct_ProductAddedToInventory(){
        //Arrange
        Product orange = new Product(0.50, 003,1); //this product I want to add

        Manager manager = new Manager(); //initialize manager

        ArrayList<Product> products = new ArrayList<Product>(); //initialize an arraylist of products
        products.add(orange); //add orange to arraylist of products
        Inventory expectedInventory = new Inventory(products); //this is an expected inventory with an orange

        Inventory inventory = new Inventory(); //this is actual inventory that manager deals with

        //Act
        manager.addToInventory(orange); //adds orange to inventory

        //Assert
        assertEquals(expectedInventory, inventory); //assert both inventories have an orange
    }
}
