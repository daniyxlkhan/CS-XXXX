import java.util.Scanner;
/**
 * This class represents a decryption algorithm
@author Daniyal Khan 3765942
*/
public class Decrypt {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String msg; // user input 
        int columns;  // 
        int iterateStr = 0;
        boolean alternate = true; 

        columns = read.nextInt();
        read.nextLine(); // consumes newline character
        msg = read.next();
        
        int rows = msg.length() / columns;
        String[][] patternArray = new String[rows][columns]; // 2D array for entering numbers for making up the encryption pattern

        while(columns != 0) {
            for (int j = 0; j < patternArray[0].length; j++) {
                if (alternate){  // reading the encrypted msg and then storing the char into the 2D array alternating from bottom to top and top to bottom 
                    for (int i = patternArray.length - 1; i >= 0; i--) { 
                    patternArray[i][j] = "" + msg.charAt(iterateStr++);
                    }
                    alternate = !alternate;
                } else {
                    for (int i = 0; i < patternArray.length; i++) {
                        patternArray[i][j] = "" + msg.charAt(iterateStr++);
                    }
                    alternate = !alternate;
                }      
            }
            iterateStr = 0;
            System.out.println(decrypt(patternArray));
            
            // NEXT INPUT 
            columns = read.nextInt(); 
            // read.nextLine(); // consumes newline character
            if (columns != 0) {
                msg = read.next();
                rows = msg.length() / columns;
                patternArray = new String[rows][columns]; // new 2D array for the next encrypted msg
                alternate = true;
            }
        }
    }
    
    public static String decrypt(String[][] array) { 
        boolean alternate = true;
        String decryptedMsg = "";
        for (int i = 0; i < array.length; i++) { // alternating from left to right and right to left in the 2D array and then storing into String
            if(alternate) {
                for (int j = 0; j < array[0].length; j++) {
                    decryptedMsg += array[i][j];
                }
                alternate = !alternate;
            } else {
                for (int j = array[0].length - 1; j >= 0 ; j--) {
                    decryptedMsg += array[i][j];
                }
                alternate = !alternate;
            }  
        }
        return decryptedMsg;
    }

    public static void printPartialArray(int companionVar, String[] array) { 
        for(int i = 0; i < companionVar; i++) {
            System.out.println(array[i]);
        }
    }

    public static void print2DArray(String[][] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}