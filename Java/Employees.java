//package employees;
 
public class Employees{
	
	public int[] ids;
	public String[] names;
	private String name;
	private int id;
	
	// Constructs name and id of an employee 
	public Employees(){
		
	}
	
	public void collectData(int req){
	
		int i = 0;
		
		System.out.println("i = "+i+" req = "+req);
		while(i < req){
			this.id 	= Employees.askId();
			this.name	= Employees.askName();
	
			/* tut lomaetsja posmotri
			this.ids[i]   = this.id;
			this.names[i] = this.name;
			*/
			i++;
			
		} 
		
		
	}
	// Asks name of employee	
	public static String askName(){
		System.out.print("Please input your name: ");
		String name = System.console().readLine();
		return name;
	}
	// Asks Id of employee
	public static int askId(){
		System.out.print("Please input your ID: ");
		String str = System.console().readLine();
		int id = Integer.parseInt(str);
		return id;
	}
	
	
}