public class Circle
{
	// attributes
	char name;
	double radius;
	
	// constructor
	public Circle(char n, double r)
	{
			name = n;
			radius = r;
	}
	
	// methods
	public double getArea()
	{
		double area = radius * radius * Math.PI ;
		return area; 
	}
	public double getPerimeter()
	{
		double perimeter = 2 * Math.PI * radius ;
		return perimeter;
	}
	 
}

