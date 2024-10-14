public class ChequingAccount extends Account{
    private final double INTEREST_RATE = 0.005;

    public ChequingAccount(double startingBalance) {
        super(startingBalance);
    }

    public void applyInterest() throws NegativeException {
        super.depositMoney(super.getBalance()*(INTEREST_RATE/100));
    }
}