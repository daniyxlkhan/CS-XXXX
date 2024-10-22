import java.io.*;

public class file3 {
    public static void main(String[] args) {
        try {
            FileInputStream f3 = new FileInputStream("File3.bin");
            ObjectInputStream inStream = new ObjectInputStream(f3);

            double latitude = inStream.readDouble();
            double longitude = inStream.readDouble();
            
            System.out.println("Longitude: " + latitude);
            System.out.println("Latitude: " + longitude);

            inStream.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
