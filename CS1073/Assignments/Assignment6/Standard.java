import java.util.Random;
/**
This class represents a Standard room in Hotel R Us
@author Daniyal Khan 3765942
*/

public class Standard extends Room {
	/**
	Base rate for a standard room
	*/
	private final double BASE_RATE;

	/**
	Contructs a object of type Standard given the name, number of nights, number of guests and 
	@param name Name of the person booking
	@param numNights Number of nights
	@param numGuests Number of guests
	@param numBeds Number of beds
	*/
	public Standard(String name, int numNights, int numGuests, int numBeds) {
		super(name, numNights, numGuests, numBeds);
		BASE_RATE = 225;
	}
	
	/**
	@return Total cost of the suite 
	*/
	public double getRate() {
		double total = 0;
		int numExtraBed = super.numBeds() - 2;
		double additionalBedCharge = 20.00;
		double breakFastCharge = 9.75;
		total = super.numNights()*BASE_RATE + super.numNights()*(breakFastCharge*super.numGuests());
		if (numExtraBed >= 1) {
			total += super.numNights()*(additionalBedCharge*numExtraBed);
		}
		return total;
	}
	
	/**
	@return Random checkout time (either 10am or 11am)
	*/
	public String checkOutTime() {
		String time = "";
		Random rand = new Random();
		int random = rand.nextInt(2) + 1;
		switch (random) {
			case 1:
				time = "11am";
				break;
			case 2:
				time = "10am";
				break;
		}
		return time;
	}
}
