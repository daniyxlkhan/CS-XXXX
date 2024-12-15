public class ArrayQueue {
    private Employee array[];
    private int comp;

    public ArrayQueue() {
        array = new Employee[10];
        comp = 0;
    }

    public void enqueue(Employee e) {
        if (comp < 10) {
            array[comp] = e;
            comp++;
        }
    }

    public Employee dequeue() {
        if (comp > 0) {
            Employee toReturn = array[0];
            for (int i = 0; i < comp-1; i++) {
                array[i] = array[i+1];
            }
            comp--;
            return toReturn;
        }
        return null;
    }

    public String toString() {
        String toReturn = "";
        for (int i = 0; i < comp; i++) {
            toReturn += array[i] + "\n";
        }
        return toReturn;
    }
}
