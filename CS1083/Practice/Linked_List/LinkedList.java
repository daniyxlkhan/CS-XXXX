import java.util.NoSuchElementException;

public class LinkedList {
    public Node head;
    public int size;

    public LinkedList() {
        head = null; // does not point to anything initially
        size = 0;
    }
    // service methods: add or remove (either at beginning, end or inserting at a particular location), print, size etc

    // different scenarios of inserting itno a linked list
    // Add to empty
    // Add to middle
    // Add a node to the end
    // Add to the front


    public void insertOrder (int toAdd) {
        size++;
        Node newNode = new Node(toAdd);
        if (head == null) { // Adding to empty list
            head = newNode; 
        } else if (head.data > toAdd) { // Adding to the beginning of a list
            newNode.next = head;
            head = newNode;
        } else {
            Node prev = head;
            Node current = head.next;
            while (current != null && current.data < toAdd) {
                prev = current;
                current = current.next;
            }
            prev.next = newNode;
            newNode.next = current;

            /* DONT NEED ALL OF THIS BECAUSE THE ABOVE SOLUTION is simpler
            // Add new node to the end
            if (current == null) {
                prev.next = newNode;
            } else { // Adding to the middle of the list
                prev.next = newNode;
                newNode.next = current;
            }
            */
        }


    }

    /* No that efficient
    public int size() {
        Node current = head;
        int counter = 0;
        while(current != null) {
            current = current.next;
            counter++;
        }
        return counter;
    }
    */

    public int size() {
        return size;
    }
    
    public int[] list2Array() {
        int[] array = new int[size];
        Node current = head;
        int count = 0;
        while (current != null) {
            array[count] = current.data;
            count++;
            current = current.next;
        }
        return array;
    }

    public void addArray2List(int[] array) {
        for (int i = 0; i < array.length; i++) {
            addEnd(array[i]);
        }
    }

    public boolean removeFront() {
        if (head == null) {
            return false;
        } else {
            head = head.next;
            size--;
            return true;
        }
    }
    /*
    public boolean removeFront() throws NoSuchElementException { removes first element but also returns it
        if (head == null) {
            return new NoSuchElementException("The linked list is empty!");
        } else {
            int contents = head.data;
            head = head.next;
            size--;
            return contents;
        }
    }
     */
    public boolean removeEnd() {
        // If list is empty
        if (head == null) {
            return false;
        } else if (head.next == null) { // if list contains one element
            head = null;
            size--;
            return true;
        } else { // if list has more than 1 element
            Node current = head;
            while (current.next.next != null) { 
                current = current.next;
            }
            current.next = null; // get rid of the last element
            size--;
            return true;
            /* another way to do this
            Node previous = null;
            Node current = head;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
            size--;
            return true;
             */
        }
    }

    public void addFront(int toAdd) {
        size++;
        Node newNode = new Node(toAdd);
        newNode.next = head;
        head = newNode;
    }

    public void addEnd(int toAdd) {
        size++;
        if(head == null) {
            head = new Node(toAdd);
        } else {
            Node newNode = new Node(toAdd);
            Node last = head;
            while (last.next != null) { // this can cause a NullPointerException because last can be null --- 
                last = last.next; // if head is null thats why we have an if statement
            }
            last.next = newNode;
        }
    }

    public String toString() {
        String statement = "";
        Node current = head; // point to start of list
        while (current != null) { // loop through each node in the list
            statement += current.data + "\n";
            current = current.next;
        }
        return statement;
    }
    
    public boolean removeElement(int val) {
        if (head == null) {
            return false;
        } else if (head.data == val) { // if the first one is the one we want to remove
            this.removeFront();
            return true;
        } else {
            Node current = head;
            while (current.next != null && current.next.data != val) {
                current = current.next;
            }   
            if (current.data != val) { // if val could not be found
                return false;
            } else { // val was found at current's next node
                current.next = current.next.next; 
                size--;
                return true;
            }
        }
    }

    

    // inner class represents a Node in LinkedList object (Helper class)
    private class Node { // if it is "public" other programs can make a Node type object which we dont want
        public int data;
        public Node next;

        public Node(int dataIn) {
            this.data = dataIn;
            this.next = null; // does not point to anything initially
        }
    }
}

// NOTES:
// if the list empty? then the head points to null
// Keep the head pointer updated if the first node is removed or added
// Watch out for null pointers
