import java.util.Scanner;
import java.text.NumberFormat;

/**
This is a driver class which uses the CylinderCup and ConeCup classes
@author Daniyal Khan 3765942
*/

public class Driver {

  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    NumberFormat format = NumberFormat.getNumberInstance();
    int input = 0;
    double largestSurfaceAreaCone = 0.0;
    double largestSurfaceAreaCylinder = 0.0;
    format.setMaximumFractionDigits(3);
    format.setMinimumFractionDigits(3);

    while (input != 3) {
      System.out.print("\nSelect one of the following options: \n");
      System.out.print("1 - Enter the information for a conical cup\n");
      System.out.print("2 - Enter the information for a cylindrical cup\n");
      System.out.print("3 - Quit\n");
      System.out.print("Enter you choice: ");

      input = scan.nextInt();
      scan.nextLine(); // consumes the nextline character

      switch (input) {
        case 1:
          System.out.print("Length of radius (cm): ");
          double radiusConical = scan.nextDouble();
          scan.nextLine(); // consumes nextline character

          System.out.print("Length of height (cm): ");
          double heightConical = scan.nextDouble();
          scan.nextLine(); // consumes nextline character

          ConeCup conical = new ConeCup(radiusConical, heightConical);
          double surfaceAreaConical = conical.materialRequired();
          double volumeConical = conical.waterHoldAmount();

          System.out.print("Surface area: " + format.format(surfaceAreaConical) + "cm^2");
          System.out.println("\nVolume: " + format.format(volumeConical) + "cm^3");

          if (surfaceAreaConical > largestSurfaceAreaCone) {
            largestSurfaceAreaCone = surfaceAreaConical;
          }
          largestSurfaceAreaCone = surfaceAreaConical;
          break;

        case 2:
          System.out.print("Length of radius (cm): ");
          double radiusCylinder = scan.nextDouble();
          scan.nextLine(); // consumes the nextline character

          System.out.print("Length of height (cm): ");
          double heightCylinder = scan.nextDouble();
          scan.nextLine(); // consumes nextline character

          CylinderCup cylinderical = new CylinderCup(radiusCylinder, heightCylinder);
          double surfaceAreaCylinder = cylinderical.materialRequired();
          double volumeCylinder = cylinderical.waterHoldAmount();

          System.out.print("Surface area: " + format.format(surfaceAreaCylinder) + "cm^2");
          System.out.println("\nVolume: " + format.format(volumeCylinder) + "cm^3");

          if (surfaceAreaCylinder > largestSurfaceAreaCylinder) {
            largestSurfaceAreaCylinder = surfaceAreaCylinder;
          }
          largestSurfaceAreaCylinder = surfaceAreaCylinder;
          break;

        case 3:
            break;

        default:
          System.out.println("Not an available option");
      }
    }
      System.out.print("\nThe cup with the largest surface area is a " +
                        (largestSurfaceAreaCone > largestSurfaceAreaCylinder? "Cone" : "Cylinder"));
      System.out.println("\nThe surface area is: " +
                        format.format(largestSurfaceAreaCone > largestSurfaceAreaCylinder? largestSurfaceAreaCone : largestSurfaceAreaCylinder) + "cm^2");
  }
}
