package wong.andrew.wong.andrew.abstractclass;

import java.util.Scanner;

/**
 * Created by andrewwong on 5/2/17.
 */
public class Display {

    private final Scanner scanner = new Scanner(System.in);

    public String userStringInput(String request) {
        System.out.println(request);
        String userInput = scanner.next();
        return userInput;
    }

    public double userDoubleInput(String request){
        System.out.println(request);
        Double userInput = scanner.nextDouble();
        return userInput;
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
