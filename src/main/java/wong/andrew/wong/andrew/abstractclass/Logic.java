package wong.andrew.wong.andrew.abstractclass;

import java.util.Scanner;

/**
 * Created by andrewwong on 5/1/17.
 */
public class Logic {
    Account checkingAccount;
    Account savingsAccount;
    Account businessAccount;
    AccountManager accountManager;
    Display display;

    public Logic(Account checkingAccount, Account savingsAccount, Account businessAccount, Display display, AccountManager accountManager) {
        this.checkingAccount = checkingAccount;
        this.savingsAccount = savingsAccount;
        this.businessAccount = businessAccount;
        this.display = display;
        this.accountManager = accountManager;
    }

    public void run() {
        Account currentAccount;
        display.printWelcomeMessage();
        //ask for pin for security feature
        boolean atmIsOn = true;
        while (atmIsOn) {
            String accountSelection = display.userStringInput("Please selects one of the following: checking, savings, business, off");
            if (accountSelection.equalsIgnoreCase("off")) {
                break;
            }
            currentAccount = accountManager.selectAccount(accountSelection);
            display.printBalance(currentAccount);

            String transactionSelection = display.userStringInput("Please select one of the following: withdrawal or deposit");
            double transactionAmount = display.userDoubleInput("Please enter an amount");

            accountManager.doTransaction(currentAccount, transactionSelection, transactionAmount);

            display.printBalanceAfterTransaction(currentAccount);
        }
    }
}
