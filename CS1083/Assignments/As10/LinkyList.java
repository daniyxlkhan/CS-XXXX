import java.util.ArrayList;
import java.util.List;

public class LinkyList {
    public AccountNode head;
    public AccountNode tail;
    public int size;

    public LinkyList () {
        head = null;
        tail = null;
        size = 0;
    }

    public Account findNode (int acc_num) {
        AccountNode current = head;
        while (current != null && current.data.getAccountNum() != acc_num) {
            current = current.next;
        }

        if (current == null) {
            return null;
        }
        return current.data;
    }

    public void insertNode (Account toAdd) {
        AccountNode newNode = new AccountNode(toAdd);
        size++;
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else if (head.data.compareTo(toAdd) > 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (tail.data.compareTo(toAdd) < 0) {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else {
            AccountNode current = new AccountNode(toAdd);
            while (current.data.compareTo(toAdd) > 0) {
                current = current.next;
            }
            current.prev.next = newNode;
            newNode.prev = current.prev;

            newNode.next = current;
            current.prev = newNode;
        }
    }

    public boolean removeNode (int acc_num) {
        if (head == null && tail == null) {
            return false;
        } 
        else if (head.data.compareTo(acc_num) == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            } else {
                head.prev = null;
            }
            size--;
            return true;
        }
        else if (tail.data.compareTo(acc_num) == 0) {
            tail = tail.prev;
            if (tail == null) {
                head = null;
            } else {
                tail.next = null;
            }
            size--;
            return true;
        }
        else {
            AccountNode current = head;
            while (current.data.compareTo(acc_num) < 0) {
                current = current.next;
            }

            if (current == null) {
                return false;
            }
            else if (current.data.compareTo(acc_num) != 0) {
                return false;
            }
            else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                size--;
                return true;
            }
        }
    }

    public String toString() {
        AccountNode current = head;
        String toReturn = "";
        while (current != null) {
            toReturn += current.data.toString() + "\n";
            current = current.next;
        }
        return toReturn;
    }

    public ArrayList<Account> getAllAccounts() {
    ArrayList<Account> accountList = new ArrayList<>();
    AccountNode current = head;
        while (current != null) {
            accountList.add(current.data);
            current = current.next;
        }
    return accountList;
}

    private class AccountNode {
        public Account data;
        public AccountNode next;
        public AccountNode prev;

        public AccountNode (Account data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
