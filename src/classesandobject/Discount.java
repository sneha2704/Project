package classesandobject;

public class Discount extends Customer {

	float discount, finalBill;
	
	public Discount()
	{
		super();
	}
	public Discount(int id, String name, MyDate dob, String prodName, float quantity, float price)
	{
		super(id, name, dob, prodName, quantity, price);
	}
	
	public void calculate()
	{
		super.calculate();
		
		if(billAmount >= 20000)
		{
			discount = 0.15f;
		}
		
		else if(billAmount >= 15000 && billAmount < 20000)
		{
			discount = 0.1f;
		}
		
		else if(billAmount >= 10000 && billAmount < 15000)
		{
			discount = 0.07f;
		}
		
		else
		{
			discount = 0;
		}
		
		finalBill = billAmount - (billAmount * discount);
	}
	
	public void display()
	{
		super.display();
		System.out.println("Discount percent : "+discount);
		System.out.println("Final Bill : "+finalBill);
	}
	
}


