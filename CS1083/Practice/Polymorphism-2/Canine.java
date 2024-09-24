public abstract class Canine extends Animal {
    private int countTeeth;

    public Canine(String givenName, double height, double weight, int lifespan, int countTeeth) {
        super(givenName, height, weight, lifespan);
        this.countTeeth = countTeeth;
    }
}