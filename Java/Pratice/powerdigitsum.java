import java.math.BigInteger;

public class powerdigitsum {
	
	public static void main (String[] args) {
		String product = BigInteger.valueOf(2).pow(1000).toString();
		long sum = 0;
		char[] arr = product.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i] - '0';
		}
		System.out.println(sum);	
	}
}

