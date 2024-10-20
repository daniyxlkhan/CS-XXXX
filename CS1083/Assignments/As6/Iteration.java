import java.util.Scanner;

public class Iteration {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int userInput = Integer.parseInt(scan.nextLine());

        long startTime = System.nanoTime();
        int cs1 = 1;
        int cs2 = 2;
        int cs3 = 3;
        int csn = 0;
        int temp = 0;
        for (int i = 1; i <= userInput; i++) {
            csn = cs1 + cs2 - cs3 + 1;

            cs1 = csn;
            temp = cs2;
            cs2 = cs3;
            cs3 = temp;

            /* 
            c4 = 1;
            c5 = 3;
            c6 = 2;
            */
            
        }

        System.out.println(csn);
        double elapsedSeconds = (double) (System.nanoTime() - startTime) / 1000000000; // converting from nanoseconds to seconds
        System.out.println("Runtime:" + elapsedSeconds);
    }
}

/*
     CSn = CSn-1 + CSn-2 - CSn-3 + 1
    Where CS1 = 1, CS2 = 2, and CS3 = 3
 */