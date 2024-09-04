import java.util.Scanner;

public class Practice {
	public static void main(String args[]) {
	    Scanner reader = new Scanner(System.in);
	    System.out.println("Welcome to the Rectangle App! ");
	    System.out.println();
	    
	    System.out.print("Enter the units of measurement: ");
	    String unit = reader.nextLine();
	    System.out.println();
	    
	    System.out.print("Enter the width of the rectangle (in " + unit +")" + " : ");
	    double width = Double.valueOf(reader.nextLine());
	    System.out.println();
	    
	    System.out.print("Enter the height of the rectangle (in " + unit +")" + " : ");
	    double height = Double.valueOf(reader.nextLine());
	    System.out.println(); 
		
		Rectangle rec1 = new Rectangle(unit, width, height);
		
		System.out.println("The area of the rectangle is " + rec1.getArea() + " cm^2");
		System.out.println();
		System.out.println("The perimeter of the rectangle is " + rec1.getPerimeter() + " cm");
		reader.close();
	}
}