
import java.math.BigInteger;

public class FactorialDigitSum {
	
	public static void main (String[] args) {
		String fact = factorial(100).toString();
		long sum = 0;
		char[] arr = fact.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i] - '0';
		}
		System.out.println(sum);
	}
	public static BigInteger factorial(int N)
    {
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE
 
        for (int i = 2; i <= N; i++)
        {
            f = f.multiply(BigInteger.valueOf(i));
		}
        return f;
    }
}

