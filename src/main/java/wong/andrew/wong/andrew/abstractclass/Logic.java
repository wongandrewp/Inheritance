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

    public Logic(Account checkingAccount, Account savingsAccount, Account businessAccount, Display display) {
        this.checkingAccount = checkingAccount;
        this.savingsAccount = savingsAccount;
        this.businessAccount = businessAccount;
        this.display = display;
    }

    public void run() {
        Account currentAccount;
        display.printWelcomeMessage();
        //ask for pin for security feature
        boolean atmIsOn = true;
        while(atmIsOn){
            String accountSelection = display.userStringInput("Please selects one of the following: checking, savings, business, off");
            currentAccount = accountManager.selectAccount(accountSelection);
            display.printBalance(currentAccount);
//            switch (accountSelection.toLowerCase()) {
//                case "checking":
//                    currentAccount = checkingAccount;
//                    display.printBalance(currentAccount);
//                    break;
//                case "savings":
//                    currentAccount = savingsAccount;
//                    display.printBalance(currentAccount);
//                    break;
//                case "business":
//                    currentAccount = businessAccount;
//                    display.printBalance(currentAccount);
//                    break;
//                default:
//                    currentAccount = savingsAccount;
//
//            }
            String transactionSelection = display.userStringInput("Please select one of the following: withdrawal or deposit");
            double transactionAmount = display.userDoubleInput("Please enter an amount");

            accountManager.doTransaction(transactionSelection, transactionAmount);

//            switch (transactionSelection.toLowerCase()) {
//                case "deposit":
//                    currentAccount.deposit(transactionAmount);
//                    break;
//                case "withdrawal":
//                    currentAccount.withdraw(transactionAmount);
//                    break;
//                default:
//                    System.out.println("Invalid transaction");
//            }
            display.printBalanceAfterTransaction(currentAccount);

        }
    }
}
