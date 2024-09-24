public class Coyote extends Canine {

    public Coyote(String givenName, double height, double weight, int lifespan, int countTeeth) {
        super(givenName, height, weight, lifespan, countTeeth);
    }

    public String makeNoise() {
        return "Bark";
    }
}