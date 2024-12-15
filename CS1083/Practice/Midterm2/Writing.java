import java.io.*;

public class Writing implements Serializable {
    private double amount;

    public Writing(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public static void writing(String fileName) {
        Writing w1 = new Writing(0);
        FileOutputStream f1 = null;
        ObjectOutputStream outStream = null;

        try {
            f1 = new FileOutputStream("data.bin");
            outStream = new ObjectOutputStream(f1);

            outStream.writeObject(w1);
            outStream.writeInt(0);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (f1 != null) {
                    f1.close();
                }
                if (outStream != null) {
                    outStream.close();
                }
            } catch (IOException ioe) {
                ioe.getMessage();
            }
        }
    }
    
}
