import java.util.*; // Set, List, HashSet, Collections
import java.lang.Math;
public class Chapter8problem5 {
	
	public static void main (String[] args) {
		Set<List<Integer>>  data = new HashSet<>();
		for(int a = 1; a < 100; a++)
		{
			for(int b = 1; b < a; b++)
			{
				for(int c = 1; c < 100; c++)
				{
					if( (a * a) + (b * b) == (c * c) && gcd(a,b)==1)
					{
						/* List<Integer> triple = Arrays.asList(a,b,c);
						Collections.sort(triple);

						data.add(triple); */
						System.out.println( b + " " + a + " "+ c);
					}
				}
			}
		}

	/*	for (List<Integer> l : data) {
		System.out.println(l);
		}
		*/
	}

	public static int gcd(int a, int b)
	{
		int x = a;
		int y = b;
		do 
		{
		if(x > y)
			x = x - y;
		if(y > x)
			y = y - x;
		}while( x != y);
		return x;
		
	}
	
	public static boolean isSquare(int n) {
		double a = Math.sqrt(n);
		return (int)a == a;
	}
}
