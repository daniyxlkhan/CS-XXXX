import java.util.ArrayList;

public class Catalogue {
    private double storeValue;
    private ArrayList<Item> items;
    
    public Catalogue(double storeValue) {
        this.storeValue = storeValue;
        items = new ArrayList<Item>();
    }

    public boolean sellItem(Item i) {
        if (searchItemBinary(i) != -1) {
            storeValue += i.getSellingPrice();
            items.remove(i);
            return true;
        } else {
            return false;
        }
    }

    public boolean buyItem(Item i) {
        if (storeValue >= i.getInitialPrice()) {
            storeValue -= i.getInitialPrice();
            items.add(i);
            selectSort(); // sorting the arraylist as soon as user adds a new item
            return true;
        } else {
            return false;
        }
    }

    public int searchItemLinear(Item i) {
        int index = 0;
        for (Item item : items) {
            if (item.compareTo(i) == 0) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public String printCatalogue() {
        String catalogue = "";
        for (Item item: items) {
            catalogue += item + "\n";
        }
        return catalogue;
    }

    public void selectSort() {
        for(int outer = 0; outer < items.size()-1; outer++) {
            int min = outer;
            for(int inner = outer+1; inner < items.size(); inner++) {
                if (items.get(min).compareTo(items.get(inner)) > 0) {
                    min = inner;
                }
            }
            Item temp = items.get(outer);
            items.set(outer, items.get(min));
            items.set(min, temp);
        }
    }

    public int searchItemBinary(Item i) {
        int start = 0;
        int end = items.size()-1;

        while(start <= end) {
            int middle = (start+end)/2;
            int difference = items.get(middle).compareTo(i);

            if (difference == 0) {
                return middle;
            }
            if (difference < 0) {
                start = middle + 1;
            } 
            if (difference > 0) {
                end = middle - 1;
            }
        }
        return -1;
    }

    public boolean isSorted() {
        for (int i = 0; i < items.size() - 1; i++) {
            if (items.get(i).compareTo(items.get(i + 1)) > 0) { // If any item is greater than the next, the list is not sorted
                return false;
            }
        }
        return true;     
    }
     
}
    