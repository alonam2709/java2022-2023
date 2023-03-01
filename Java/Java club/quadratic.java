import java.util.Scanner;
public class quadratic {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a value of a = ");
		int a = in.nextInt();
		System.out.print("Enter a value of b = ");
		int b = in.nextInt();
		System.out.print("Enter a value of c = ");
		int c = in.nextInt();
		int disc = (b * b - 4 * a * c);
		if(disc > 0 )
		{
			System.out.println("Two solutions");
		}
		else if (disc < 0)
		{
			System.out.println("No real solutions");
		}
		else
		{
			System.out.println("One repeated solutions");
		}
		double pquad = ((-1 * b) + Math.sqrt(disc)) / (2 * a);
		double nquad = ((-1 * b) - Math.sqrt(disc)) / (2 * a);
		System.out.println("The solutions for x are " + pquad + " " + nquad);

	}
}

