import java.util.Scanner;
public class DectoBinRec {
	public static int decToBin(int n)
	{
		if(n == 0) // base case
		{	
			return 0;
		}
		else

			return n % 2 + 10 * (decToBin(n / 2));
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positve integer base 10: ");
		int b10 = input.nextInt();
		System.out.println();
		System.out.print( b10 + " base 10 = ");
		System.out.println(decToBin(b10) +" base 2");
	}
}

