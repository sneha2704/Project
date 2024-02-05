package classesandobject;

public class Student1 extends Person{
	
	float maths, sci, soc, total, percent;
	
	public Student1()
	{
		super();
		maths = 100;
		sci = 99;
		soc = 98;
	}
	
	public Student1(int id, String name, MyDate dob, float maths, float sci, float soc)
	{
		super(id, name, dob);
		this.maths = maths;
		this.sci = sci;
		this.soc = soc;
	}
	
	public void calculate()
	{
		total = maths + sci + soc;
		percent = total / 3;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Percent : "+percent);
	}

}
