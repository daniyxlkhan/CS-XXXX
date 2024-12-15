public class p3W1 {
    private Node head;
    private Node tail;

    public p3W1() {
        head = null;
        tail = null;
    }

    public int countOccurence(String s, Node current) {
        if (current == null) {
            return 0;
        }
        int count = 0;
        while (current != null) {
            if (current.data.equals(s)) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    public int countOccurenceRec(String s, Node current) {
        if (current == null) {
            return 0;
        }

        if (current.data.equals(s)) {
            return 1 + countOccurenceRec(s, current.next);
        } else {
            return countOccurenceRec(s, current.next);
        }
    }

    public int countOccurenceRec1(String s, Node current) { // Review session one
        if (current == null) {
            return 0;
        }
        else {
            int count = 0;
            if (s.equals(current.data)) {
                count++;
            }
            count += countOccurence(s, current.next);
            return count;
        }
    }

    private class Node {
        public String data;
        public Node next;
        public Node prev;

        public Node(String data){
            this.data = data;
            next = null;
            prev = null;
        }
        }
}
