public class Pants implements Wearable{
    private final String colour;
    private String size;

    public Pants(String colour, String length) {
        this.colour = colour;
        this.size = length;
    }

    public String toString() {
        return "Pants:\t" + size + "\t" + colour;
    }

    public boolean inFashion(String season) {
        double lengthNum = 0;

        if (size.endsWith("in")) {
            lengthNum = Double.valueOf(size.substring(0, size.length()-2));
        } else if (size.endsWith("cm")) {  
            lengthNum = Double.valueOf(size.substring(0, size.length()-2)) / 2.54; // cm to in
        }
        return (lengthNum > 25 && season.equals("Winter"));
    }

    public String getColour() {
        return colour;
    }

    public String getSize() {
        return size;
    }
}