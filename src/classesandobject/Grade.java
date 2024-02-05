package classesandobject;

public class Grade extends Student1{
	
	String grade;
	
	public Grade()
	{
		super();
	}
	
	public Grade(int id, String name, MyDate dob, float maths, float sci, float soc)
	{
		super(id, name, dob, maths, sci, soc);
	}
	
	public void calculate()
	{
		super.calculate();
		
		if(percent >= 90)
		{
			grade = "A";
		}
		
		else if(percent >= 80 && percent <=89)
		{
			grade = "B";
		}
		
		else if(percent >= 70 && percent <= 79)
		{
			grade = "C";
		}
		
		else if(percent >= 60 && percent <= 69)
		{
			grade = "D";
		}
		
		else if(percent >= 50 && percent <=59)
		{
			grade = "E";
		}
		
		else
		{
			grade = "F";
		}
	}
	
	@Override
	public void display()
	{
		super.display();
		System.out.println("Grade : "+grade);
	}

}