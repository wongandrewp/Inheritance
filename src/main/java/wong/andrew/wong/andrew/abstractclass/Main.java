package wong.andrew.wong.andrew.abstractclass;

/**
 * Created by andrewwong on 5/1/17.
 */
public class Main {
    public static void main(String[] args) {
        Account checkingAccount = new CheckingAccount();
        Account savingsAccount = new SavingsAccount();
        Account businessAccount = new BusinessAccount();

        Logic logic = new Logic(checkingAccount, savingsAccount, businessAccount);
        logic.run();
    }
}
