
public class question7 {
	
	public static void main (String[] args) {
		int n = IBIO.inputInt("Calculate up to term ");
		int firstTerm = 0;
		int secondTerm = 1;
		for(int i = 1; i <= n; i++){
			if (n <= 20)
				if (i != n)
					IBIO.out(firstTerm + " ; ");
				else
					IBIO.out(firstTerm);
			int nextTerm= firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			}	
		if(n > 20) 
			IBIO.output(firstTerm);
			
					}
}


