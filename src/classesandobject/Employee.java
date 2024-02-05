package classesandobject;

public class Employee extends Person {
	
	float workingDays, perDay, salary;
	
	public Employee()
	{
		super();
		workingDays = 20;
		perDay = 2200;
	}
	
	public Employee(int id, String name, MyDate dob, float workingDays, float perDay)
	{
		super(id,name,dob);
		this.workingDays = workingDays;
		this.perDay = perDay;
	}
	
	public void calculate()
	{
		salary = workingDays * perDay;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Salary : "+salary );
	}

}
