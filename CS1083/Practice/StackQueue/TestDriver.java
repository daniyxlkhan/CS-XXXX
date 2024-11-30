public class TestDriver {
    public static void main (String args[]) {
        ArrayStack arrayStack = new ArrayStack();
        Employee e1 = new Employee("A", 100);
        Employee e2 = new Employee("B", 200);
        Employee e3 = new Employee("C", 300);
        Employee e4 = new Employee("D", 400);
        Employee e5 = new Employee("E", 500);
        Employee e6 = new Employee("F", 600);
        Employee e7 = new Employee("G", 700);
        Employee e8 = new Employee("H", 800);

        arrayStack.push(e1);
        arrayStack.push(e2);
        arrayStack.push(e3);
        arrayStack.push(e4);
        arrayStack.push(e5);
        arrayStack.push(e6);
        arrayStack.push(e7);
        arrayStack.push(e8);

        System.out.println(arrayStack);
    }
}
