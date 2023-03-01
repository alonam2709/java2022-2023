public class Chapter5Problem1 {
	
	public static void main (String[] args) {
		double term = 1;
		double sum = 0;
		for(int i = 1; i <= 100; i++)
		{
			term = term / 5;
			sum += term;
		}
		IBIO.output("The total is " + sum);
	}
}

