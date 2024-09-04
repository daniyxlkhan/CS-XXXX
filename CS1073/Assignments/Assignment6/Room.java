/**
This class represents a room in Hotel R Us
@author Daniyal Khan 3765942
*/

public class Room {
	/**
	Name of the person booking
	*/
	private String name;

	/**
	Number of nights staying
	*/
	private int numNights;

	/**
	Number of guests
	*/
	private int numGuests;
	
	/**
	Number of beds
	*/
	private int numBeds;
	
	/**
	Contructs a object of type Room given the name, number of nights, number of guests and 
	@param name Name of the person booking
	@param numNights Number of nights
	@param numGuests Number of guests
	@param numBeds Number of beds
	*/
	public Room(String name, int numNights, int numGuests, int numBeds) {
		this.name = name;
		this.numNights = numNights;
		this.numGuests = numGuests;
		this.numBeds = numBeds;
	}
	
	/**
	@return Name of the person who booked
	*/
	public String name() {
		return name;
	}
	
	/**
	@return Number of nights staying
	*/
	public int numNights() {
		return numNights;
	}
	
	/**
	@return Number of guests
	*/
	public int numGuests() {
		return numGuests;
	}
	
	/**
	@return Number of beds
	*/
	public int numBeds() {
		return numBeds;
	}
}
