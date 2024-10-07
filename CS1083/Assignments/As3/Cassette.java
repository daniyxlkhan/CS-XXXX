public class Cassette extends AudioItems {

    public Cassette(String title, String artist, double initialPrice, int releaseYear) {
        super(title, artist, initialPrice, releaseYear);
    }

    public double getSellingPrice() {
        return (super.getInitialPrice()) + (super.getInitialPrice()) / ((2024 - super.getReleaseYear()) / 6.0);
    }
}