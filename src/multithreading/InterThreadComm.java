package multithreading;

class Customer
{
	private int balance = 10000;
	
	synchronized void withdraw(int amount)
	{
		System.out.println("Going to withdraw Rs."+amount);
		
		if(balance < amount)
		{
			System.out.println("Not enough balance in account.\nWaiting for deposit");
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		balance = balance - amount;
		System.out.println("Rs."+amount+"Withdraw.\nBalance: Rs."+balance);
	}
	
	synchronized void deposit(int amount)
	{
		System.out.println("Going to deposit Rs."+amount);
		balance = balance + amount;
		System.out.println("Deposited Rs."+amount+"\nBalance: Rs."+balance);
		notify();
	}
	
}

public class InterThreadComm {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		new Thread("Sneha")
		{
			public void run()
			{
				customer.withdraw(10000); 
			};
		}.start();
		
		new Thread("Swetha")
		{
			public void run()
			{
				customer.withdraw(20000);
			};
		}.start();
		

	}

}
