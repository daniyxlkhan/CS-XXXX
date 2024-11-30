public class Queue {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public Queue () {
        head = null;
        tail = null;
        size = 0;
    }

    public String toString() {
        String msg = "";
        EmployeeNode current = head;
        while (current != null) {
            msg = current.data.toString() + "\n";
            current = current.next;
        }
        return msg;
    }

    public String toStringReverse() {
        String msg = "";
        EmployeeNode current = tail;
        while (current != null) {
            msg = current.data.toString() + "\n";
            current = current.prev;
        }
        return msg;
    }

    public void enqueue(Employee toAdd) {
        EmployeeNode newNode = new EmployeeNode(toAdd);
        size++;
        // First
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } 
        // Beginning of list
        else { 
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public Employee dequeue () {
        // empty list
        if (head == null && tail == null) {
            return null;
        }
        // remove last node
        else {
            Employee toReturn = tail.data;
            tail = tail.prev;
            if (tail == null) {
                head = null;
            } else {
                tail.next = null;
            }
            size--;
            return toReturn;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    private class EmployeeNode {
        public Employee data;
        public EmployeeNode next;
        public EmployeeNode prev;

        public EmployeeNode (Employee data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }
}