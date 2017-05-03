package wong.andrew.wong.andrew.abstractclass;

/**
 * Created by andrewwong on 5/3/17.
 */
public class AccountManager {
    private Account currentAccount;
    private CheckingAccount checkingAccount;
    private Account savingsAccount;
    private Account businessAccount;



    public Account selectAccount(String accountSelection){
//        switch (accountSelection.toLowerCase()) {
//            case "checking":
//                currentAccount = checkingAccount;
//                return currentAccount;
//            case "savings":
//                currentAccount = savingsAccount;
//                return currentAccount;
//            case "business":
//                currentAccount = businessAccount;
//                return currentAccount;
//            default:
//                currentAccount = savingsAccount;
//                return savingsAccount;
//        }
        return savingsAccount;
    }

    public void doTransaction(String transactionSelection, double transactionAmount){
        switch (transactionSelection.toLowerCase()) {
            case "deposit":
                currentAccount.deposit(transactionAmount);
                break;
            case "withdrawal":
                currentAccount.withdraw(transactionAmount);
                break;
            default:
                System.out.println("Invalid transaction");
        }
    }

}
