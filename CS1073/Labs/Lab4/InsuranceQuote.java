/**
This class is used to calculate the insurance quote of a vechicle
@author Daniyal Khan 3765942
*/

import java.util.Scanner;

public class InsuranceQuote {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int baseRate = 900;
		double insuranceQuote = baseRate;

		System.out.print("Enter the model year of the vehicle: ");
		int modelYear = scan.nextInt();
		if (modelYear < 2016) {
			insuranceQuote += 50; // surcharge of 50 dollars if model is older than 2016
		}

		System.out.print("Enter your age: ");
		int driverAge = scan.nextInt();
		scan.nextLine(); // Consume the newline character

		if (driverAge < 25) {
			String eduDriveCourse = "";
			System.out.print("Did you complete a driver education course (enter yes or no): ");
			while (true) {
				eduDriveCourse = scan.nextLine();
				if (eduDriveCourse.equals("yes")) {
					insuranceQuote += 75; // additional charge of 75 if driver course complete
					break;
				}
				else if (eduDriveCourse.equals("no")) {
					insuranceQuote += 175; // additional charge of 175 otherwise
					break;
				}
				System.out.print("Enter yes or no: ");
			}
		}

		System.out.print("Do you drive the vehicle to work (enter yes or no): ");
		while (true) {
			String driveToWork = scan.nextLine();
			if (driveToWork.equals("yes")) {
				System.out.print("What is the distance of your commute in km: ");
				double distanceToCommute = scan.nextDouble();
				scan.nextLine();

				if (distanceToCommute < 20) {
					insuranceQuote += 100; // distance to commute less than 20 than 100 fees
					break;
				}
				else {
					insuranceQuote += 150; // additional fee of 150 otherwise
					break;
				}
			}
			else if (driveToWork.equals("no")) {
				break;
			}
			System.out.print("Enter yes or no: ");
		}

		System.out.println("");
		System.out.println("Insurance Rate: $" + insuranceQuote);
	}
}
