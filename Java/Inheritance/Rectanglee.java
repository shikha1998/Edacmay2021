/*
Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square.
*/
class Rect
{
	int length;
	int breadth;
	Rect(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	int rectArea()
	{
		return 2*(length + breadth);
	}
	int rectPeri()
	{
		return length *  breadth;
	}
}
class Square extends Rect
{
	int side;
	Square(int side)
	{
		super(4,4);
		//super.rectArea();
		//System.out.println(super.rectPeri());
		this.side = side;
	}
	int squareArea()
	{
		return side * side;
	}
}
class Rectanglee
{
	public static void main(String[] args)
	{
		//Rect r = new Rect(4, 4);
		
		
		Square s = new Square(4);
		System.out.println("Area of square : "+s.squareArea());
		
		System.out.println("Area of rectangle : "+s.rectArea());
		System.out.println("Perimeter of rectangle : "+s.rectPeri());
	}
}
