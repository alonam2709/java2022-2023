public class question5 {
	
	public static void main (String[] args) {
		int n = IBIO.inputInt("Calculate up to term ");
		int firstTerm = 0;
		int secondTerm = 1;
		for(int i = 1; i <= n; i++){
			IBIO.out(firstTerm + " ");
			int nextTerm= firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;}
	}
}
