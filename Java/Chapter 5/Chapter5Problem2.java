public class Chapter5Problem2 {
	
	public static void main (String[] args) {
		double sum = 0;
		double term = 1;
		for(int i = 1; i <= 100; i++)
		{	double bottom = i * i;
			term = 1 / bottom;
			sum += term;
		}
		IBIO.output(sum);
	}
}
