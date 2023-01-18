public class Xmas {
	
	public static void main (String[] args) {
		int n = IBIO.inputInt(" Xmas lines ");
		System.out.println("\n\n\n");
		for(int i = 1; i <= n; i++)
		{
			System.out.println( spaces(n-i) + stars(i) + stars(i-1) );
		}
		int centre = (n + (n-1))/2;
		for(int i = 1; i <= n/2; i++)
		{
			System.out.println( spaces(centre) +  "*");
		}
	}

	static String stars(int howMany)
	{
		String g = "";
		for(int i = 0; i < howMany;i++)
		{
			g += "*";
		}
		return g;
	}
	static String spaces(int howMany)
	{
		String output = "";
		for(int i = 0; i < howMany;i++)
		{
			output += " ";
		}
		return output;
	}
	

}
