import java.util.ArrayList;
import java.util.Iterator;

public class VendingMachine {
    private ArrayList<Drink> vendingMachine;
    private double moneyMade;
    
    public VendingMachine() {
        vendingMachine = new ArrayList<>();
        moneyMade = 0;
    }

    public boolean addDrink(Drink toAdd) {
        vendingMachine.add(toAdd);
        return true;
    }

    public boolean addDrink(Drink[] array) {
        for (Drink arr : array) {
            vendingMachine.add(arr);
        }
        return true;
    }

    public boolean removeDrink(int ID) {
        for (Drink arr : vendingMachine) {
            if (arr.getID() == ID) {
                moneyMade += arr.getPrice();
                vendingMachine.remove(arr);
                return true;
            }
        }
        return false;
    }

    public boolean removeDrinkIter(int ID) {
        Iterator<Drink> iterator = vendingMachine.iterator();
        while (iterator.hasNext()) {
            Drink arr = iterator.next();
            if (arr.getID() == ID) {
                moneyMade += arr.getPrice();
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public double getMoney() {
        double temp = moneyMade;
        moneyMade = 0;
        return temp;
    }

    public String toString() {
        String toReturn = "";
        for (Drink arr : vendingMachine) {
            toReturn += arr + "\n";
        }
        return toReturn;
    }
}
