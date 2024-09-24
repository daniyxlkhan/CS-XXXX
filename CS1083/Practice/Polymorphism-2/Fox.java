public class Fox extends Canine {

    public Fox(String givenName, double height, double weight, int lifespan, int countTeeth) {
        super(givenName, height, weight, lifespan, countTeeth);
    }

    public String makeNoise() {
        return "Yip";
    }
}