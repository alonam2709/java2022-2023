import java.util.Scanner; // for later use
public class Fraction {
	private int num;
    private int den;
    private static int gcd(int n, int m)
    {
		do 
		{
		if(n > m)
			n = n - m;
		if(m > n)
			m = m - n;
		}while( n != m);
		return n;
		
	}
    
    private void simply()
    {
		int gcd = gcd(this.num, this.den);
		this.den /= gcd;
		this.num /= gcd;
	}
	
	
	public String toString()
    {
        return num + "/" + den;
    }
    
	public void enter()
	{
		String strFraction = IBIO.input("Enter fraction (a/b format): ");
		strFraction = strFraction.replace("/", " ");
		Scanner parse = new Scanner(strFraction);
		num = parse.nextInt();
		den = parse.nextInt();
	}
	
	public Fraction add(Fraction second)
	{
		/* int sumNum = a.num + b.num;
		int denNum = a.den + b.den; 
		return sumNum , denNum; 	 */	   
		Fraction fraction = new Fraction();
		fraction.num = this.num * second.den + second.num * this. den;;
		fraction.den = this.den * second.den;;
		return fraction;
		
	}
	public double toDecimal()
	{
		return (double) this.num / (double) this.den ;
	}
}

