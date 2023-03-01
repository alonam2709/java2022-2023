public class specialpyth {
	
	public static void main (String[] args) {
		findproduct();
	}
	public static void findproduct()
	{
		for(int a = 1; a < 1000; a++)
		{
			for(int b = a + 1; b < 1000; b++)
			{
				int c = 1000 - a -b;
				if( a * a + b * b == c * c )
				{
					System.out.println( "the answer is " + a * b * c);
					System.out.println( "a = " + a + " b = " + b + " c= " + c );
				}
			}
		}
	}
}

