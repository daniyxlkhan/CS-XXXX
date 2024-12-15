public class TestList {
    public static void main(String[] args) {
        // LinkedList list = new LinkedList();
        LinkyList list = new LinkyList();
        list.insertOrder(0);
        list.insertOrder(2);
        list.insertOrder(3);
        list.insertOrder(-1);

        list.addFront(10);
        list.addEnd(20);
        
        list.removeEnd();
        
        System.out.println(list.toString());
        System.out.println("SIZE " + list.size());
    }
}