public class Renault {
	public static void main (String[] args) {
		int n = 6;
		for(int i = 0; i <= n; i++)
		{
			System.out.println( spaces(n-i) + "***" + spaces(i * 2) +  "***" );
		}
		for(int i = n; i >= 0; i--)
		{
			System.out.println( spaces(n-i) + "***" + spaces(i * 2) +  "***" );
		}
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
	


