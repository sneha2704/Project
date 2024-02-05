package classesandobject;

public class Customer extends Person {
	
	String prodName;
	float quantity, price, billAmount;
	
	public Customer()
	{
		super();
		prodName = "TV";
		quantity = 5;
		price = 5000;
	}
	
	public Customer(int id, String name, MyDate dob, String prodName, float quantity, float price)
	{
		super(id,name,dob);
		this.prodName = prodName;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void calculate()
	{
		billAmount = quantity * price;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Product name : "+prodName);
		System.out.println("Bill Amount : "+billAmount);
	}

}
