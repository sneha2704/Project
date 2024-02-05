package classesandobject;

public class MyDate {
	
	int dd, mm, yy;
	
	public MyDate()
	{
		dd = 27;
		mm = 04;
		yy = 1999;
	}
	
	public MyDate(int dd, int mm, int yy)
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public void display()
	{
		System.out.println("Date : "+dd+"-"+mm+"-"+yy);
	}
	

}
