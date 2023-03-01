public class Chapter10problem1 {
	
	public static void main (String[] args) {
		String ss = IBIO.input("enter your name ");
		String cc = "";
		char[] xx = ss.toCharArray();
		for(int i = 0; i < ss.length(); i++)
		{	
			if(i < ss.length()-1)
			{
				cc += xx[i];
			}
			System.out.print(xx[i]);
		}
		System.out.println();
		for(int j = ss.length() - 1; j >= 0 ; j--)
		{
			cc += xx[j];
			System.out.print(xx[j]);
		}
		System.out.println();
		System.out.println(cc);
	}
}

