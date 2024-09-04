import java.text.NumberFormat;
/**
This is a driver class for TrainTicket
@author Daniyal Kahan 3765942
*/

public class TicketApp {
  public static void main(String[] args) {
    NumberFormat format = NumberFormat.getCurrencyInstance();
    format.setMaximumFractionDigits(2);
    format.setMinimumFractionDigits(2);

    TrainTicket grace = new TrainTicket("Grace Hopper", 2, 1150);
    TrainTicket joy = new TrainTicket("Joy Buolamwini", 1, 820);
    TrainTicket tim = new TrainTicket("Tim Berners-Lee", 2, 755);
    TrainTicket margaret = new BusinessTicket("Margaret Hamilton", 0, 690, true);
    TrainTicket barbara = new BusinessTicket("Barbara Liskov", 3, 1402, false);
    TrainTicket shafi = new BusinessTicket("Shafi Goldwasser", 1, 975, true);
    TrainTicket alan = new SleepCarTicket("Alan Turing", 4, 3327, 3);
    TrainTicket lynn = new SleepCarTicket("Lynn Conway", 0, 1766, 1);
    TrainTicket jeannette = new SleepCarTicket("Jeannette Wing", 3, 5003, 4);

    System.out.println("Passenger & Trip Distance\tBags\tCost");
    System.out.println("=========================\t=====\t========");

    System.out.println(grace.passengerName() + " (" + grace.tripDistance() + "km) " + "\t" + grace.checkedBags() + "\t" +  format.format(grace.computeCost(1.35)));
    System.out.println(joy.passengerName() + " (" + joy.tripDistance() + "km) " + "\t" + joy.checkedBags() + "\t" + format.format(joy.computeCost(0.75)));
    System.out.println(tim.passengerName() + " (" + tim.tripDistance() + "km) " + "\t" + tim.checkedBags() + "\t" + format.format(tim.computeCost(1.15)));
    System.out.println(margaret.passengerName() + " (" + margaret.tripDistance() + "km) " + "\t" + margaret.checkedBags() + "\t" + format.format(margaret.computeCost(1.20)));
    System.out.println(barbara.passengerName() + " (" + barbara.tripDistance() + "km) " + "\t" + barbara.checkedBags() + "\t" + format.format(barbara.computeCost(0.95)));
    System.out.println(shafi.passengerName() + " (" + shafi.tripDistance() + "km) " + "\t" + shafi.checkedBags() + "\t" + format.format(shafi.computeCost(0.85)));
    System.out.println(alan.passengerName() + " (" + alan.tripDistance() + "km)  " + "\t" + alan.checkedBags() + "\t" + format.format(alan.computeCost(0.85)));
    System.out.println(lynn.passengerName() + " (" + lynn.tripDistance() + "km)  " + "\t" + lynn.checkedBags() + "\t" + format.format(lynn.computeCost(0.65)));
    System.out.println(jeannette.passengerName() + " (" + jeannette.tripDistance() + "km)" + "\t" + jeannette.checkedBags() + "\t" + format.format(jeannette.computeCost(0.65)));


  }
}
