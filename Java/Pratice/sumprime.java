public class sumprime {
	
	public static void main (String[] args) {
		int cap = 2000000;
		long sum = 0;
		for(int i = 2; i <= cap; i++)
		{
			if(isprime(i))
				sum += i;
		}
		System.out.println(sum);
	}
	private static boolean isprime(int n)
	{	if(n == 2)
			return true;
		else if( n % 2 == 0)
			return false;
		for( int i = 3; i * i  <= n; i++)
		{
			if(n % i == 0)
				return false;
		}
		return true;
		
	}
}

