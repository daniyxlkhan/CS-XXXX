public class TestCharList {
    public static void main (String[] args) {
        // TEST 1
        CharList charList1 = new CharList();
        CharList charList2 = new CharList();

        // System.out.println("List1:");
        charList1.readList("test1a.in");
        // charList1.printRec1(charList1.head);

        // System.out.println("List2:");
        charList2.readList("test1b.in");
        // charList2.printRec1(charList2.head);

        charList1.mergeLists(charList2);

        System.out.println("Total Character Count: " + charList1.charCount());
        charList1.printRec1(charList1.head);

        System.out.println("Merged List (Backwards):");
        charList1.printRecBackwards1(charList1.head);

        // TEST 2
        System.out.println();
        System.out.println("TEST2");
        charList1.readList("test2a.in");
        charList2.readList("test2b.in");

        System.out.println("List 1: ");
        charList1.printRec1(charList1.head);
        System.out.println("List 2: ");
        charList1.printRec1(charList2.head);
        charList1.insertValue('z', 2); // inserting at the end
        charList1.insertValue('k', 2); // inserting at existing node
        charList2.insertValue('a', 3); // inserting at the start of the list
        System.out.println("List 1: (After)");
        charList1.printRec1(charList1.head);
        System.out.println("List 2: (After)");
        charList1.printRec1(charList2.head);
    }
}
