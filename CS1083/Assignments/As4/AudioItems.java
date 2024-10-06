import java.text.NumberFormat;

public abstract class AudioItems extends Item {  
    private String artist;
    private int releaseYear;

    public AudioItems(String title, String artist, double initialPrice, int releaseYear) {
        super(title, initialPrice);
        this.artist = artist;
        this.releaseYear = releaseYear;
    } 

    public int getReleaseYear() {
        return releaseYear;
    }

    public String artist() {
        return artist;
    }

    public String toString() {
        NumberFormat cost = NumberFormat.getCurrencyInstance();
        return super.toString() + " (" + artist + ")\tCost: " + cost.format(super.getInitialPrice());
    }
}