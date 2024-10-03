public class Record extends AudioItems {

    public Record(String title, String artist, double initialPrice, int releaseYear) {
        super(title, artist, initialPrice, releaseYear);
    }

    public double getSellingPrice() {
       return (super.getInitialPrice()) * ((2024 - super.getReleaseYear()) / 4.0);
    }
}