public class Employee implements Comparable<Employee>{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calcSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return name + " $" + salary;
    }

    public int compareTo(Employee other) {
        String otherName = other.getName().toUpperCase();
        String thisName =  this.getName().toUpperCase();
        int comp = thisName.compareTo(otherName);
        if (comp == 0) {
            return (int)(this.calcSalary() - other.calcSalary()) * 100; // highest to lowest
        }
        else {
            return comp;
        }
    }
}