/**
@author Daniyal Khan 3765942
*/

public class TestTriangle {
	
	public static void main(String[] args) {
		Triangle t1 = new Triangle(-0.5, 0.0, 0.5, 0.0, 0.0, Math.sqrt(3)/2);
		Triangle t2 = new Triangle(0.0, 0.0, 1.0, 0.0, 0.0, 1.0);
		
		if(t1.isEquilateral()) {
			System.out.println("The triangle t1 is a equilateral triangle");
		} 
		else {
			System.out.println("The triangle t1 is not an equilateral triangle");
		}
		
		if(t2.isRight()) {
			System.out.println("The triangle t2 is a right angle triangle");
		} 
		else {
			System.out.println("The triangle t2 is not a right angle triangle");
		}
	}
}