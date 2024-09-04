/**
This class is a subclass of TrainTicket and represents Sleeper car tickets
@author Daniyal Khan 3765942
*/

public class SleepCarTicket extends TrainTicket {
  /**
  The number of nights passenger will be staying
  */
  private int numNights;

  /**
  Contucts a SleepCarTicket object given the name, number of bags, distance of trip and number of nights
  @param name Name of the passenger
  @param bags Number of bags
  @param distance Trip Distance
  @param numNights Number of nights
  */
  public SleepCarTicket(String name, int bags, double distance, int numNights) {
    super(name, bags, distance);
    this.numNights = numNights;
  }

  /**
  Calculates the cost of ticket for Sleep Car category
  @param rate Rate of the trip
  @return Total Cost of the ticket
  */
  public double computeCost(double rate) {
    double totalCost = super.computeCost(rate) + 167;
    totalCost += 95; // cost of first night
    if (numNights > 1) {
      totalCost += (numNights - 1)*80; // cost of every night excluding first night
    }
    return totalCost;
  }
}
