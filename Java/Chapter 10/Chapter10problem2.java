public class Chapter10problem2 {
	
	public static void main (String[] args) {
		String x = IBIO.input("enter a binary number ");
		int value = 0;
		int base = 1;
		for(int i = x.length() - 1; i >= 0; i--)
		{	if(x.charAt(i) != '1' && x.charAt(i) != '0' )
			{	System.out.println("Error- enter a number with only binary digits ");
				System.exit(0);
			}
			if(x.charAt(i) == '1')
				value += base;
			base *= 2;
		}
		System.out.println(value);
	}
}

