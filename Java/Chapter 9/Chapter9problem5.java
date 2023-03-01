public class Chapter9problem5 {
	public final static int size = 1000; 
	public static void main (String[] args) {
		int[] num = new int[size];
		for(int i = 0; i < size; i++)
			{
				num[i] = random() + random();

			}
			for(int i = 2; i < 13; i++)
			{
				System.out.print(i + " ");
				if( i < 10)
					{
						System.out.print(" ");
					}
				for(int j = 0; j < size; j++)
				{
					if(num[j] == i)
						System.out.print("x");
						
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


