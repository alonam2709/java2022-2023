public class evenfibo {
	
	public static void main (String[] args) {
		int term1 = 1;
		int term2 = 2;
		int nextterm = term1 + term2;
		long sum = 0;
		for(int i = 1; term1 <= 4000000; i++ )
		{	if(term1 % 2 == 0)
				sum+=term1;
			term1 = term2;
			term2 = nextterm;
			nextterm = term1 + term2;
			
		}
		System.out.println(sum);
	}
}

