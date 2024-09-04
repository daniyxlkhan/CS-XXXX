/**
This class is for a resort that offers several activities to their guests, each for a fee
@author Daniyal Khan 3765942
*/

public class ActivityTab {

	/** 
	Name of the guest.
	*/
	private String guest;
	
	/** 
	Room Number of the guest.
	*/
	private int roomNum;
	
	/**
	Tracks the owing amount of the guest.
	*/
	private double owedAmount;
	
	/**
	Constructs a ActivityTab object given the guest's name and the room number.
	@param guestIn name of the guest
	@param roomNumIn room number of the guest
	*/
	public ActivityTab(String guestIn, int roomNumIn) {
		guest = guestIn;
		roomNum = roomNumIn;
		owedAmount = 0.0;
	}
	
	/**
	Returns the guest name.
	@return name of the guest
	*/
	public String getName() {
		return guest;
	}
	
	/**
	Returns the guest's room number.
	@return room number of the guest
	*/
	public int getRoomNumber() {
		return roomNum;
	}
	
	/**
	Returns the amount which the guest owes.
	@return amount owed by the guest
	*/
	public double getOwedAmount() {
		return owedAmount;
	}
	
	/**
	Updates the cost of activity done by the guest as their owed amount.
	@param activityCost cost of activity done by the guest
	*/
	public void addActivityPrice(double activityCost) {
		owedAmount += activityCost;
	}
	
	/**
	Returns the tip amount after taking in tip percentage from the guest.
	@param tipPercent tip percentage from the guest
	@return amount of tip
	*/
	public double getTipAmount(int tipPercent) {
		double tip = tipPercent * 0.01;
		return owedAmount * tip;
	}
}