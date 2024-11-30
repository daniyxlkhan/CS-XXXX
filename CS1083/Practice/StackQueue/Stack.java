public class Stack {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public Stack () {
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

    public void push(Employee toAdd) {
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

    public Employee pop() {
        // empty list
        if (head == null && tail == null) {
            return null;
        }
        // remove last node
        else {
            Employee toReturn = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            } else {
                head.prev = null;
            }
            size--;
            return toReturn;
        }
    }

    public Employee peek() {
        return head.data; 
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