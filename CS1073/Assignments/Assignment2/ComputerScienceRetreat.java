/**
This is a driver class for ActivityTab
@author Daniyal Khan 3765942
*/

public class ComputerScienceRetreat{
	public static void main(String[] args) {
		ActivityTab anniesTab = new ActivityTab("Annie Easley", 73);
		anniesTab.addActivityPrice(4.50);
		
		ActivityTab alansTab = new ActivityTab("Alans Turing", 342);
		alansTab.addActivityPrice(9.75);
		
		ActivityTab clarencesTab = new ActivityTab("Clarence Ellis", 214);
		clarencesTab.addActivityPrice(6.00);
		clarencesTab.addActivityPrice(8.75);
		
		ActivityTab gracesTab = new ActivityTab("Grace Hopper", 742);
		gracesTab.addActivityPrice(9.75);
		
		gracesTab.addActivityPrice(11.25);
		clarencesTab.addActivityPrice(11.25);
		
		alansTab.addActivityPrice(12.75);
		anniesTab.addActivityPrice(7.80);
		
		System.out.println("Guest's Name: " + anniesTab.getName() +
							"\nRoom Number: " + anniesTab.getRoomNumber()+
							"\nAmount Owed: " + anniesTab.getOwedAmount());
		System.out.println();
		System.out.println("Guest's Name: " + alansTab.getName() +
							"\nRoom Number: " + alansTab.getRoomNumber()+
							"\nAmount Owed: " + alansTab.getOwedAmount());
		System.out.println();	
		System.out.println("Guest's Name: " + clarencesTab.getName() +
							"\nRoom Number: " + clarencesTab.getRoomNumber()+
							"\nAmount Owed: " + clarencesTab.getOwedAmount());
		System.out.println();			
		System.out.println("Guest's Name: " + gracesTab.getName() +
							"\nRoom Number: " + gracesTab.getRoomNumber()+
							"\nAmount Owed: " + gracesTab.getOwedAmount());
		System.out.println();
		
		System.out.println(anniesTab.getName() + " Tip: " + anniesTab.getTipAmount(20));
		System.out.println(alansTab.getName() + " Tip: " + alansTab.getTipAmount(20));
		System.out.println(clarencesTab.getName() + " Tip: " + clarencesTab.getTipAmount(18));
		System.out.println(gracesTab.getName() + " Tip: " + gracesTab.getTipAmount(15));
	}
}