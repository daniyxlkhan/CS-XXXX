import java.text.NumberFormat;

public abstract class Account implements Bank {
    private double balance;
    private NumberFormat formatter;

    public Account (double startingBalance) {
        this.balance = startingBalance;
        formatter = NumberFormat.getCurrencyInstance();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balanceAmount) {
        this.balance = balanceAmount;
    }

    

    public void withdrawMoney(double amount) throws InsufficientFundsException, NegativeException {
        if (amount < 0) {
            throw new NegativeException("Withdraw amounts must be positive.");
        }
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new InsufficientFundsException("You are trying to withdraw " + formatter.format(amount-balance) + " more than you have in your account");
        }
    }

    public void depositMoney(double amount) throws NegativeException {
        if (amount < 0) {
            throw new NegativeException("Deposit amounts must be positive."); 
        }
        balance += amount;
    }
}