public class ArrayStack {
    private Employee array[];
    private int comp;

    public ArrayStack () {
        array = new Employee[10];
        comp = 0;
    }

    public void push(Employee e) {
        if (comp < 10) {
            array[comp] = e;
            comp++;
        }  
    }

    public Employee pop() {
        if (comp > 0) {
            comp--;
            return array[comp];
        }
        return null;
    }

    public Employee peek() {
        return array[comp];
    }

    public boolean isEmpty() {
        return comp == 0;
    }

    public int size() {
        return comp;
    }

    public String toString() {
        String toReturn = "";
        for (int i = 0; i < comp; i++) {
            toReturn += array[i] + "\n";
        }
        return toReturn;
    }

}
