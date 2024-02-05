package abstraction;

import java.util.Scanner;

abstract class Bank
{
	public abstract float getRateOfInterest();
}

class BOI extends Bank
{
	public float getRateOfInterest()
	{
		return 8.7f;
	}
}

class TJSB extends Bank
{
	public float getRateOfInterest()
	{
		return 6.6f;
	}
}
public class BankAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float principle, years, rateBOI, rateTJSB;
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter Principle Amount: ");
		principle = sc.nextFloat();
		
		System.out.println("Enter No of years: ");
		years = sc.nextFloat();
		
		Bank bBOI = new BOI();
		rateBOI = bBOI.getRateOfInterest();
		
		Bank bTJSB = new TJSB();
		rateTJSB = bTJSB.getRateOfInterest();
		
		float interestBOI = (principle * years * rateBOI);
		
		float interestTJSB = (principle * years * rateTJSB);
		
		System.out.println("Simple Interest for BOI: "+interestBOI);
		
		System.out.println("Simple Interest for TJSB: "+interestTJSB);
		sc.close();
	}

}
