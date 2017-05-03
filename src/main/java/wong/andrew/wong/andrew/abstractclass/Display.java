package wong.andrew.wong.andrew.abstractclass;

import java.util.Scanner;

/**
 * Created by andrewwong on 5/2/17.
 */
public class Display {

    private final Scanner scanner = new Scanner(System.in);

    public String userStringInput(String request) {
        System.out.println(request);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public double userDoubleInput(String request){
        System.out.println(request);
        return scanner.nextDouble();
    }
    public void printBalance(Account account){
        System.out.printf("Balance: $%.2f\n",account.getBalance());
    }
    public void printBalanceAfterTransaction(Account account){
        System.out.printf("New Balance: $%.2f\n",account.getBalance());
    }

    public void printWelcomeMessage(){
        System.out.println("Welcome to ZipCode National Bank");
    }

}
