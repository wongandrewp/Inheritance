package wong.andrew.abstractclass;

import org.junit.Test;
import wong.andrew.wong.andrew.abstractclass.*;
import static org.junit.Assert.*;

/**
 * Created by andrewwong on 5/3/17.
 */
public class TestAccountManager {
    @Test
    public void selectAccount_ValidAccount_ReturnsAccountSelected(){
        //Arrange
        Account checkingAccount = new CheckingAccount();
        Account savingsAccount = new SavingsAccount();
        Account businessAccount = new BusinessAccount();
        AccountManager accountManager = new AccountManager(checkingAccount, savingsAccount, businessAccount);
        String accountSelection = "checking";
        Account expectedCurrentAccount = checkingAccount;

        //Act
        Account actualCurrentAccount = accountManager.selectAccount(accountSelection);


        //Assert
        assertEquals(expectedCurrentAccount, actualCurrentAccount);
    }

    @Test
    public void doTransaction_ValidTransactionSelected_TransactionIsSuccessful(){
        //Arrange
        Account checkingAccount = new CheckingAccount();
        Account savingsAccount = new SavingsAccount();
        Account businessAccount = new BusinessAccount();
        AccountManager accountManager = new AccountManager(checkingAccount, savingsAccount, businessAccount);
        Account currentAccount = checkingAccount;
        String transactionSelected = "deposit";
        double transactionAmount = 100.0;
        boolean expectedTransactionIsSuccessful = true;

        //Act
        boolean actualTransactionIsSuccessful = accountManager.doTransaction(currentAccount, transactionSelected, transactionAmount);

        //Assert
        assertEquals(expectedTransactionIsSuccessful, actualTransactionIsSuccessful);
    }
}
