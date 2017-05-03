package wong.andrew.wong.andrew.abstractclass;

import java.util.Scanner;

/**
 * Created by andrewwong on 5/2/17.
 */
public class Display {

    Scanner scanner = new Scanner(System.in);

    public String userStringInput(String request) {
        System.out.println(request);
        return scanner.nextLine();
    }

    public double userDoubleInput(String request){
        System.out.println(request);
        return scanner.nextDouble();
    }
    public void printBalance(Account account){
        System.out.println(account.getBalance());
    }

    public void printWelcomeMessage(){
        System.out.println("Welcome to ZipCode National Bank");
    }

}
