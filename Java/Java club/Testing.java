public class Testing
{
	
	public static void main (String[] args) {
		Square s = new Square('S', 5.5);
		System.out.println( "	 name: " + s.name );
		System.out.println( "Square side: " +s.side );
		System.out.println( "Square area: " +s.getArea() );
		System.out.println( "Square perimeter: " +s.getPerimeter() );
		
		Circle s = new Circle('C', 10);
		System.out.println( "	 Circle name: " + c.name );
		System.out.println( "Circle side: " +c.side );
		System.out.println( "Circle area: " +c.getArea() );
		System.out.println( "Circle perimeter: " +c.getPerimeter() );

	},
}

