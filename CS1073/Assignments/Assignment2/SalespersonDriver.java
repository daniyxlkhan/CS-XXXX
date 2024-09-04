/**
 @author Daniyal Khan 3765942
*/

public class SalespersonDriver {
	public static void main(String[] args) {
		Salesperson person1 = new Salesperson("Luffy", 19.80, 2.4);
		Salesperson person2 = new Salesperson("Zoro", 16.50, 1.6);
		
		// adding the number of hours each person worked
		person1.incHours(40);
		person2.incHours(35);
		
		// the number of sales each person made
		person1.incSales(3);
		person2.incSales(5);
		
		// hours worked by each person
		System.out.println("Hours Worked by " + person1.getName() + ": " + person1.getHours());
		System.out.println("Hours Worked by " + person2.getName() + ": " + person2.getHours());
		
		// sales made by each person
		System.out.println("Sales made by " + person1.getName() + ": " + person1.getSales());
		System.out.println("Sales made by " + person2.getName() + ": " + person2.getSales());
		
		// pay of each person
		System.out.println("Pay of " + person1.getName() + ": " + person1.calcPay());
		System.out.println("Pay of " + person2.getName() + ": " + person2.calcPay());
		
		System.out.println();
		
		// test to see if the values have been reset to zero
		System.out.println("Hours Worked by " + person1.getName() + ": " + person1.getHours());
		System.out.println("Hours Worked by " + person2.getName() + ": " + person2.getHours());
		
		System.out.println("Sales made by " + person1.getName() + ": " + person1.getSales());
		System.out.println("Sales made by " + person2.getName() + ": " + person2.getSales());
	}
}