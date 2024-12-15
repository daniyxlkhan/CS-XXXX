public class p2q6 {
    public static BST swtichDLL2BST(LinkedList list) {
        BST tree = new BST();
        LinkedListNode current = list.head;
        
        while(current != null) {
            tree.insert(current.data);
            current = current.next;
        }
        return tree;
    }
}
