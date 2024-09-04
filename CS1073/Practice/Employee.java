public class Employee {
  private String name;
  private final int sin;
  private int expYears;

  public Employee(String name, int sin, int expYears) {
    this.name = name;
    this.sin = sin;
    this.expYears = expYears;
  }

  public String name() {
    return name;
  }

  public int sin() {
    return sin;
  }

  public int expYears() {
    return expYears;
  }

  public int getVacationDays() {
    int baseVacationDays = 10;

    if (expYears >= 5) {
      baseVacationDays += 5;
    }
    if (expYears >= 20) {
      baseVacationDays += 5;
    }

    return baseVacationDays;
  }

  public String toString() {
    return "Name: " + name + "\nSIN: " + sin + "\nExperience Years: " + expYears;
  }
}
