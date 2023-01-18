public class Chapter9problem2 {
	
	public static void main (String[] args) {
		int[] num = new int[100];
		for(int i = 0; i < 100; i++)
		{
			num[i] = random();

		}
		for(int i = 0; i < 100; i++)
		{
			System.out.println(num[i]);
		}
	}
	static int random()
	{
		double xx = Math.random() * 6;
		int yy = (int)(xx + 1);
		return yy;
	}
}

