public class Chapter5Problem3 {
	
	public static void main (String[] args) {
		double sum = 0;
		double term = 1;
		double sign = 1;
		for(int i = 1; i <= 10000; i++)
		{	double bottom = 2 * i - 1;
			term = 1 / bottom * sign;
			sum += term;
			sign *= -1;
		}
		IBIO.output(4 * sum);
	}
}

