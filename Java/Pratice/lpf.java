public class lpf {
	public static boolean isPrime(double n)
	{
		for(int i = 2; i < n; i++)
		{	if(n % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main (String[] args) {
		//Scanner input = new Scanner(System.in);
		//System.out.print("Enter a number ");
		double n = 600851475143L;
		//long n = IBIO.inputLong("Enter a number ");
		double largest = 0;
		for(double i = 2; i < n; i++)
		{
			if(n % i == 0 && isPrime(i))
			{
				if(i > largest)
				{
					largest = i;
				}
				System.out.println(largest);
			}
		}
		System.out.println(largest);
		//input.close();
	}
	
}

