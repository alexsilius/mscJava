

/*
	Write a program in which you create and use a class called Point, with two fields of type double (e.g. x, y) and the following methods:
		distanceTo(Point): calculates the distance to another point.
		distanceToOrigin(): calculates the distance to the origin. Implement it by calling the first method.
		moveTo(double x, double y): changes the coordinates of this point to be the given parameters x and y.
		moveTo(Point): changes the coordinates of this point to move where the given point is.

		clone(): returns a copy of the current point with the same coordinates.
		opposite(): returns a copy of the current point with the coordinates multiplied by −1.
		Two methods in a class can have the same name (identifier) as long as their parameters are different. This is
		called method overloading and we will see more of that in the future.
		
*/

			
			
			
			

class Point{

	double x;
	double y;
	double d;

	public distanceTo(Point point){
		
		point.d = point.x - point.y;
		if(point.d < 0){
			point.d = -point.d;
		}
		return distance;
		
	}
	
	public void distanceToOrigin(){
		
		
	}
}