public class BSTDriver {
    public static void main (String args[]) {
        BinarySearchTree bst1 = new BinarySearchTree();
        Customer c1 = new Customer("Elijah");
        Customer c2 = new Customer("Hosford");
        Customer c3 = new Customer("Gavin");
        Customer c4 = new Customer("Joseph");
        Customer c5 = new Customer("Connor");
        Customer c6 = new Customer("Sarah");
        Customer c7 = new Customer("Brayden");
        Customer c8 = new Customer("Luna");
        Customer c9 = new Customer("Nigel");

        // Not added in the binary search tree
        Customer c12 = new Customer("Daniel");

        bst1.insert(c9);
        bst1.insert(c1);
        bst1.insert(c8);
        bst1.insert(c7);
        bst1.insert(c6);
        bst1.insert(c2);
        bst1.insert(c3);   
        bst1.insert(c4);
        bst1.insert(c5);
        
        bst1.insert(c6); // Duplicates 
        bst1.insert(c6);
        bst1.insert(c6);
        bst1.insert(c1);
        
        System.out.println("Search for Elijah: " + bst1.search(c1));
        System.out.println("Search for Sarah: " + bst1.search(c6));
        System.out.println("Search for Gavin: " + bst1.search(c3));
        System.out.println("Search for Daniel (does not exist): " + bst1.search(c12));
        System.out.println();

        System.out.println("In Order:");
        bst1.printInOrder();
        System.out.println();

        System.out.println("Pre Order:");
        bst1.printPreOrder();
        System.out.println();

        System.out.println("Post Order:");
        bst1.printPostOrder();
        System.out.println();
        
    }
}
