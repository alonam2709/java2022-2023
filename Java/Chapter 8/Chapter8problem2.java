public class Chapter8problem2 {
	
	public static void main(String args[]) 
	{
		for (int i = 1; i < 200; i++)
		{	for (int j = 1; j < 200; j++)
			{	
				for (int k = 1; k < 200; k++)
				{	
					for (int o = 1; o < 200; o++)
					{
						if ( good(i,j) && good(j,k) && good(i,k) && good(i,o) && good(j,o) && good(k,o))
						System.out.println( i + " " + j + " " + k + " "+ o );
					}
				}
			}
		}
	}
	static boolean good(int a, int b)
	{	int x = a * b + 1;
		int y = (int) (Math.sqrt(x)+.5);
		return ( y * y == x );
	}
}

