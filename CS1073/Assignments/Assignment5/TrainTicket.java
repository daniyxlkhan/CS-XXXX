/**
This class represents a train ticket
@author Daniyal Khan 3765942
*/
 public class TrainTicket {
   /**
   Name of the passenger
   */
   private final String name;
   /**
   Number of checked bags of the passenger
   */
   private int bags;/**
   The trip distance the passenger will be travelling
   */
   private final double distance;

   /**
   Contructs a train ticket object given the name, number of bags and trip distance of the passenger
   @param name Name of the passenger
   @param bags Number of checked bags
   @param distance Trip distance
   */
   public TrainTicket(String name, int bags, double distance) {
     this.name = name;
     this.bags = bags;
     this.distance = distance;
   }

   /**
   Returns the name of the passenger
   @return Name of the passenger
   */
   public String passengerName() {
     return name;
   }

   /**
   Returns the checked bags of the passenger
   @return Number of checked bags of the passenger
   */
   public int checkedBags() {
     return bags;
   }

   /**
   Returns trip distance the passenger will be travelling
   @return Trip Distance
   */
   public double tripDistance() {
     return distance;
   }

   /**
   Returns the cost of ticket depending upon the rate
   @param rate Rate of the trip
   @return Cost of the ticket
   */
   public double computeCost(double rate) {
     return rate*distance + bags*45;
   }
 }
