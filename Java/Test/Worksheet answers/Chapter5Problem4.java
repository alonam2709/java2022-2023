public class Chapter5Problem4 {
	public static void main (String[] args) {
		double term = 1;
		double sum = 1;
		for(double i = 1; i < 100; i++)
		{
			term *= i/(2 * i + 1);
			sum += term;
		}
		IBIO.output(2 * sum);
	}
}

