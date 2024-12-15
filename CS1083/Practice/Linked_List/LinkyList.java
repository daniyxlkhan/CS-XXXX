import org.w3c.dom.Node;

public class LinkyList {
    public Node head;

    public LinkyList () {
        head = null;
    }

    public void insertOrder (int toAdd) {
        Node newNode = new Node(toAdd);
        if (head == null) {
            head = newNode;
        } 
        else if (head.data > toAdd) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null && current.next.data < toAdd) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
    }    

    public void addFront (int toAdd) {
        Node newNode = new Node(toAdd);
        newNode.next = head;
        head = newNode;
    }

    public void addEnd (int toAdd) {
        Node newNode = new Node(toAdd);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public boolean removeFront() {
        if (head == null) {
            return false;
        } else {
            head = head.next;
            return true;
        }
    }

    public boolean removeEnd() {
        if (head == null) {
            return false;
        } else if (head.next == null) {
            head = null;
            return true;
        } else {
            Node current = head.next;
            Node prev = head;
            while (current.next != null) {
                prev = current;
                current = current.next;
            }
            prev.next = null;
            return true;
        }
    }

    public int size() {
        Node current = head;
        int size = 0;
        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
    }

    public String toString() {
        Node current = head;
        String toReturn = "";
        while (current != null) {
            toReturn += current.data + "\n";
            current = current.next;
        }
        return toReturn;
    }

    private class Node {
        public int data;
        public Node next;

        public Node (int dataIn) {
            this.data = dataIn;
            next = null;
        }
    }
}