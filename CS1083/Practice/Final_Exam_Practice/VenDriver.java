public class VenDriver {
    public static void main (String[] args) {
        Drink drink1 = new Drink("Cola", 80);
        Drink drink2 = new Drink("Fanta", 50);
        Drink drink3 = new Drink("Sprite", 70);
        Drink drink4 = new Drink("7up", 30);
        Drink drink5 = new Drink("Coke", 60);
        Drink drink6 = new Drink("Dr.Pepper", 20);
        Drink drink7 = new Drink("Crush Orange", 40);
        Drink drink8 = new Drink("Pepsi", 60);
        Drink drink9 = new Drink("Coke Diet", 40);
        Drink drink10 = new Drink("Coke Zero", 30);

        Drink[] drinks = { drink1, drink2, drink3, drink4, drink5 };

        VendingMachine vendingMachine = new VendingMachine();

        // vendingMachine.addDrink(drink1);
        // vendingMachine.addDrink(drink2);
        // vendingMachine.addDrink(drink3);
        // vendingMachine.addDrink(drink4);
        // vendingMachine.addDrink(drink5);
        vendingMachine.addDrink(drink6);
        vendingMachine.addDrink(drink7);
        vendingMachine.addDrink(drink8);
        vendingMachine.addDrink(drink9);
        vendingMachine.addDrink(drink10);

        vendingMachine.addDrink(drinks);
        
        System.out.println(vendingMachine);

        System.out.println(vendingMachine.removeDrink(100));

        System.out.println("After: ");
        System.out.println(vendingMachine);
    }       
}
