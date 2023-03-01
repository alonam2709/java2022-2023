public class Chapter6problem2 {
	
	public static void main (String[] args) {
		int rows = IBIO.inputInt("How many rows ");
		for(int i = 1; i <= rows; i++ )
		{
			for(int j  = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i = rows-1; i >= 1; i-- )
		{
			for(int j  = 1; j <= i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
}

