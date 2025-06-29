import java.io.*;
import java.util.Scanner;

public class CaeserCipher {
    public static void main(String[] args) {
        try {
            File fileIn = new File("Msg.txt");
            Scanner scan = new Scanner(fileIn);
            scan.useDelimiter(",");
            PrintWriter pw = new PrintWriter("Encrypted.txt");

            while (scan.hasNextLine()) {
                int key = Integer.parseInt(scan.next().trim());    
                String msg = scan.nextLine().trim();               
                if (msg.startsWith(",")) {                       
                    msg = msg.substring(1).trim();
                }
                pw.println(encrypt(msg, key));                     
            }
            scan.close();
            pw.close();
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
        }  catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        } 
    }

    public static String encrypt(String msg, int key) {
        if(msg.length() == 0) {
            return "";
        }
        char currentChar = msg.charAt(0);
        if((key >= 0 && key <= 25) && (currentChar >= 'A' && currentChar <= 'Z')) {
            if ((currentChar+key) > 'Z'){ // wrap around if it's greater than Z
                currentChar = (char)((msg.charAt(0) + key) - 26); 
            } else {
                currentChar = (char)(msg.charAt(0) + key);
            }
        }
        return currentChar + encrypt(msg.substring(1), key);
    }   

    /* Iterative
    public static String lencrpt(String msg, int key) {
        String array[] = new String[msg.length()];

        for (int i =0; i < msg.length(); i++) {
            char currentChar = msg.charAt(i);
            if ((key >= 0 && key <= 25) && (currentChar >= 'A' && currentChar <= 'Z')) {
                if ((currentChar + key) > 'Z') {
                    array[i] = "" + (char)((currentChar + key) - 26);
                } else {
                    array[i] = "" + (char)(currentChar + key);
                }   
            } else {
                array[i] = currentChar + "";
            }
        }

        return String.join("", array);
    }
    */
}