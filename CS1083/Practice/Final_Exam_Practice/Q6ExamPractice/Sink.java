public class Sink implements Fixable{
	private double cost;
	private double basinWidth;

	public Sink(double cost, double basinWidth){
		this.cost = cost;
		this.basinWidth = basinWidth;
	}

	public double costToFix(){
		return cost;
	}

}