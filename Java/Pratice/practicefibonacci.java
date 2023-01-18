public class fibonnaci {
	
	public static void main (String[] args) {
		IBIO.output("Darth vader");
		int n;
		do
			{
				n = IBIO.inputInt("Calculate up to term (n)? ");
				if(n < 0)
				{
					IBIO.output("ERROR - Enter a positive number: ");
				}
			} while( n < 0 );
		int term1 = 0;
		int term2 = 1;
		int nextterm = term1 + term2;
		for(int i = 1; i < n; i++)
		{
			nextterm = term1 + term2;
			term1 = term2;
			term2 = term1;
			IBIO.out(nextterm);
		}
	}
}

