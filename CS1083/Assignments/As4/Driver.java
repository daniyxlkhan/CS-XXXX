public class Driver {
    public static void main(String[] args) {
        Record record1 = new Record("Record1", "A", 120, 2022);
        AudioItems record2 = new Record("Record2", "B", 150, 2024);
        Cassette cassette1 = new Cassette("Record1", "C", 200, 2000);
        Dvd dvd1 = new Dvd("Dvd1", 50);
        Item dvd2 = new Dvd("Dvd1", 60);
        
        Cassette cassette2 = new Cassette("Cassette2", "D", 100, 2000);

        Catalogue catalogue1 = new Catalogue(1200);
        Catalogue catalogue2 = new Catalogue(0);

        // TEST CASE 1: Add 5 items to Catalogue
        catalogue1.buyItem(dvd1);
        catalogue1.buyItem(dvd2);
        catalogue1.buyItem(record1);
        catalogue1.buyItem(record2);
        catalogue1.buyItem(cassette1);

        System.out.println("Is the catalogue sorted? " + catalogue1.isSorted());
        System.out.println();
        
        
        // TEST CASE 2: Remove items from Catalogue until it is empty
        catalogue1.sellItem(record1);
        catalogue1.sellItem(record2);
        catalogue1.sellItem(cassette1);
        catalogue1.sellItem(dvd1);
        catalogue1.sellItem(dvd2);

        // TEST CASE 3: Remove an item which is not in the catalogue
        catalogue1.sellItem(cassette2);
        
        // TEST CASE 4: Add an item to catalogue when store does not have enough money to buy it
        catalogue2.buyItem(cassette2);


        catalogue1.buyItem(dvd1);
        catalogue1.buyItem(dvd2);
        catalogue1.buyItem(record1);
        catalogue1.buyItem(record2);
        catalogue1.buyItem(cassette1);

        // TEST CASE 5: Print the catalogue
        System.out.println(catalogue1.printCatalogue());
        System.out.println(catalogue2.printCatalogue());

        
    }
}