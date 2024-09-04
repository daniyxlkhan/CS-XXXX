import java.util.Scanner;
/**
This class converts integers to ancient letters
@author Daniyal Khan 3765942
*/

public class ArabicToAncient {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a positive integer: ");
    int input = scan.nextInt();
    scan.nextLine();

    System.out.println("The ancient number for " + input + " is: ");
    while (input != 0) {
      int remainderValue = input % 16;
      if (remainderValue == 0) {
        System.out.print("X");
      }
      if (remainderValue >= 4) {
        while(remainderValue >=4) {
          System.out.print("M");
          remainderValue -= 4;
        }
      }
      if (remainderValue < 4) {
        while (remainderValue > 0) {
          System.out.print("|");
          remainderValue--;
      }
      System.out.println();
      }
      input /= 16;
    }
  }
}
