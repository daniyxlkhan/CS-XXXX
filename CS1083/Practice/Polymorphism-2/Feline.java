public abstract class Feline extends Animal {
    private int countClaws;

    public Feline(String givenName, double height, double weight, int lifespan, int countClaws) {
        super(givenName, height, weight, lifespan);
        this.countClaws = countClaws;
    }

    public String makeNoise() {
        return "Meow";
    }
}