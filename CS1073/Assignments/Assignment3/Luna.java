/**
@author Daniyal Khan 3765942
*/

import java.util.Scanner;

public class Luna {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userInput;
		// Initial Question 1
		System.out.println("Is there an animal in the yard?");
		userInput = scan.nextLine();

		if(userInput.equalsIgnoreCase("Yes")) {
			System.out.println("Is it moving?"); // Question 2
			userInput = scan.nextLine();
			if(userInput.equalsIgnoreCase("Yes")) {
				System.out.println("Is it smaller than me?"); // Question 3
				userInput = scan.nextLine();
				if(userInput.equalsIgnoreCase("Yes")) {
					System.out.println("Is she Prof.Bidlake in an online meeting?"); // Question 4
					userInput = scan.nextLine();
					if(userInput.equalsIgnoreCase("Yes")) {
						System.out.println("Bark");
					}
					else if (userInput.equalsIgnoreCase("No")) {
						System.out.println("Don't bark");
					}
				}
				else if (userInput.equalsIgnoreCase("No")) {
					System.out.println("Bark");
				}
			}
			else if (userInput.equalsIgnoreCase("No")) {
				System.out.println("Don't bark");
			}
		}
		else if (userInput.equalsIgnoreCase("No")) {
			System.out.println("Don't bark");
		}
		else {
    		System.out.println("Invalid input. Please enter 'Yes' or 'No'.");
		}
	}
}
