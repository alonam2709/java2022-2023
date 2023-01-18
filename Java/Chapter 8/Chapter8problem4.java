public class Chapter8problem4 {
	
	public static void main (String[] args) {
		int a = IBIO.inputInt("Enter a first number ");
		int b = IBIO.inputInt("Enter a second number ");
		System.out.println(gcd(a , b));
	}
	static int gcd(int a, int b)
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
}

