public abstract class Animal implements Audible { // implements Audible
    private String givenName;
    private double height;
    private double weight;
    private int lifespan;

    public Animal(String givenName, double height, double weight, int lifespan) {
        this.givenName = givenName;
        this.height = height;
        this.weight = weight;
        this.lifespan = lifespan;
    }

    public String getGivenName() {
        return givenName;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getLifeSpan() {
        return lifespan;
    }

    public String toString() {
        String toReturn = "Name: " + givenName + "\tHeight: " + height
                        + "\t Weight: " + weight + "\tLifespan: " + lifespan;
        return toReturn;
    }
}