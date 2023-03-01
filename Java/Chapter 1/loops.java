
public class chapter1 {
	
	public static void main (String[] args) {
		int start = IBIO.inputInt("get start ");
		int step = IBIO.inputInt("get step ");
		int increment = IBIO.inputInt("get increment ");
		for(int i = 0 ; i < step; start += increment , i++){
			IBIO.output(start);} //1.2
		
		for(int i = 0 ; i < 10; i++){
			IBIO.output(i);
			IBIO.output(i*i);
			IBIO.output(i*i*i);} //1.3
		
		for(int i = 1; i <= 100; i++){
			int triangular = 0;
			
			for(int j = 1; j <= i; j++ ){
				triangular = triangular + j;
			}
			 IBIO.output(i + "=" + triangular);} // 1.4
		int n= 20;
		int i = 0;
		int poweroftwo = 1;
		while(i <= n){
		IBIO.output(i + "=" + "" + poweroftwo);
		poweroftwo = 2 * poweroftwo;
		i = i + 1;}  //1.5 
		
		int S = IBIO.inputInt("Number in fibbonaci Sequence ");
		int firstTerm = 0;
		int secondTerm = 1;
		IBIO.output("Fibonacci sequence until " + S + " terms");
		for(int c = 1; c <= S; c++){
			IBIO.input(firstTerm + ", ");
			int nextTerm= firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;} //1.6
			
			
			
			
			
	}
		

}
