public class Drink {
    private final int id;
    private String description;
    private double price;
    private static int uniqueID = 1;

    public Drink(String description, double price) {
        id = uniqueID;
        this.description = description;
        this.price = price;
        uniqueID++;
    }

    public double getPrice() {
        return price;
    }
    
    public int getID() {
        return id;
    }
    
    public String toString() {
        return id + " " + description + " " + price;
    }
}  
