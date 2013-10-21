String task

print "Please input task number:"
task = System.console().readLine()
num = Integer.parseInt(task)

 
switch(num){

	case 1:

		println("Please type 2 numbers in order to perform calculation");
		print("number 1:");
		int x = Integer.parseInt(System.console().readLine());
		print("number 2:");
		int y = Integer.parseInt(System.console().readLine());
		print("Please type a simbol (-, +, *, /) for the following calculation: ")
		String action = System.console().readLine(); 
		int summ = 0;
		
		if(action == "+"){
			 summ = Calculator.addition(x, y);
		} 
		else if(action == "-"){
			summ = Calculator.subtraction(x, y);	
		}
		else if(action == "*"){
			summ = Calculator.multiplication(x, y);	
		}
		else if(action == "/"){
			summ = Calculator.division(x, y);
		}
		else{println("Incorrect simbol!");}
		
		print("Result: "+summ);
	
	break;
	
	case 2:
	
	UnitMatrix myTest = new UnitMatrix();
	myTest.setSize(5);
	myTest.print();
	
	break;
	
	default:
	
		println "This task is not completed or not on the list" 
		
    break
	
	}
	
	// Clases that are used for task calculation
	
	
	/* Class for case 1 */
	class Calculator {
		
			public static int addition(int x,int y) {
			return x+y;
			}
			
			public static int subtraction(int x,int y) {
			return x-y;
			}
			
			public static int multiplication(int x,int y) {
			return x*y;
			}
			
			public static int division(int x,int y) {
			return x/y;
			}
			
		}
		
	/* class for case 2 */
	class UnitMatrix {
		int size;

		 void setSize(int newSize) {
		 this.size = newSize;
		 }

		void print() {
		
			// |1| When loop starts 
			for (int i = 0; i < size; i++) {
				// |1| i is 1 over here 
				// |2| When loop starts 
				for (int j = 0; j < this.size; j++) {
				// |2| i is 1 over here
					if (i == j) {
						println("1 ");
					} 
					else{
						println("0 ");
					}
				} 
				println "";
			}
			
			
			
		} 
}
