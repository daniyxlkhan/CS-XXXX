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

    public void sortItem(ArrayList<Item> itemsCopy) {
            
    }

    public int searchItemBinary(Item i) {
        ArrayList<Item> itemsCopy = items;
        sortItem(itemsCopy);

        int start = 0;
        int end = itemsCopy.size()-1;

        while(start <= end) {
            int middle = (start+end)/2;
            int difference = itemsCopy.get(middle).compareTo(i);

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


    

}