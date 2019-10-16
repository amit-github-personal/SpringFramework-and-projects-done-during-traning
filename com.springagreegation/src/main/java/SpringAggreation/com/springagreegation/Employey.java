package SpringAggreation.com.springagreegation;

public class Employey {
	
	private int Emp_id;
	private String Name;
	private String desig;
	private Address address;
	
	public Employey(int emp_id, String name, String desig, Address add) {
		super();
		Emp_id = emp_id;
		Name = name;
		this.desig = desig;
		this.address=add;
	}
	
	public void display()
	{
		System.out.println("Emp Id: " +Emp_id);
		System.out.println("Name : " +Name);
		System.out.println(" Designation : " +desig);
		System.out.println(" Address : "+ address);
		
	}
	
	
	
	

}
