public class fibonnaci {
	
	public static void main (String[] args) {
		IBIO.output("Darth vader");
		int n;
		do
		{
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
			double sum = nextterm;
			if( n == 0)
				break;
				
			if( n <= 20 )
				{
					IBIO.out( term1 + "; " + term2+ "; " );
				}
			for(int i = 2; i <= n; i++)
			{
				nextterm = term1 + term2;
				term1 = term2;
				term2 = nextterm;
				sum += nextterm;
				if(n <= 20)
				{
					if(i < n)
						IBIO.out(nextterm + "; ");
					else
						IBIO.out(nextterm);
				}
				
			}
			if( n > 20 )
			{
				IBIO.output( "term " + n + ": " + nextterm );
			}
			IBIO.output("");
			IBIO.output("Average = " + (sum/n));
			int digits = 0;
			IBIO.out( nextterm +  " has ");
			do
			{ 	digits++;
				nextterm = nextterm / 10;
			} while ( nextterm > 0);
			IBIO.output(digits + " digits");
			
		}while( n != 0);
	}
}

