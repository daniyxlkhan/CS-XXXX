public class EmployeeList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public EmployeeList () {
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

    public void insertNode(Employee toAdd) {
        EmployeeNode newNode = new EmployeeNode(toAdd);
        size++;
        // First
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } 
        // Beginning of list
        else if (toAdd.compareTo(head.data) < 0) { 
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        // End of list
        else if(toAdd.compareTo(tail.data) > 0) {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        /// Middle of list
        else {
            EmployeeNode curr = head.next; 
            while (/*curr != null &&*/ toAdd.compareTo(curr.data) > 0) {
                curr = curr.next;
            }

            newNode.next = curr;
            newNode.prev = curr.prev;

            curr.prev.next = newNode;
            curr.prev = newNode;
        }

    }

    public boolean removeNode (Employee toRem) {
        if (head == null && tail == null) {
            return false;
        }
        // remove first node
        else if (head.data.compareTo(toRem) == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            } else {
                head.prev = null;
            }
            return true;
        }
        // remove last node
        else if (tail.data.compareTo(toRem) == 0) {
            tail = tail.prev;
            if (tail == null) {
                head = null;
            } else {
                tail.next = null;
            }
            return true;
        }
        // remove from middle 
        else {
            EmployeeNode curr = head;
            while(toRem.compareTo(curr.data) > 0) {
                curr = curr.next;
            }

            // if node we are trying to remove is greater than tail
            if (curr == null) {
                return false;
            }
            // we passed the position where the new node should be
                // it did not appear
            else if (toRem.compareTo(curr.data) != 0) {
                return false;
            }
            // found the node
            else {
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
                return true;
            }
        }
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