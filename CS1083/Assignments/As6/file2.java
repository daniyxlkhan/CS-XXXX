import java.io.*;

public class file2 {
    public static void main (String[] args) {
        try {
            FileInputStream f2 = new FileInputStream("File2.bin");
            ObjectInputStream inStream = new ObjectInputStream(f2);

            while (true) {
                try {
                    char c = inStream.readChar();
                    if (c == 'G') {
                        c = '7';
                    }
                    System.out.print(c);
                } catch (EOFException eofe) {
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
