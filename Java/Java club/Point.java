
public class Point
{
	char name;
	double x;
	double y;
	
	// constructor
	public Point(char pointName, double coordX, double coordY)
	{	
		name = pointName;
		x = coordX;
		y = coordY;
	}
	
	public void printPoint()
	{
		System.out.println(name + "(" + x + "," + y + ")" );
	}
	
	public boolean equals(Point p2)
	{
		return this.x == p2.x && this.y == p2.y;

	}
	
	public double distance()
	{
		double d2x = 0- this.x;
		double d2y = 0- this.y;
		return Math.sqrt((d2x * d2x) + (d2y * d2y));
	}
	
	public double distance(Point p2)
	{
		double dx = p2.x- this.x;
		double dy = p2.y- this.y;
		return Math.sqrt((dx * dx) + (dy * dy));
	}
	
	public static void main (String[] args)
	{
		Point p = new Point('P', 5, 7);
		p.printPoint();
		Point q = new Point('Q', 5, 7);
		q.printPoint();
		Point r = new Point('R', 7, 8);
		r.printPoint();
		System.out.println( p.equals(q));
		System.out.println( p.equals(r));
		System.out.println(	p.distance(q));
		System.out.println(	p.distance(r));
		System.out.println(	p.distance());
	}
}

