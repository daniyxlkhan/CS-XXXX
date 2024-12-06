import java.text.NumberFormat;

public class Account implements Comparable<Account>{
    private String name;
    private double balance;
    private double interestRate;
    private int term;
    private final int ACC_NUM;
    private static int id = 8000;
   
    public Account (String name, double initialBalance) {
        this.name = name;
        this.balance = initialBalance;
        this.ACC_NUM = id;
        id++;
    }

    public void setInterestRate (double interestRate) throws PositiveInterestException {
        if (interestRate < 0) {
            throw new PositiveInterestException("Postive Interest Exception: Interest rate must be positive");
        }
        this.interestRate = interestRate;
    }

    public void applyInterest () {
        if (this.term > 0) {
            double interest = (this.interestRate/100) * this.balance;
            this.balance += interest;
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        double diff = this.balance - amount;
        double penalty = 0.05 * this.balance;

        if (this.term > 0) { // penalty is only for accounts that are in a middle of a term
            diff = this.balance - penalty - amount;
            if (diff < 0) {
                throw new InsufficientFundsException("InsufficientFundsException: Not enough funds to complete transaction");
            }   
            this.balance = diff;
        } else { 
            if (diff < 0) {
                throw new InsufficientFundsException("InsufficientFundsException: Not enough funds to complete transaction");
            }   
            this.balance = diff;
        }
    }
    
    public void setTerm (int year) {
        this.term = year;
    }

    public void reduceTerm() {
        if (this.term - 1 >= 0) {
            this.term--;
        }
    }
    public double getBalance () {
        return balance;
    }

    public void transferBalance(Account other, double amount) throws InsufficientFundsException {
        double penalty = 0.025 * amount;
        // System.out.println(penalty);
        if (this.balance < amount) {
            throw new InsufficientFundsException("InsufficientFundsException: Not enough funds to complete transaction");
        }
        other.balance += amount;
        this.balance = this.balance - amount- penalty;
    }

    public void closeAccTransfer (Account other) {
        other.balance += this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public int getAccountNum() {
        return ACC_NUM;
    }

    public String toString() {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        String toReturn = "";
        if (this.name.equals("CHEQUE")) {
            toReturn = "ID: " + ACC_NUM + "\t" + 
            name + "   " + format.format(balance) + "\t";
        } else {
            toReturn = "ID: " + ACC_NUM + "\t" + 
            name + "   " + format.format(balance) + "\t" +
            "Interest Rate: " + interestRate + "%" + "\t" + 
            "(Term: " + term + " Years)";
        }
        return toReturn;
    }

    public int compareTo (Account other) {
        if (this.ACC_NUM == other.ACC_NUM) {
            return 0;
        } else if (this.ACC_NUM > other.ACC_NUM) {
            return 1;
        } else {
            return -1;
        }
    }

    public int compareTo (int acc_num) {
        if (this.ACC_NUM == acc_num) {
            return 0;
        } else if (this.ACC_NUM > acc_num) {
            return 1;
        } else {
            return -1;
        }
    }
}