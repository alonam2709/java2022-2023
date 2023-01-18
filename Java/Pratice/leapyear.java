public class leapyear {
	
	public static void main (String[] args) {
		int year = IBIO.inputInt(" Enter a year ");
		if( year % 4 == 0)
			System.out.println( year + " is a leap year");
		else
		{
			System.out.println( year + " is not a leap year");
		}
	}
}

