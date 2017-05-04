package wong.andrew.polymorphism;

/**
 * Created by andrewwong on 5/3/17.
 */
public class Display {
    UserInput userInput = new UserInput();
    public int askUserHowManyPets(){
        int numberOfPets = userInput.requestNumber("How many pets do you have?");
        return numberOfPets;
    }
    public void printName(){

    }
}
