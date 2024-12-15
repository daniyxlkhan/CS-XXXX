public class EmployeeListDriver {
    public static void main (String[] args) {
        Employee e1 = new Employee("PersonA", 50000);
        Employee e2 = new Employee("PersonB", 60000);
        Employee e3 = new Employee("PersonC", 70000);
        Employee e4 = new Employee("PersonD",80000);
        Employee e5 = new Employee("PersonE", 90000);

        EmployeeList list = new EmployeeList();
        list.insertNode(e3);
        list.insertNode(e1);
        list.insertNode(e2);
        list.insertNode(e5);
        list.insertNode(e4);

        System.out.println(list.toString());
    }
}