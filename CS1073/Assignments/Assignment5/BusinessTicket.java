/**
This class is a subclass of TrainTicket and represents Business ticket
@author Daniyal Khan 3765942
*/

public class BusinessTicket extends TrainTicket {
  /**
  If the seat is reclining or not
  */
  private boolean recliningSeat;

  /**
  Contructs a BusinessTicket object given the name, number of bags, trip distance and if seat is reclining or not
  @param name Name of the passenger
  @param bags Number of checked bags
  @param distance Trip Distance
  @param recliningSeat If the seat reclines or not
  */
  public BusinessTicket(String name, int bags, double distance, boolean recliningSeat) {
    super(name, bags, distance);
    this.recliningSeat = recliningSeat;
  }

  /**
  Calculates the cost of ticket for Business category
  @param rate Rate of the trip
  @return Total Cost of the ticket
  */
  public double computeCost(double rate) {
    double totalCost = super.computeCost(rate) + 104.50;
    if (recliningSeat) {
      totalCost += 55.75;
    }
    return totalCost;
  }
}
