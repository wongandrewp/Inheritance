package wong.andrew.wong.andrew.abstractclass;

/**
 * Created by andrewwong on 5/1/17.
 */
public class Logic {
    Account checkingAccount;
    Account savingsAccount;
    Account businessAccount;

    public Logic(Account checkingAccount, Account savingsAccount, Account businessAccount){
        this.checkingAccount = checkingAccount;
        this.savingsAccount = savingsAccount;
        this.businessAccount = businessAccount;
    }
    public void run(){
        Display display = new Display();

        Account currentAccount;
        display.printWelcomeMessage();
        //ask for pin for security feature
        String accountSelection = display.userStringInput("Please selects one of the following: checking, savings, or business");
        switch(accountSelection.toLowerCase()){
            case "checking":
                currentAccount = checkingAccount;
                display.printBalance(currentAccount);
            case "savings":
                currentAccount = savingsAccount;
                display.printBalance(currentAccount);
            case "business":
                currentAccount = businessAccount;
                display.printBalance(currentAccount);
        }
        String transactionSelection = display.userStringInput("Please select one of the following: withdrawal or deposit");
        double transactionAmount = display.userDoubleInput("Please enter an amount");
        switch(transactionSelection.toLowerCase()){
            case "deposit":
                currentAccount.deposit(transactionAmount);
            case "withdrawal":
                currentAccount.withdraw(transactionAmount);
        }

    }
}
