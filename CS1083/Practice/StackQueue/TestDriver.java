public class TestDriver {
    public static void main (String args[]) {
        ArrayStack arrayStack = new ArrayStack();
        ArrayQueue arrayQueue = new ArrayQueue();
        Employee e1 = new Employee("A", 100);
        Employee e2 = new Employee("B", 200);
        Employee e3 = new Employee("C", 300);
        Employee e4 = new Employee("D", 400);
        Employee e5 = new Employee("E", 500);
        Employee e6 = new Employee("F", 600);
        Employee e7 = new Employee("G", 700);
        Employee e8 = new Employee("H", 800);
        Employee e9 = new Employee("I", 900);
        Employee e10 = new Employee("J", 1000);
        Employee e11 = new Employee("K",1100);

        arrayQueue.enqueue(e1);
        arrayQueue.enqueue(e2);
        arrayQueue.enqueue(e3);
        arrayQueue.enqueue(e4);
        arrayQueue.enqueue(e5);
        arrayQueue.enqueue(e6);
        arrayQueue.enqueue(e7);
        arrayQueue.enqueue(e8);
        arrayQueue.enqueue(e9);
        arrayQueue.enqueue(e9);
        
    
        
        System.out.println("DEQUEUE " + arrayQueue.dequeue());
        System.out.println("DEQUEUE " + arrayQueue.dequeue());

        arrayQueue.enqueue(e10);
        arrayQueue.enqueue(e11);

        // System.out.println("Peek: " + arrayQueue.peek());

        System.out.println(arrayQueue);
    }
}
