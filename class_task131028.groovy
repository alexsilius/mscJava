

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
	int result = fib(40);
	
	
	int fib(int n) {
		if ((n == 1) || (n == 2)) {
			return 1;
		} 
		else {
			int result = fib(n-1) + fib(n-2); // method calls itself
			return result;
		}
	}
	
	print result;
	

/*
	int result = factorialPrint(5);
	
	int factorialPrint(int n){
		
		if(n == 1){
			return 1;
		}
		else{
			int result = n * factorialPrint(n-1);
			return result;
			
		}
	
	
	}
	
	println(result);
	
*/	
/*
		printNumbers(6);
		void printNumbers(int n) {
		if (n <= 0) {
		return;
		}
		println(n);
		printNumbers(n-2);
		printNumbers(n-3);
		println(n);
		}		
*/

/*			
	int result = mcCarthy91(95);
	int mcCarthy91(int n) {
		if (n > 100) {
			return n - 10;
		} 
		else {
			return mcCarthy91(mcCarthy91(n+11));
			
		}
	}
	
	println(result);

*/

		
/*
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
*/