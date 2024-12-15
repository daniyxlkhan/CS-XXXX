import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class AccountDriver {
    static LinkyList accounts = new LinkyList();
    static int requestsProcessed = 0;
    static int lineNumber = 0;
    public static void main (String args[]) {
        
        try {
            Scanner scan = new Scanner(new File("AccountData2.txt"));
            
            while (scan.hasNextLine()) {
                String command = scan.nextLine();
                String data = scan.nextLine();
                String[] dataArr = data.split(",");
                lineNumber += 2;

                if (command.equals("OPEN")) {
                    requestsProcessed++;
                    openAccount(dataArr);
                } else if (command.equals("CLOSE")) {
                    requestsProcessed++;
                    closeAccount(dataArr);
                } else if (command.equals("DEPOSIT")) {          
                    requestsProcessed++;
                    depostAccount(dataArr);
                } else if (command.equals("WITHDRAW")) {
                    try {
                        requestsProcessed++;
                        withdrawAccount(dataArr); 
                    } catch (InsufficientFundsException infe) {
                        System.out.println(infe.getMessage());
                    }
                } else if (command.equals("TRANSFER")) {
                    try {
                        requestsProcessed++;
                        transferAccount(dataArr);
                    } catch (InsufficientFundsException ife) {
                        System.out.println(ife.getMessage());
                    }
                } else if (command.equals("COMPLETE")) {
                    requestsProcessed++;
                    completeAccount(dataArr);
                }

                if (requestsProcessed%4 == 0) { // printing the accounts every 4 requests
                    System.out.println(accounts);
                }
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        }
    }

    public static void openAccount(String dataArr[]) {
        try {
            if (dataArr.length == 2) {
                Account acc = new Account(dataArr[0], Double.parseDouble(dataArr[1]));
                accounts.insertNode(acc);
            } else if (dataArr.length == 4) {
                Account acc = new Account(dataArr[0], Double.parseDouble(dataArr[1]));
                acc.setInterestRate(Double.parseDouble(dataArr[2]));
                acc.setTerm(Integer.parseInt(dataArr[3]));
                accounts.insertNode(acc);
            } else {
                System.out.println("Error on reading in data from request " + requestsProcessed + 
                            " (on lines: " + (lineNumber-1) + " or " + lineNumber  + ")");
            }
        } catch (PositiveInterestException pie) {
            System.out.println(pie.getMessage());
        }
    }

    public static void closeAccount(String dataArr[]) {
        if (dataArr.length == 2) {
            Account acc1 = accounts.findNode(Integer.parseInt(dataArr[0]));
            Account acc2 = accounts.findNode(Integer.parseInt(dataArr[1]));
            if (acc1 == null || acc2 == null) {
                System.out.println("Account not found");
            } else {
                acc1.closeAccTransfer(acc2);
                accounts.removeNode(Integer.parseInt(dataArr[0]));
            } 
        } else {
            System.out.println("Error on reading in data from request " + requestsProcessed + 
                            " (on lines: " + (lineNumber-1) + " or " + lineNumber  + ")");
        }
    }

    public static void depostAccount(String dataArr[]) {
        if (dataArr.length == 2) {
            Account acc = accounts.findNode(Integer.parseInt(dataArr[0]));
            if (acc == null) {
                System.out.println("Account ID does note exist for request " + requestsProcessed + 
                                " (on lines: " + (lineNumber-1) + " or " + lineNumber  + ")");
            } else {
                acc.deposit(Double.parseDouble(dataArr[1]));
            }
        } else {
            System.out.println("Error on reading in data from request " + requestsProcessed + 
                            " (on lines: " + (lineNumber-1) + " or " + lineNumber  + ")");
        }
    }

    public static void withdrawAccount(String dataArr[]) throws InsufficientFundsException {
        if (dataArr.length == 2) {
            Account acc = accounts.findNode(Integer.parseInt(dataArr[0]));
            if (acc == null) {
                System.out.println("Account ID does note exist for request " + requestsProcessed + 
                                " (on lines: " + (lineNumber-1) + " or " + lineNumber  + ")");
            } else {
                acc.withdraw(Double.parseDouble(dataArr[1]));
            } 
        } else {
            System.out.println("Error on reading in data from request " + requestsProcessed + 
                            " (on lines: " + (lineNumber-1) + " or " + lineNumber  + ")");
        }
    }

    public static void transferAccount(String dataArr[]) throws InsufficientFundsException {
        if (dataArr.length == 3) {
            Account acc1 = accounts.findNode(Integer.parseInt(dataArr[0]));
            Account acc2 = accounts.findNode(Integer.parseInt(dataArr[1]));
            if (acc1 == null || acc2 == null) {
                System.out.println("Account ID does note exist for request " + requestsProcessed + 
                                " (on lines: " + (lineNumber-1) + " or " + lineNumber  + ")");
            } else {
                acc1.transferBalance(acc2, Double.parseDouble(dataArr[2]));
            } 
        } else {
            System.out.println("Error on reading in data from request " + requestsProcessed + 
                            " (on lines: " + (lineNumber-1) + " or " + lineNumber  + ")");
        }
    }

    public static void completeAccount(String dataArr[]) {
        if (dataArr.length == 1) {
            ArrayList<Account> accountsArr = accounts.getAllAccounts();
            for (Account acc : accountsArr) {
                acc.applyInterest();
                acc.reduceTerm();
            }
        } else {
            System.out.println("Error on reading in data from request " + requestsProcessed + 
                            " (on lines: " + (lineNumber-1) + " or " + lineNumber  + ")");
        }
    }
}
