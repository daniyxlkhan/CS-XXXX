public class Table extends WoodWork implements Fixable{
	private double cost;

	public Table(String type, double cost){
		super(type);
		this.cost = cost;
	}

	public double costToFix(){
		return cost;
	}

}