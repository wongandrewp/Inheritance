package wong.andrew.polymorphism;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by andrewwong on 5/4/17.
 */
public class TestDisplay {

    @Test
    public void askHowManyPets(){
        //Arrange
        int numberOfPets = 3;
        int expectedNumberOfPets = 3;
        Display display = new Display();

        //Act
        int actualNumberOfPets = display.askUserHowManyPets();

        //Assert
        assertEquals(expectedNumberOfPets, actualNumberOfPets);
    }
}
