package objex;

public class Customer implements Cloneable{
	
	int id;
	String name;
	String phone;

	public Customer() {
		super();
	}

	public Customer(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	/*
	 * @Override 
	 * public String toString() 
	 * { 
	 * 		return "Customer [id=" + id +", name=" +name + ", phone=" + phone + "］"； ｝
	 */

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		// TODO Auto-generated method stub
		Customer customer1 = new Customer(101, "Ajay", "9876543212");
		Customer customer2 = new Customer(102, "Riya", "9899543212");
		System.out.println(customer1); // customer1.toString()
		System.out.println(customer2);
		Customer customer3 = (Customer)customer2.clone();
		System.out.println(customer3);

	}

}
