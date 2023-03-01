public class Chapter7problem2 {
	
	public static void main (String[] args) {
		double xx = 1;
		for (int i = 0; i < 10; i++)
		{	xx = xx * 3.732;
			xx = xx * 100;
			xx = (int)xx /100.0;
			String yy = "" + xx; // converts to a string 
			String spaces = "";
			for(int j = 1; j <= (10-yy.indexOf('.')); j++)
			{
				spaces += " ";
			}
			System.out.println(spaces + yy);
		}
	}
}

