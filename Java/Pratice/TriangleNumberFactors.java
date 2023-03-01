public class TriangleNumberFactors {
	
	public static void main (String[] args) {
		int j = 0;
		int NumberDivisons = 0;
		int n = 0;
		while(NumberDivisons < 500)
		{
			j++;
			n = TriangleNumber(j);
			for(int i = 1; i <= Math.sqrt(n); i++)
			{
				if(n % i == 0)
				{
					NumberDivisons += 2;
				}
			}
		}
		System.out.println(n);
	}
	private static int TriangleNumber(int j)
	{
		int sum = 0;
		for(int i = 1; i <= j; i++)
		{
			sum += i ;
		}
		return sum;
	}
	
}

