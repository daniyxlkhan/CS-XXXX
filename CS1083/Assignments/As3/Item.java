public abstract class Item implements Purchasable, Comparable<Item>{
    private String title;
    private double initialPrice;

    public Item(String title, double initialPrice) {
        this.title = title;
        this.initialPrice = initialPrice;
    }

    public String getTitle() {
        return title;
    }

    public double getInitialPrice() {
        return initialPrice;
    }

    public String toString() {
        return title;
    }
    
    public int compareTo(Item other) {  
        int titleComparison = this.title.compareTo(other.getTitle()); // calculate the difference in the titles aplhabetically 
    
        if (titleComparison < 0) { // we only want to return -1, 1 or 0
            return -1;  
        } else if (titleComparison > 0) {
            return 1;  
        }
        
        // if title were aplhabetically; compare the prices
        if (this.initialPrice < other.getInitialPrice()) {
            return -1;
        } else if (this.initialPrice > other.getInitialPrice()) {
            return 1;
        } else {    // if prices and titles were equal return 0
            return 0;  
        }
    }
}