package classesandobject;

public class Arithmetic {
	
	double a, b, sum, sub, mult, div, mod;
	
	public Arithmetic()
	{
		a = 5;
		b = 3;
	}
	
	public void add()
	{
		sum = a + b;
		System.out.println("Addition = "+sum);
	}

	public void subtract()
	{
		sub = a - b;
		System.out.println("Subtraction = "+sub);
	}
	
	public void multiply()
	{
		mult = a * b;
		System.out.println("Multiplication = "+mult);
	}
	
	public void divide()
	{
		div = a / b;
		System.out.println("Division = "+div);
	}
	
	public void modulus()
	{
		mod = a % b;
		System.out.println("Remainder = "+mod);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arithmetic x = new Arithmetic();
		x.add();
		x.subtract();
		x.multiply();
		x.divide();
		x.modulus();

	}

}
