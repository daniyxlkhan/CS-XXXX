public class BinarySearchTree {
    public BSTNode root;

    public BinarySearchTree () {
        root = null;
    }

    public boolean insert(Customer c) {
        BSTNode newNode = new BSTNode(c);
        if (root == null) {
            root = newNode;
            return true;
        }
        return insertRec(root, newNode);
    }

    private boolean insertRec(BSTNode curr, BSTNode toAdd) {
        if (toAdd.data.compareTo(curr.data) == 0) {
            curr.frequency += 1;
            return false;
        } else if (toAdd.data.compareTo(curr.data) < 0) {
            if (curr.left == null) {
                curr.left = toAdd;
                return true;
            }
            return insertRec(curr.left, toAdd);
        } else {
            if (curr.right == null) {
                curr.right = toAdd;
                return true;
            }
            return insertRec(curr.right, toAdd);
        }
    }

    public int search(Customer c) {
        BSTNode newNode = new BSTNode(c);
        if (root == null) {
            return 0;
        }
        return searchRec(root, newNode);
    }

    private int searchRec(BSTNode curr, BSTNode toFind) {
        if (curr == null) {
            return 0;
        }
        if (toFind.data.compareTo(curr.data) == 0) {
            return curr.frequency;
        } else if (toFind.data.compareTo(curr.data) < 0) {
            return searchRec(curr.left, toFind);
        } else {
            return searchRec(curr.right, toFind);
        }
    } 

    public void printInOrder() {
        if (root == null) {
            return;
        }
        printInOrderRec(root);
    }

    private void printInOrderRec(BSTNode curr) {
        if (curr == null) {
            return;
        }
        printInOrderRec(curr.left);
        System.out.println(curr.data);
        printInOrderRec(curr.right);
    }

    public void printPreOrder() {
        if (root == null) {
            return;
        }
        printPreOrderRec(root);
    }

    private void printPreOrderRec(BSTNode curr) {
        if (curr == null) {
            return;
        }
        System.out.println(curr.data);
        printPreOrderRec(curr.left);
        printPreOrderRec(curr.right);
    }

    public void printPostOrder() {
        if (root == null) {
            return;
        }
        printPostOrderRec(root);
    }

    private void printPostOrderRec(BSTNode curr) {
        if (curr == null) {
            return;
        }
        printPostOrderRec(curr.left);
        printPostOrderRec(curr.right);
        System.out.println(curr.data);
    }

    private class BSTNode {
        public BSTNode left;
        public BSTNode right;
        public Customer data;
        public int frequency;

        public BSTNode(Customer dataIn) {
            this.left = null;
            this.right = null;
            this.data = dataIn;
            frequency = 1;
        }
    }
}


/*
 * Pre Order Traversal: VLR
 * In-Order Traversal: LVR
 * Post-Order Traversal: LRV
 * 
 * L = left
 * R = right
 * V = visit
 */