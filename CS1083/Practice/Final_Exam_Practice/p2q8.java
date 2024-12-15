public class p2q8 {
    public Node head;
    public Node tail;

    public p2q8 (){
        head = null;
        tail = null;
    }

    public void add(double dataIn){
        Node newNode = new Node(dataIn);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        } else if (head.data > dataIn) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        } else if (tail.data < dataIn) {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            return;
        } else {
            Node current = head.next;
            while (current != null && dataIn > current.data) {
                current = current.next;
            }
            newNode.next = current;
            newNode.prev = current.prev;

            current.prev.next = newNode;
            current.prev = newNode;
        }
        
    }

    private class Node {
        public double data;
        public Node next;
        public Node prev;

        public Node(double dataIn) {
            this.data = dataIn;
            this.next = null;
            this.prev = null;
        }
    }
}
