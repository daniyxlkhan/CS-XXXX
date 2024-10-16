import java.util.Scanner;
import java.util.Arrays;

public class Driver {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a letter(char): ");
        char letter = scan.next().charAt(0);
        int result[] = alphaPlaceCount(letter , args);
        
        System.out.println(Arrays.toString(result));
    }

    public static int[] alphaPlaceCount(char letter, String[] words) {
        int result[] = new int[3];
    
        letter = Character.toLowerCase(letter);
    
        char beforeLetter = (char) (letter - 1);
        char afterLetter =  (char) (letter + 1);
    
        for (String word : words) {
            if (checkNonAlpha(word)) {
                char firstChar = Character.toLowerCase(word.charAt(0)); 
                if (firstChar == beforeLetter) {
                    result[0]++;
                } else if (firstChar == letter) {
                    result[1]++;
                } else if (firstChar == afterLetter) {
                    result[2]++;
                }
            }
        }
        return result;
    }
    
    public static boolean checkNonAlpha(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!(Character.isLetter(word.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
   

