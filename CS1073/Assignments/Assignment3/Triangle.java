/**
 This class represents a triangle shape using 3 points.
 @author Natalie Webber
 @author Daniyal Khan 3765942
*/
public class Triangle {

	  private CartesianPoint pointA;
    private CartesianPoint pointB;
    private CartesianPoint pointC;
		
    public Triangle (double x1, double y1,
                     double x2, double y2,
                     double x3, double y3) {
		pointA = new CartesianPoint (x1, y1);
	    pointB = new CartesianPoint (x2, y2);
  	    pointC = new CartesianPoint (x3, y3);
   }

  	public Triangle (CartesianPoint p1,
                     CartesianPoint p2,
                     CartesianPoint p3) {
		pointA = p1;
		pointB = p2;
		pointC = p3;
	}

	/**
	This method returns the perimeter of a triangle
	@return The perimeter of the triangle
	*/
	public double getPerimeter() {
   		return pointA.distance(pointB) + pointB.distance(pointC) + pointC.distance(pointA);
    }

    /**
    This method tells if a triangle is equilateral or not
    @return True if the triangle is an equilateral and false if not
    */
    public boolean isEquilateral() {
    	double distanceAb = pointA.distance(pointB);
  		double distanceBc = pointB.distance(pointC);
  		double distanceCa = pointC.distance(pointA);
  		double tolerance = 1e-14;

    	if ((Math.abs(distanceAb-distanceBc) < tolerance)
    		&& Math.abs(distanceBc-distanceCa) < tolerance) {
    		return true;
    	}
    	return false;
    }

  	/**
    This method tells if a triangle is right-angled or not
    @return True if the triangle is right-angled and false if not
    */
  	public boolean isRight() {
  		double distanceAb = pointA.distance(pointB);
  		double distanceBc = pointB.distance(pointC);
  		double distanceCa = pointC.distance(pointA);

  		double tolerance = 1e-14;
  		double sqDistanceAb = distanceAb * distanceAb;
    	double sqDistanceBc = distanceBc * distanceBc;
   	 	double sqDistanceCa = distanceCa * distanceCa;

  		if (Math.abs(sqDistanceAb + sqDistanceBc - sqDistanceCa) < tolerance ||
  			Math.abs(sqDistanceBc + sqDistanceCa - sqDistanceAb) < tolerance ||
  			Math.abs(sqDistanceCa + sqDistanceAb - sqDistanceBc) < tolerance) {
			return true;
  		}
  		return false;
  	}

}
