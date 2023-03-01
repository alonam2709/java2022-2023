import java.util.Scanner;

public class Chapter6problem3 {
	public static void main (String[] args) {
		do
		{
			Scanner input =  new Scanner(System.in);
			System.out.print("Enter the number of stars ");
			int num = input.nextInt();
			
			String aa = stars(num);
			for( int i = num; i >= 0; i-- )
			{
				for( int j = 1; j <= i; j++)
					System.out.print(" ");
				System.out.print(aa);
				System.out.println();
			}
			for( int k = 1; k <= num; k++ )
			{
				for(int p = 1; p <= k; p++)
					System.out.print(" ");
				
				System.out.print(aa);
				System.out.println();
			
			}
		}while(true);
	}
	
	public static String stars(int n)
	{
		String space = "";
		for (int i = 0; i < n; i++)
			space = space + "*";
			return space ;
	} 
}

