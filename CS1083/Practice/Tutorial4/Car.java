public class Car extends Item implements Valuable, Drivable {
    private String model;
    private int year;
    private int numPassengers;

    public Car(String desc, double cost, String model, int year, int numPassengers) {
        super(desc, cost);
        this.model = model;
        this.year = year;
        this.year = numPassengers;
    }

    public String getModel() {
        return model;
    }

    public double getInitialCost() {
        return super.getCost();
    }

    public int getYear() {
        return numPassengers;
    }

    public String travelMethod() {
        return "Wherels";
    }

    public double currentCost() {
        return 1 - ((2024 - year)/10.0) * super.getCost();
    }

    public int compareTo(Car other) {
        if(this.model.compareTo(other.getModel() == 0)){

        } else if(this.cost > other.getCost()) {

        }
    }
}