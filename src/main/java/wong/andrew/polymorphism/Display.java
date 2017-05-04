package wong.andrew.polymorphism;

/**
 * Created by andrewwong on 5/3/17.
 */
public class Display {
    UserInput userInput = new UserInput();

    public int askUserHowManyPets() {
        int numberOfPets = userInput.requestNumber("How many pets do you have?");
        return numberOfPets;
    }

    public String askUserNameOfPet(){
        String nameOfPet = userInput.requestString("What is the name of one of your pets?");
        return nameOfPet;
    }

    public void askUserKindOfPet(){
        String kindOfPet = userInput.requestString("What kind of pet is that?");
        Pet pet;
        switch(kindOfPet){
            case "cat":
                pet = new Cat();
                break;
            case "dog":
                pet = new Dog();
                break;
            case "bird":
                pet = new Bird();
                break;
            default:
                System.out.println("Not a kind of pet. Cat by default");
                pet = new Cat();
        }
    }

    public String printName(Pet pet) {
        String name = pet.getName();
        System.out.println(name);
        return name;
    }
}
