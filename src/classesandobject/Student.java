package classesandobject;

public class Student {

	int rollNumber; //instance variable: declared inside a class but outside a method or block
	String name;
	float phy,chem,maths,total,percent;
	
	public Student() //default constructor
	{
		rollNumber = 101;
		name = "Sneha";
		phy = 95;
		chem = 85;
		maths = 100;
	}
	
	//Parameterized constructor
	//local variables; declared inside a block/method/constructor 
	public Student(int rNumber, String name, float phy, float chem, float maths)
	{
		rollNumber= rNumber;
		this.name = name;
		this.phy = phy;
		this.chem = chem;
		this.maths = maths;
	}
	
	public void calculate()
	{
		total = phy + chem + maths;
		percent = total/3;
	}
	
	public void display()
	{
		System.out.println("Student Roll Number:"+rollNumber);
		System.out.println("Student Name:"+name);
		System.out.println("Total:"+total);
		System.out.println("Percentage:"+percent);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Execution will start from main()");
		Student student = new Student();
		student.calculate();
		student.display();
		
		Student student1 = new Student(102, "Swetha", 99,89,100);
		student1.calculate();
		student1.display();
	}

}
