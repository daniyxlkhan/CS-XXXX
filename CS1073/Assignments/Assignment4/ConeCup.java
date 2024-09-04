/**
This class represents a conical cup that can hold water
@author Daniyal Khan 3765942
*/

public class ConeCup {
  /**
  Radius of the Conical Cup
  */
  private double radius;
  /**
  Height of the Conical Cup
  */
  private double height;
  /**
  Slant Height of the Conical Cup
  */
  private double slantHeight;

  /**
  Constructs a Conical Cup given the radius and height
  @param radius Radius of the Cup
  @param height Height of the Cup
  */
  public ConeCup(double radius, double height) {
    this.radius = radius;
    this.height = height;
    slantHeight = Math.sqrt((Math.pow(radius, 2)) + (Math.pow(height, 2)));
  }

  /**
  Returns the radius of the Conical Cup
  @return radius of the cup
  */
  public double getRadius() {
    return radius;
  }

  /**
  Returns the height of the Conical Cup
  @return height of the cup
  */
  public double getHeight() {
    return height;
  }

  /**
  Returns the slantHeight of the Conical Cup
  @return slantHeight of the cup
  */
  public double slantHeight() {
    return slantHeight;
  }

  /**
  Returns the material required for building the concical cup which is the surface area
  @return Surface area of the Cup
  */
  public double materialRequired() {
    return Math.PI * radius * (radius + slantHeight) - Math.PI * Math.pow(radius, 2);
  }

  /**
  Returns the amount of water cup can hold which is the volume
  @return Volume of the Cup
  */
  public double waterHoldAmount() {
    return (double)1/3 * Math.PI * Math.pow(radius, 2) * height;
  }
}
