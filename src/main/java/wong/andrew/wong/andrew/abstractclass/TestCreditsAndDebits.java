package wong.andrew.wong.andrew.abstractclass;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by andrewwong on 5/1/17.
 */
public class TestCreditsAndDebits {

    @Test
    public void deposit_SimpleDeposit_isDeposited(){
        //Arrange
        double balance = 0;
        double depositAmount = 200;
        double expectedBalance = 200;
        Account checkingAccount = new CheckingAccount();

        //Act
        checkingAccount.deposit(depositAmount);
        double actualBalance = checkingAccount.getBalance();

        //Assert
        assertEquals(expectedBalance, actualBalance, .01D);
    }

    @Test
    public void withdrawal_SimpleWithdrawal_isWithDrew(){
        //Arrange
        double balance = 1000;
        double withdrawalAmount = 350;
        double expectedBalance = 650;

        Account checkingAccount = new CheckingAccount();

        //Act
        checkingAccount.setBalance(balance);
        checkingAccount.withdraw(withdrawalAmount);
        double actualBalance = checkingAccount.getBalance();

        //Assert
        assertEquals(expectedBalance, actualBalance, .01D);
    }

    @Test
    public void withdrawal_Overdrawn_ReturnsInSufficientFunds(){
        //Arrange
        double balance = 200;
        double withdrawalAmount = 300;
        double expectedBalance = 200;

        Account checkingAccount = new CheckingAccount();

        //Act
        checkingAccount.setBalance(balance);
        checkingAccount.withdraw(withdrawalAmount);
        double actualBalance = checkingAccount.getBalance();

        //Assert
        assertEquals(expectedBalance, actualBalance, .01D);
    }

}
