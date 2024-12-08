public class p2 {
    Node start;

    public p2() {
        start = null;
    }

    public boolean find(String s) {
        if (start == null) {
            return false;
        }
        return findRec(start, s);
    }

    public boolean findRec(Node curr, String s) {
        if (curr == null) {
            return false;
        }
        if (s.compareTo(curr.s) == 0) {
            return true;
        } else if (s.compareTo(curr.s) > 0) {
            return findRec(curr.right, s);
        } else {
            return findRec(curr.left, s);
        }
    }

    private class Node {
        public String s;
        public Node left;
        public Node right;
        
        public Node(String s){
        this.s = s;
        left = null;
        right = null;
        }
    }
}