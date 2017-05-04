package wong.andrew.polymorphism;

import java.util.Scanner;

/**
 * Created by andrewwong on 5/4/17.
 */
public class UserInput {
    Scanner scanner = new Scanner(System.in);
    public int requestNumber(String request){
        System.out.println(request);
        int number = scanner.nextInt();
        return number;
    }
}
