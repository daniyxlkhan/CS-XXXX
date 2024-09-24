public abstract class Shoes implements Wearable{
    private String colour;
    private String size;

    public Shoes(String colour, String size) {
        this.colour = colour;
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public String getSize() {
        return size;
    }
}