import java.io.*;

public class Test {
    public static void main (String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream ("test.dat");
        ObjectInputStream inFile2 = new ObjectInputStream (fis);
        Contact[] friends = new Contact[10];
        //read at most 10 values, or catchEOFException if EOF
        int i = 0;
        while(true) {
            try {
                friends[i] = (Contact) inFile2.readObject();
                i++;
            } catch (EOFException eof) {
                System.out.println(eof.getMessage());
                break;
            }
        }
        System.out.println(findContact(friends, new Contact(args[1], args[1], "")));
    }

    public static boolean findContact (Contact[] array, Contact c) {
        for (Contact arr : array) {
            if (arr != null && arr.compareTo(c) == 0) {
                return true;
            }
        }
        return false;
    }
}

