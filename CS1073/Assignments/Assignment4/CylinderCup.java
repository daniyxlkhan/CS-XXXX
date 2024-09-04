/**
This class represents a cylindrical cup that can hold water
@author Daniyal Khan 3765942
*/

public class CylinderCup {
  /**
  Radius of the cylindrical cup
  */
  private double radius;
  /**
  Height of the cylindrical cup
  */
  private double height;

  /**
  Constructs a cylindrical cup given the radius and height
  @param radius Radius of the cup
  @param height Height of the cup
  */
  public CylinderCup(double radius, double height) {
    this.radius = radius;
    this.height = height;
  }

  /**
  Returns the radius of the cylindrical cup
  @return Radius of the cup
  */
  public double getRadius() {
    return radius;
  }

  /**
  Returns the height of the cylindrical cup
  @return Height of the cup
  */
  public double getHeight() {
    return height;
  }

  /**
  Returns the material required for making the cup which is the surface area
  @return Surface area of the cup
  */
  public double materialRequired() {
    return 2 * Math.PI * radius * (radius + height) - Math.PI * Math.pow(radius, 2);
  }

  /**
  Returns the amount of water cup can hold which is the volume
  @return Volume of the cup
  */
  public double waterHoldAmount() {
    return Math.PI * Math.pow(radius, 2) * height;
  }
}
