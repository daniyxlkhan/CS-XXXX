public class HouseCat extends Feline {
    private String owner;

    public HouseCat(String givenName, double height, double weight, int lifespan, int countClaws, String owner) {
        super(givenName, height, weight, lifespan, countClaws);
        this.owner = owner;
    }

    public String makeNoise() {
        return "Meow";
    }
}