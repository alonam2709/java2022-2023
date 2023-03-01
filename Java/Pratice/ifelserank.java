public class ifelserank {
	
	public static void main (String[] args) {
		int n = IBIO.inputInt("Enter a integer between 1 and 100 ");
		if( n % 2 != 0)
			System.out.println("Weird");
		else if( n <= 5 && n >= 2 )
			System.out.println("Not Weird");
		else if( n <= 20 && n >= 6 )
			System.out.println("Weird");
		else if( n >= 20 )
			System.out.println("Not Weird");

	}
}

