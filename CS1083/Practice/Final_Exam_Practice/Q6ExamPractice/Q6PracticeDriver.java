public class Q6PracticeDriver{
	public static void main(String[] args){
		//Part 1 - does not work
		WoodWork ww1 = new Table("Oak", 544.99);
		System.out.println(ww1.costToFix());

		//Part 2 - does work
		Fixable f1 = new Table("Maple", 349.99);
		System.out.println(f1.costToFix());

		//Part 3 - does work
		Table t1 = new Table("Maple", 799.99);
		System.out.println(t1.getType());

		//Part 4 - does not work
		Fixable f2 = new Sink(199.99, 80);
		System.out.println((Table)f2.getType());

		//Part 5 - does not work
		WoodWork ww2 = new WoodWork("Oak");
		System.out.println(ww2.getType());

		//Part 6
		Fixable f3 = new Table("Maple", 349.99);
		System.out.println(((WoodWork)f3).toString());
	} 
}