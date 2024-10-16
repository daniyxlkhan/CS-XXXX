public interface Taxable extends Comparable<Jewelry> {
    public double TAX_RATE = 0.15;
    public double calcTaxonly();
    public double calcTaxPlusPrice();
}
