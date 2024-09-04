public class HourlyEmployee extends Employee {
  private int hourlyRate;
  private int numHours;

  public HourlyEmployee(String name, int sin, int expYears, int hourlyRate, int numHours) {
    super(name, sin, expYears);
    this.hourlyRate = hourlyRate;
    this.numHours = numHours;
  }

  public double getPay() {
    return numHours*hourlyRate;
  }

  public String toString() {
    return super.toString() + "\nHourly Rate: " + hourlyRate + "\nNumber of hours worked: " + numHours;
  }
}
