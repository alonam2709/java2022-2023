public class XmasTree {
	public static void main (String[] args) {
			String aa = stars(8);
			for( int i = 8; i >= 0; i-- )
			{
				for( int j = 1; j <= i; j++)
					System.out.print(" ");
				System.out.print(aa);
			}
			for(int x = 1; x <= 8; x++ )
			{
				for(int y = 1; y <= x; y++)
				{	System.out.print(" ");
				}
				System.out.println();
			}
			for( int k = 1; k <= 8; k++ )
			{
				for(int p = 1; p <= k; p++)
				{	System.out.print(" ");
				}
				
				System.out.print(aa);
			}
			for( int q = 8; q >= 0; q--)
			{
				for(int r = 1; r <= q; r++)
				{
					System.out.print(" ");
				}
				System.out.print(aa);
				System.out.println();
			}
	}
	
	public static String stars(int n)
	{
		String space = "";
		for (int i = 0; i < n; i++)
		{	 space = space + "*";
		}
		return space + "        ";
	} 
}

