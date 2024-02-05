package classesandobject;

public class Area {
	
	int radius, side, length, width, base, height;
	double CircleArea, SquareArea, RectangleArea, TriangleArea;
	double pi;
	
	public Area()
	{
		radius = 10;
		side = 10;
		length = 10;
		width = 20;
		base = 4;
		height = 2;
		pi = 3.14;
	}

	public void circle()
	{
		CircleArea = pi * radius * radius;
	}
	
	public void square()
	{
		SquareArea = side * side;
	}
	
	public void rectangle()
	{
		RectangleArea = length * width;
	}
	
	public void triangle()
	{
		TriangleArea = (base * height)/2;
	}
	
	public void display()
	{
		System.out.println("Area of circle ="+CircleArea);
		System.out.println("Area of square ="+SquareArea);
		System.out.println("Area of Rectangle ="+RectangleArea);
		System.out.println("Area of Triangle ="+TriangleArea);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area area = new Area();
		area.circle();
		area.square();
		area.rectangle();
		area.triangle();
		area.display();

	}

}
