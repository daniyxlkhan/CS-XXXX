public class Ring extends Jewelry {
    private int ringSize;

    public Ring(double amount, int ringSize, String ... materials){
        super(amount, materials);
        this.ringSize = ringSize;
    }

    public int getRingSize() {
        return ringSize;
    }

    public int compareTo(Ring other) {
        int priceComparison = super.compareTo(other);

        if (priceComparison != 0) {
            return priceComparison;
        }

        if (this.ringSize > other.ringSize) {
            return 1;
        } else {
            return -1;
        }
    }
    
}
