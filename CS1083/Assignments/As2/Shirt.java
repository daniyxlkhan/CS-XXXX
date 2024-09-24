public class Shirt implements Wearable {
    private String type;
    private final String size;
    private final String colour;

    public Shirt (String type, String size, String colour) {
        this.type = type;
        this.size = size;
        this.colour = colour;
    }

    public String toString() {
        return type + ":" + "\t" + size + "\t" + colour;
    }

    public boolean inFashion(String season) { 
        switch (type) {
            case "T-shirt":
                return (season.equals("Spring") || season.equals("Summer"));
            case "Flannel":
                return (season.equals("Autumn") || season.equals("Winter"));
            case "Sweater":
                return (season.equals("Autumn") || season.equals("Winter"));
            case "Hawaiian":
                return !(season.equals("Spring") || season.equals("Summer") || season.equals("Autumn"));
            default:
                return true; 
        }   
    }

    public String getColour() {
        return colour;
    }

    public String getSize() {
        return size;
    }
}