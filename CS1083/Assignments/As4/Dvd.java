import java.text.NumberFormat;

public class Dvd extends Item{

    public Dvd(String title, double price) {
        super(title, price);
    }

    public double getSellingPrice() {
        return super.getInitialPrice();
    }

    public String toString() {
        NumberFormat cost = NumberFormat.getCurrencyInstance();
        return super.toString() + "\tCost: " + cost.format(getSellingPrice());
    }
}