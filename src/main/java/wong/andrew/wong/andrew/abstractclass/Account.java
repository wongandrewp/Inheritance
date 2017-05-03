package wong.andrew.wong.andrew.abstractclass;

/**
 * Created by andrewwong on 5/1/17.
 */
public abstract class Account {
    private double balance;

//    Used for security feature
//    private int pin;

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        if (this.balance >= amount)
            this.balance -= amount;
        else
            System.out.println("Insufficient Funds");

    }

//    Used for security feature
//    public void setPin(int pin){
//        this.pin = pin;
//    }

}
