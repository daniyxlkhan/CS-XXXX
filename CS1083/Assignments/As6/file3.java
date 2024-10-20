import java.io.*;

public class file3 {
    public static void main(String[] args) {
        try {
            FileInputStream f3 = new FileInputStream("File3.bin");
            ObjectInputStream inStream = new ObjectInputStream(f3);

            double latitude = inStream.readDouble();
            double longitude = inStream.readDouble();
            
            System.out.println("Latitude: " + latitude);
            System.out.println("Longitude: " + longitude);

            inStream.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}

// Latitude: 45.950102
// Longitude: -66.642087