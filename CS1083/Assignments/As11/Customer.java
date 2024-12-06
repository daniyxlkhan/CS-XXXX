public class Customer implements Comparable<Customer>{
	private int uniqueID;
	private String name;
	private static int id = 0;

	public Customer(String name){
		this.name = name;
		uniqueID = id++;
	}

	public int compareTo(Customer other){
		return this.uniqueID - other.uniqueID;
	}

	public String toString(){
		return uniqueID + ": " + name;
	}
}