public interface Bank {
    public void applyInterest() throws NegativeException;
    public void withdrawMoney(double amount) throws InsufficientFundsException, NegativeException;
    public void depositMoney(double amount) throws NegativeException;
}
