public class highprime {
	
	public static void main (String[] args) {
		System.out.println(nthprime(10001));
	}
	private static boolean isprime(long n)
	{
		if(n < 2)
			return false;
		else if(n == 2)
			return true;
		for(int i = 2; i < n; i++)
		{
			if(n % i == 0)
				return false;
		}
		return true;
	}
	private static long nthprime(long n)
	{
		long prime = 1;
		int numprime = 0;
		while( numprime < n)
		{
			prime++;
			if(isprime(prime))
				numprime++;
		}
		return prime;
	}
}

