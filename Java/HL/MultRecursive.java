import java.util.Scanner;
public class MultRecursive {
	public static int mult(int a, int b )
	{
		if(a == 1)
			return b;
		else
			return b + mult( a-1, b);
		
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("x = ");
		int x = input.nextInt();
		System.out.print("y = ");
		int y = input.nextInt();
		System.out.println( "\n" + x + " * " + y + " = " + mult(x,y) );
	}
}

