package wong.andrew.wong.andrew.abstractclass;

import java.util.Scanner;

/**
 * Created by andrewwong on 5/2/17.
 */
public class Display {

    Scanner scanner = new Scanner(System.in);

    public void printBalance(double balance){
        System.out.println(balance);
    }

    public void showAccountMenuOptions(){
        System.out.println("Please selects one of the following: checking, savings, or business");
    }

    public void showActionsMenuOptions(){
        System.out.println("Please select an action: withdrawal or deposit");
    }

    //user input


//    public void printWelcomeMessage(){
//        System.out.println("Welcome to ZipCode National Bank");
//        System.out.println("Do you have an account here?");
//    }

}
