public class question10 {
	
	public static void main (String[] args) {
		int n = IBIO.inputInt("Calculate up to term ");
		int firstTerm = 0;
		int secondTerm = 1;
		double sum = 0;
			
		for(int i = 1; i <= n; i++){
			if(n == 0){
			break;
			}
			if (n <= 20)
					if (i != n)
						IBIO.out(firstTerm + " ; ");
					else
						IBIO.out(firstTerm);
				int nextTerm= firstTerm + secondTerm;
				firstTerm = secondTerm;
				secondTerm = nextTerm;
				sum = sum + firstTerm;
			}	
		if(n > 20) 
			IBIO.output(firstTerm);
		IBIO.output(" Average = " + (sum/n) );
		IBIO.out( firstTerm + " has " + sum);
		int digits = 0; 
		do
		{	digits++;
			firstTerm = firstTerm / 10;
		} while(firstTerm > 0);
		IBIO.output(digits + " digits\n ");
		while(n != 0);
	
			
			}
	}

