public class Tester{

	public static void main(String[] args)
	{
		Employees em = new Employees();
		em.collectData(10);
		System.out.println("your id is "+em.ids);
		System.out.println("Your name is "+em.names);
	}
	
}