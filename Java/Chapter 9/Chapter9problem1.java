public class Chapter9problem1 {
	
	public static void main (String[] args) {
		int sum = 0;
		int n = 0;
		for(int i = 0; i < 100; i++)
		{
			double xx = Math.random() * 6;
			int yy = (int)(xx + 1);
			sum += yy;
			n++;
		}
		double average = sum / n;
		System.out.println(average);
	}
}

