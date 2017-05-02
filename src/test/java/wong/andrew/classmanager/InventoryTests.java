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


        Inventory inventory = new Inventory(products);
        Manager manager = new Manager(inventory);
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
        Inventory inventory = new Inventory(); //this is actual inventory that manager deals with'
        Manager manager = new Manager(inventory); //initialize manager
        int startSize = inventory.getProducts().size();
        int expectedSize = startSize + 1;

        //Act
        manager.addToInventory(orange); //adds orange to inventory

        //Assert
        assertEquals(inventory.getProducts().size(), expectedSize); //assert both inventories have an orange
    }

    @Test
    public void RemoveFromInventory_RemoveProduct_ProductRemovedFromInventory(){
        //Arrange
        Product cups = new Product(1.50, 003,5); //this product I want to remove
        ArrayList<Product> products = new ArrayList<>(); //initialize arraylist of products
        products.add(cups); //add cups to those products
        Inventory inventory = new Inventory(products); //this is actual inventory that manager deals with'
        Manager manager = new Manager(inventory); //initialize manager
        int startSize = inventory.getProducts().size();
        int expectedSize = startSize - 1;

        //Act
        manager.removeFromInventory(cups); //removes orange to inventory

        //Assert
        assertEquals(inventory.getProducts().size(), expectedSize); //assert both inventories have an orange
    }

    @Test
    public void decreaseQuantityOfProductInInventory_ProductsHasEnoughQuantity_QuantityIsDecreased(){
        //Arrange
        Product mugs = new Product(3.00, 004, 10);
        ArrayList<Product> products = new ArrayList<>(); //initialize arraylist of products
        products.add(mugs); //add mugs to those products
        Inventory inventory = new Inventory(products); //this is inventory with 10 mugs
        Manager manager = new Manager(inventory); //initialize manager
        int expectedQuantity = 7;
        //Act
        manager.decreaseQuantityOfProductInInventory(mugs, 3);
        int actualQuantity = inventory.getProducts().get(0).getQuantity();
        //Assert
        assertEquals(expectedQuantity, actualQuantity);
    }

    @Test
    public void increaseQuantityOfProductInInventory_IsProduct_QuantityIsIncrease(){
        //Arrange
        Product chairs = new Product(20.00, 005, 2);
        ArrayList<Product> products = new ArrayList<>(); //initialize arraylist of products
        products.add(chairs); //add chairs to those products
        Inventory inventory = new Inventory(products); //this is inventory with 2 chairs
        Manager manager = new Manager(inventory); //initialize manager
        int expectedQuantity = 30;
        //Act
        manager.increaseQuantityOfProductInInventory(chairs, 28);
        int actualQuantity = inventory.getProducts().get(0).getQuantity();
        //Assert
        assertEquals(expectedQuantity, actualQuantity);
    }
    
}
