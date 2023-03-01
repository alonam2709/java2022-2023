public class lpp {
	
	public static void main (String[] args) {
		int largest = 0;
		for(int i = 100; i <= 999; i++)
		{
			for(int j = 100; j <= 999; j++)
			{	int product = i * j;
				int sum = product;
				int reverse = 0;
				while( sum != 0)   
				{  
					int remainder = sum % 10;  
					reverse = reverse * 10 + remainder;  
					sum = sum/10;  
				}
				if(product == reverse)
					{	int palidrone = product;
						if(palidrone > largest)
						{
							largest = palidrone;
						}
						
					}
				
				
			}
		}
		System.out.println(largest);
		
		
		
	}
}

