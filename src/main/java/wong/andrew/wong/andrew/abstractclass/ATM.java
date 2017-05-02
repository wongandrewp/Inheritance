package wong.andrew.wong.andrew.abstractclass;

import java.util.Scanner;
/**
 * Created by andrewwong on 5/1/17.
 */
public class ATM {
    private String display;
    private String off;
    private Scanner scanner;

    public void updateDisplayTo(String display){
        this.display = display;
    }

    public String userStringInput(String request){
        System.out.println(request);
        return scanner.nextLine();
    }
}
