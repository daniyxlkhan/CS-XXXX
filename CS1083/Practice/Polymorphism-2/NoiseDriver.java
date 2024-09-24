import java.util.ArrayList;

public class NoiseDriver {
    public static void main(String[] args) {
        HouseCat cat = new HouseCat("Alfred", 10, 5, 17, 20, "Connor");
        Phone phone = new Phone("Denny");
        Coyote coyote = new Coyote("Bruce", 10, 5, 12, 40);
        Fox fox = new Fox("Frank", 10, 5, 13, 14);

        ArrayList<Audible> objects = new ArrayList<>();
        objects.add(cat);
        objects.add(phone);
        objects.add(coyote);
        objects.add(fox);

        for (Audible a : objects) {
            System.out.println(a.makeNoise());
        }
    }
}