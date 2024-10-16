public abstract class Jewelry implements Taxable {
private double amount;
private String[] materials;

    public Jewelry(double amount, String ... materials){
        this.amount = amount;
        this.materials = materials;
    }

    public double calcTaxonly(){
        return amount * Jewelry. TAX_RATE;
    } 

    public double calcTaxPlusPrice(){
        return amount + this.calcTaxonly();
    }

    public int compareTo(Jewelry other) {
        if (calcTaxPlusPrice() == other.calcTaxPlusPrice()) {
            return 0;
        } else if (calcTaxPlusPrice() > other.calcTaxPlusPrice()) {
            return 1;
        } else {
            return -1;
        }
    }
}