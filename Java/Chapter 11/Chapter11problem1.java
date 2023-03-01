public class Chapter11problem1 {
	public static void main(String[] args)
	{	Fraction a = new Fraction();
		a.enter(); //get the first fraction
		Fraction b = new Fraction();
		b.enter(); //get the second one
		Fraction c = new Fraction();
		c = a.add(b); //add b to a and put result into c
		System.out.println(c);
		double x = a.toDecimal();
		System.out.println(a + " change to decimal = " + x);
	} 
}

