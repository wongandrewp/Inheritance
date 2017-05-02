package wong.andrew.classmanager;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by andrewwong on 5/1/17.
 */
public class InventoryTests {

    @Test
    public void sumUpInventoryValue_SimpleProducts_ReturnsSum(){
        //Arrange
        Product[] products = new Product[2];
        products[0] = new Product(2.00, 1, 5);
        products[1] = new Product(1.00, 2,3);
        double expectedSum = 13.00;

        //Act
        double actualSum = Inventory.sumUpInventoryValue(products);

        //Assert
        assertEquals(expectedSum, actualSum, .001D);
    }

    @Test
    public void sumUpInventoryValue_FruitProducts_ReturnsSum(){
        //Arrange
        Product[] products = new Product[2];
        products[0] = new Apple(5);
        products[1] = new Banana(3);
        double expectedSum = 13.00;

        //Act
        double actualSum = Inventory.sumUpInventoryValue(products);

        //Assert
        assertEquals(expectedSum, actualSum, .001D);
    }
}
