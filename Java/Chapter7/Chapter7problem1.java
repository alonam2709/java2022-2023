public class Chapter7problem1 {
	
	public static void main (String[] args) {
		double xx = 1;
		for (int i = 0; i < 10; i++)
		{	xx = xx * 3.732;
			xx = xx * 100;
			xx = (int)xx /100.0; // Always add the .0 due to the primitive type
			System.out.println(xx); 	
		}
	}
}

