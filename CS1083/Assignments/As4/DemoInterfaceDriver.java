import java.util.Scanner;

public class DemoInterfaceDriver {
    static Scanner scan = new Scanner(System.in);
    public static void main (String args[]) {
        Catalogue catalogue = new Catalogue(500); // starting with store value of a 500
        // Adding a few items in the catalogue
        Record record1 = new Record("Record1", "A", 120, 2022);
        AudioItems record2 = new Record("Record2", "B", 150, 2024);
        catalogue.buyItem(record1);
        catalogue.buyItem(record2);

        int input = 0;
        do {
            try {
                System.out.println("Select 1 to add, 2 to remove, or 3 to quit: ");
                input = Integer.parseInt(scan.nextLine());
                if (input == 1) { // add
                    System.out.println("Input title, cost, artist and year (separated by new line characters)");
                    boolean isAdded = catalogue.buyItem(createRecordFromUserInput());
                    if(isAdded) {
                        System.out.println("Successfully added\n");
                    } else {
                        System.out.println("Not enough balance\n");
                    }   
                } else if (input == 2) {
                    System.out.println("Input titlle, cost, artist and year (separated by new line characters)"); 
                    boolean isDeleted = catalogue.sellItem(createRecordFromUserInput());
                    if(isDeleted) {
                        System.out.println("Successfully deleted\n");
                    } else {
                        System.out.println("Record not found\n");
                    }
                }
            } catch (NumberFormatException nfe) {
                System.out.println("\nAn error occured with input");
                System.out.println("Input 1, 2, or 3 for commands");
                System.out.println("Costs should be doubles and years should be integers\n");
            } 
        } while (input != 3);
    }

    public static Record createRecordFromUserInput() {
        String title = scan.nextLine();
        Double cost = Double.parseDouble(scan.nextLine());
        String artist = scan.nextLine();
        int year = Integer.parseInt(scan.nextLine());
        return new Record(title, artist, cost, year);
    }
}