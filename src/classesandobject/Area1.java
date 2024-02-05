package classesandobject;
import java.util.Scanner;

public class Area1 {
	
	float area;
	Scanner sc = new Scanner(System.in);
	
	public void circle() //default method without return
	{
		float radius;
		System.out.println("Enter radius :");
		radius = sc.nextFloat();
		area = 3.14f * radius * radius;
		System.out.println("Area of circle = "+area);
	}

	public int square() //default method with return
	{
		int side;
		System.out.println("Enter side : ");
		side = sc.nextInt();
		return side * side;
	}
	
	public void rectangle(int length , int breadth) //parameterized method without return
	{
		System.out.println("Area of rectangle : "+(length * breadth));
	}
	
	public float triangle(float base, float height) //parameterized method with return
	{
		area = (base * height) / 2;
		return area;
	}
	
	public static void add(int a , int b)
	{
		System.out.println("Add : "+(a + b));
	}
	
	public static void main(String[] args)
	{
		Area1 area = new Area1();
		area.circle();
		
		int ar = area.square();
		System.out.println("Area of square : "+ar);
		
		int length, breadth;
		try (Scanner sc = new Scanner(System.in)) {
			length = sc.nextInt();
			breadth = sc.nextInt();
		}
		area.rectangle(length, breadth);
		
		
		float tr = area.triangle(3,5);
		System.out.println("Area of triangle : "+tr);
		
		add(10,11);
		
		
	}
	
}
