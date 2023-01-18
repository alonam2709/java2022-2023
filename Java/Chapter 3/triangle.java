public class triangle {
	
	public static void main (String[] args) {
		{
		IBIO.output("alon amit");
		int amount ;
		do
		{
			amount = IBIO.inputInt("How many terms? ");
			while(amount < 0)
			{
				IBIO.output("Enter a positive number");
				amount = IBIO.inputInt("Terms ? ");
			}
			if(amount != 0)
			{
				int term = 0;
				double average = 0;
				for(int i = 1; i <= amount; i++)
				{
					term = term + i;
					average = average + term;
					if(amount <= 20)
					{	IBIO.out(term);
						
						if(i < amount)
						{	IBIO.out(", ");
						}
					}
				}
				if(amount > 20)
				{	IBIO.output(term);
				} else {
					IBIO.output("");
				}
				average = average / amount;
				IBIO.output( "Average = " + average );
				int n = term;
				int c = 0;
				do
				{	n = n / 10;
					c = c + 1;
				} while( n > 0 );
				IBIO.output(term + " has " + c + " digits");
				IBIO.output("");
			}
		} while(amount != 0);
	}
  }
}
