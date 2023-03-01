public class multitest {
	
	public static void main (String[] args) {
		IBIO.output("Alon Amit");
		int n;
		do
		{	n = IBIO.inputInt(" enter a number between 1 and 9 ");
			if( n > 9 || n < 1)
				n = IBIO.inputInt(" Error number out of range ");
		}while(n > 9 || n < 1);
		int sum = 0;
		if(n == 0)
			System.exit(0);
			
		for(int j = 1; j <= n; j++)
		{
			for(int i = 1; i <= 20; i++)
			{	
				sum = j * i;
				IBIO.out( j + " x ");
				if( i < 10)
					{
						IBIO.out( " " + i + " =");
						if(sum < 10)
						{
							IBIO.out("   " + sum);
							IBIO.output("");
						}
						else
						{
							IBIO.out("  " + sum);
							IBIO.output("");
						}
					}
				else
				{
					IBIO.out(i + " =");
					if(sum < 100 )
					{
						IBIO.out("  " + sum);
						IBIO.output("");
					}
					else
					{
						IBIO.out(" " + sum);
						IBIO.output("");
					}
				}
			}
			IBIO.output("----------------");	
		}
	}
}

