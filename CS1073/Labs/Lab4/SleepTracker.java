/**
The class is used to track the sleep of user
@author Daniyal Khan 3765942
*/

import java.util.Scanner;

public class SleepTracker {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.print("Enter your optimal sleep time in hours: ");
	double optimalTime = scan.nextDouble();

	int nightCount = 0;
	int belowOptimalSleep = 0;
	double totalSleepTime = 0;
	double lowestSleepTime = 0;

	System.out.print("Enter your sleep history terminated with a negative number: ");
	double sleepHistory = scan.nextDouble();
	lowestSleepTime = sleepHistory;

	while (sleepHistory != -1) {
		if (optimalTime > sleepHistory) {
			belowOptimalSleep++;
		}
		if (sleepHistory <= lowestSleepTime) {
			lowestSleepTime = sleepHistory;
		}
		totalSleepTime += sleepHistory;
		nightCount++;
		sleepHistory = scan.nextDouble();
	}

	double averageSleepTime = (double)totalSleepTime/nightCount;

	System.out.println(nightCount + " nights: " + belowOptimalSleep + " nights below your optimal sleep time");
	System.out.println("Lowest sleep time: " + lowestSleepTime + " hours");
	System.out.println("Average sleep time: " + averageSleepTime + " hours");
	}
}
