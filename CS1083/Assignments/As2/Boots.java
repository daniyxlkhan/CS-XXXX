public class Boots extends Shoes {
    private boolean lining;

    public Boots(String colour, String size, boolean lining) {
        super(colour, size);
        this.lining = lining;
    }

    public String toString() {
        return "Boots:\t" + super.getSize() + "\t" + super.getColour();
    }

    public boolean inFashion(String season) {
        return season.equals("Winter") ? true : false;
    }
}