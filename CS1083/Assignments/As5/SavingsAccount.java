public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(double startingBalance, double interestRate) throws NegativeException {
        super(startingBalance);
        if (interestRate < 0) {
            throw new NegativeException("Interest rates may not be negative.");
        }
        this.interestRate = interestRate;
    }

    public void applyInterest() throws NegativeException {
        setBalance(super.getBalance()*(interestRate+1));
    }
}