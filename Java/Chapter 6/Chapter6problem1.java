public class Chapter6problem1 {
	
	public static void main (String[] args) {
		int num = IBIO.inputInt(" enter number of lines ");
		String aa = stars(num);
		
		for(int i = 0; i < num; i++)
			IBIO.output(aa);
	}
	
	public static String stars(int n)
	{
		String space = "          ";
		for (int i = 0; i < n; i++)
			space = space + "*";
			return space ;
	} 
}

