public class Chapter9problem3 {
	public static void main (String[] args) {
			int[] num = new int[100];
			for(int i = 0; i < 100; i++)
			{
				num[i] = random();

			}
			for(int i = 1; i < 7; i++)
			{
				for(int j = 0; j < 100; j++)
				{
					if(num[j] == i)
						System.out.print(num[j]);
				}
				System.out.println();
			}
		}
		static int random()
		{
			double xx = Math.random() * 6;
			int yy = (int)(xx + 1);
			return yy;
		}
	}
