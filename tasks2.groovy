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
		
		print("Result: "+summ);
	
	break;
	
	default:
	
		println "This task is not completed or not on the list" 
		
    break
	}
