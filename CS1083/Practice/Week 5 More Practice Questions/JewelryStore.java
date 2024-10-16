import java.util.ArrayList;

public class JewelryStore {
    private ArrayList<Jewelry> items;

    public JewelryStore() {
        items = null;
    }

    public JewelryStore(ArrayList<Jewelry> items) {
        this.items = items;
    }

    public void addItem(Jewelry item) {
        if (items == null) {
            items = new ArrayList<>();
        }
        items.add(item);
    }

    public String toString() {
        if (items == null) {
            return "No items in the store";
        } else {
            String toReturn = "";
            for (Jewelry item: items) {
                toReturn += item.calcTaxPlusPrice() + "\n";
            }
            return toReturn;
        }
    }    
}
   

