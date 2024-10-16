public class Necklace extends Jewelry {
    private double circumference;

    public Necklace(double amount, double circumference, String ... materials){
        super (amount, materials);
        this.circumference = circumference;
    }

    public double getCicumference() {
        return circumference;
    }
}
