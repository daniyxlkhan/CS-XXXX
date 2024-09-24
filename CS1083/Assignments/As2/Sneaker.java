public class Sneaker extends Shoes {
    private boolean laces;

    public Sneaker(String colour, String size, boolean laces) {
        super(colour, size);
        this.laces = laces;
    }

    public String toString() {
        return "Sneaker:\t" + super.getSize() + "\t" + super.getColour();
    }

    public boolean inFashion(String season) {
        return !season.equals("Winter");
    }
}