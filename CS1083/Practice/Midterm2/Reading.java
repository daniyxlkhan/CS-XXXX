import java.io.*;

public class Reading implements Serializable {
    private double amount;

    public Reading(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public static double totalItemSum(String fileName) {
        FileInputStream f1 = null;
        ObjectInputStream inStream = null;
        double sum = 0;

        try {
            f1= new FileInputStream(fileName);
            inStream = new ObjectInputStream(f1);
           
        while (true) {
            try {
                Reading item = (Reading) inStream.readObject();
                sum += item.getAmount();
            } catch (EOFException eofe) {
                System.out.println("All data has been read in successfully");
                break;
            }
        }
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Item class could not be found");
            return -1;
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return -1;
        } finally {
            try {
                if (f1 != null ) {
                    f1.close();
                }
                if (inStream != null) {
                    inStream.close();
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        return sum;
    }
    
}
