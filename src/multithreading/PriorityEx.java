package multithreading;

public class PriorityEx extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityEx t1 = new PriorityEx();
		PriorityEx t2 = new PriorityEx();
		t1.setName("Thread1");
		t2.setName("Thread2");
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();

	}
	
	@Override
	public void run()
	{
		System.out.println("Thread Name: "+getName()+"\nThread Priority: "+getPriority());
	}

}
