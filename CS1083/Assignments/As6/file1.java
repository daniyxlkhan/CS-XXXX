import java.io.*;

public class file1 {
    public static void main (String[] args) {
        try {
            FileInputStream f1 = new FileInputStream("File1.bin"); // reads raw byte data from file (serialized)
            ObjectInputStream inStream = new ObjectInputStream(f1);  // deserializes object or primitive data

            while (true) { 
                try {
                    char c = inStream.readChar(); // reads enough data to make a char
                    System.out.print(c);
                }
                catch (EOFException eofe) {
                    break;
                }
            }
            inStream.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } 
    }
}