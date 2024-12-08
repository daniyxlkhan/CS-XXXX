public class p3 {
    Node head;
    Node tail;
    
    public p3() {
        head = null;
        tail = null;
    }

    public void add(int dataIn) {
        Node newNode = new Node(dataIn);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else if (head.data > dataIn) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (tail.data < dataIn) {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else {
            Node current = head;
            while (current.next != null && dataIn > current.next.data) {
                current = current.next;
            }
            
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    public void removePos(int index) {
        if (head == null) {
            return;
        }
        Node current = head;
        int count = 0;
        if (index == 0) {
            if (head == tail) {
                head = null;
                tail = null;
                return;
            }
            head = head.next;
            head.prev = null;
            return;    
        }

        while (current != null && index > count) {
            current = current.next;
            count++;
        }

        if (current == null) {
            return;
        }

        if (current == tail) {
            tail = current.prev;
            tail.next = null;
            return;
        } 
        current.prev.next = current.next;
        current.next.prev = current.prev;
    }

    public boolean hasDuplicate() {
        if (head == null) {
            return false;
        }
        Node current = head;
        while (current != null) {
            Node comp = current.next;
            while (comp != null) {    
                if (comp.data == current.data) {
                    return true;
                }
                comp = comp.next;
            }
            current = current.next;
        }
        
        return false;
    }
    
    public String toString() {
        Node current = head;
        String toReturn = "";
        while (current != null) {
            toReturn += current.data + "\t";
            current = current.next;
        }
        return toReturn;
    }

    private class Node {
        public int data;
        public Node next;
        public Node prev;
        
        public Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }
}