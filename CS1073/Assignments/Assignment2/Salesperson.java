/**
 This class represents a salesperson.
 @author Daniyal Khan 3765942
*/
public class Salesperson {

	/**
	The name of the salesperson.
	*/
	private String name;
	
	

	/**
	The hourly wage of the salesperson.
	*/
	private double hourlyWage;
	
	

	/**
	The rate of commission of the salesperson (as a decimal).
	*/
	private double commissionRate;
	
	
	/**
	Hours the salesperson has worked since their last pay.
	*/
	private int numHours;
		
	
	/**
	Total value of sales the salesperson has made since their last pay.
	*/
	private int salesValue;
	



	/**
	This method constructs a salesperson with a specific hourly wage and rate of commission. 
	The hours worked and sales made are initially zero.
	@param nameIn The name of the salesperson.
	@param wageIn The hourly wage of the salesperson.
	@param commissionIn The commission of the salesperson (as a decimal).
	*/
	public Salesperson(String nameIn, double wageIn, double commissionIn) {
		name = nameIn;
		hourlyWage = wageIn;
		commissionRate = commissionIn;
		numHours = 0;
		salesValue = 0;
	}
	
	
	
	
	
	


	/**
	This method retrieves the name of the salesperson.
	@return The salesperson's name.
	*/
	public String getName() {
		return name;
	}
	
	
	


	/**
	This method retrieves the hourly wage of the salesperson.
	@return The salesperson hourly wage.
	*/
	public double getWage() {
		return hourlyWage;
	}
	
	
	/**
	This method retrieves the commission rate of the salesperson.
	@return The salesperson commission rate.
	*/
	public double getCommission() {
		return commissionRate;
	}
	


	/**
	This method retrieves the hours the salesperson has worked.
	@return The salesperson's hours since their last pay.
	*/
	public int getHours() {
		return numHours;
	}
	
	
	/**
	This method retrieves the sales the salesperson has made.
	@return The salesperson's sales since their last pay.
	*/
	public int getSales() {
		return salesValue;
	}

	
	
	
	/**
	This method calculates the pay of the salesperson. 
	The sales and hours are reset to zero.
	@return The salesperson's pay.
	*/
	public double calcPay() {
		double bonus = commissionRate * salesValue;
		double pay = hourlyWage * numHours;
		salesValue = 0;
		numHours = 0;
		return pay + bonus;
	}
	
		


	/**
	This method increases the salesperson's hours.
	@param hoursWorked Amount of hours worked.
	*/
	public void incHours(int hoursWorked) {
		numHours = numHours + hoursWorked;
	}
	
	
	
	/**
	This method increases the salesperson's sales.
	@param salesMade Amount of sales made.
	*/
	public void incSales(int salesMade) {
		salesValue = salesValue + salesMade;
	}

} //end Salesperson
