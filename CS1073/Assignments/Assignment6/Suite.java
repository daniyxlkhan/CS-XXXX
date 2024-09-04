import java.util.Random;
/**
This class represents a Suite in Hotel R Us
@author Daniyal Khan 3765942
*/

public class Suite extends Room {
	/**
	Base rate of the suite
	*/
	private final double BASE_RATE;

	/**
	Contructs a object of type Suite given the name, number of nights, number of guests and 
	@param name Name of the person booking
	@param numNights Number of nights
	@param numGuests Number of guests
	@param numBeds Number of beds
	*/
	public Suite(String name, int numNights, int numGuests, int numBeds) {
		super(name, numNights, numGuests, numBeds);
		BASE_RATE = 380;
	}
	
	/**
	@return Total cost of the suite 
	*/
	public double getRate() {
		double total = 0;
		int numExtraBed = super.numBeds() - 3;
		double additionalBedCharge = 15.00;
		total = super.numNights()*BASE_RATE;
		if (numExtraBed >= 1) {
			total += super.numNights()*(numExtraBed*additionalBedCharge);
		}
		return total;
	}
	
	/**
	@return Random perk (Champagne, Chocolates, Fruit basket)
	*/
	public String randPerk() {
		String perk = "";
		Random rand = new Random();
		int random = rand.nextInt(3)+1;
		switch (random) {
			case 1:
				perk = "Champagne";
				break;
			case 2:
				perk = "Chocolates";
				break;
			case 3:
				perk = "Fruit basket";
				break;
		}
		return perk;
	}
	
	/**
	@return Checkout time 
	*/
	public String checkOutTime() {
		return "12 noon";
	}
}
