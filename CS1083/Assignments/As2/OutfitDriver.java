import java.util.ArrayList;

public class OutfitDriver {

    public static void main(String[] args) {
        Shirt shirt = new Shirt("Flannel", "Medium", "Red and White");
        Pants pants = new Pants("Blue", "63.246cm");
        Shoes boots = new Boots("Black", "9 American", true);
        Shoes sneakers = new Sneaker("White", "10 European", true);

        ArrayList<Wearable> array = new ArrayList<>();
        array.add(shirt);
        array.add(pants);
        array.add(boots);
        array.add(sneakers);

        boolean inFashion = true;

        for (Wearable outfit : array) {
            System.out.println(outfit);
            if(!outfit.inFashion("Winter")) {
                inFashion = false;
            }
        }

        System.out.println("This outfit is" + (inFashion? " YES ":" NOT ") + "in Fashion");
    }
}