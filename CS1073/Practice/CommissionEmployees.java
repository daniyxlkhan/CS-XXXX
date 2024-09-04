public class CommissionEmployees extends Employee {
  private double commissionRate;
  private int salesAmount;

  public CommissionEmployees(String name, int sin, int expYears, double commissionRate, int salesAmount) {
    super(name, sin, expYears);
    this.commissionRate = commissionRate;
    this.salesAmount = salesAmount;
  }

  public double getPay() {
    return commissionRate*salesAmount;
  }

  public String toString() {
    return super.toString() + "\nCommission Rate: " + commissionRate + "\nSales Amount: " + salesAmount;
  }
}
