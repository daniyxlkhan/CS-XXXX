import java.util.Scanner;

public class Iteration {
    public static void main (String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int userInput = Integer.parseInt(scan.nextLine());

        long startTime = System.nanoTime();
        // System.out.println(loop(userInput));
        System.out.println(Recursion(userInput)); 
    
        double elapsedSeconds = (double) (System.nanoTime() - startTime) / 1000_000_000; // converting from nanoseconds to seconds
        System.out.println("Runtime:" + elapsedSeconds);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }   
    }

    public static int loop(int userInput) {
        if (userInput <= 3) {
            return userInput;
        }
        int cs1 = 1;
        int cs2 = 2;
        int cs3 = 3;
        int csn = 0;

        for (int i = 4; i <= userInput; i++) {
            csn = cs3 + cs2 - cs1 + 1;
            cs1 = cs2;
            cs2 = cs3;
            cs3 = csn;
        }
        return csn;
    }

    /* Different approach
    public static int loop2(int n) {
        int CS[] = new int[n+1];
        CS[3] = 3;
        CS[2] = 2;
        CS[1] = 1;

        for (int i = 4; i <= n; i++) {
            CS[i] = CS[i-1] + CS[i-2] - CS[i-3] + 1;
        }
        return CS[n];
    }
    */

    public static int Recursion(int n) {
        if (n <= 3) {
            return n;
        }
        return Recursion(n-1) + Recursion(n-2) - Recursion(n-3) + 1;      
    }   
}


