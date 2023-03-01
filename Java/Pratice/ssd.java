public class ssd {
	
	public static void main (String[] args) {
		long esum = 0;
		long equalsum = 0;
		for(long i = 1; i <= 100; i++)
		{
			esum += (i*i);
			equalsum += i;
		}
		equalsum = (equalsum)*(equalsum);
		System.out.println(equalsum);
		System.out.println(esum);
		long difference = equalsum - esum;
		System.out.println(difference);
	}
}

