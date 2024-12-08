public class Driver {
    public static void main (String args[]) {
        p3 p3 = new p3(); // linked list singly

        p3.add(5);
        p3.add(0);
        p3.add(2);
        p3.add(4);
        p3.add(3);
        p3.add(1);
        System.out.println("Before removing:");
        System.out.println(p3);
        // p3.add(5);


        p3.removePos(10);
        System.out.println("After removing:");
        System.out.println(p3);
        
        System.out.println("Duplicates: " + p3.hasDuplicate());
    }

}
