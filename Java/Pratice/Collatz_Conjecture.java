public class Collatz_Conjecture {
	
	public static void main (String[] args) {
		for(long x = 2; x <= 1000000; x++)
		{	int c = 0;
			long n = x;
			if(n != 1)
			{	
				if(n % 2 == 0)
				{
					n = n / 2;
					c++;
				}
				if( n % 2 != 0)
				{	n = (3 * n) + 1;
					c++;
				}
			}
			if( n == 1)
			{	System.out.println(x + " " + c);
			}
		}
	}
}

