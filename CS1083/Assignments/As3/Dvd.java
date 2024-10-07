public class Dvd extends Item{

    public Dvd(String title, double price) {
        super(title, price);
    }

    public double getSellingPrice() {
        return super.getInitialPrice();
    }

    public String toString() {
        return super.toString() + "\tCost: $" + getSellingPrice();
    }
}