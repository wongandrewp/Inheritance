package wong.andrew.wong.andrew.abstractclass;

/**
 * Created by andrewwong on 5/3/17.
 */
public class AccountManager {
    private Account currentAccount;
    private Account checkingAccount;
    private Account savingsAccount;
    private Account businessAccount;

    public AccountManager(Account checkingAccount, Account savingsAccount, Account businessAccount) {
        this.checkingAccount = checkingAccount;
        this.savingsAccount = savingsAccount;
        this.businessAccount = businessAccount;
    }

    public Account selectAccount(String accountSelection) {
        switch (accountSelection.toLowerCase()) {
            case "checking":
                currentAccount = checkingAccount;
                return currentAccount;
            case "savings":
                currentAccount = savingsAccount;
                return currentAccount;
            case "business":
                currentAccount = businessAccount;
                return currentAccount;
            default:
                currentAccount = savingsAccount;
                return savingsAccount;
        }
    }

    public boolean doTransaction(Account currentAccount,String transactionSelection, double transactionAmount) {
        boolean transactionIsSuccessful;
        switch (transactionSelection.toLowerCase()) {
            case "deposit":
                currentAccount.deposit(transactionAmount);
                transactionIsSuccessful = true;
            case "withdrawal":
                currentAccount.withdraw(transactionAmount);
                transactionIsSuccessful = true;
            default:
                System.out.println("Invalid transaction");
                transactionIsSuccessful = false;
        }
        return transactionIsSuccessful;
    }

}
