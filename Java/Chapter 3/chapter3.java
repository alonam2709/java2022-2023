
public class chapter3 {
	
	public static void main (String[] args) {
		int x;
		do
		{ x = IBIO.inputInt("Enter a new number " );
		} while( x % 2 != 0 || x <= 0 || x >= 100);
		IBIO.output("thank you"); // 3.1 
		
		int i = 1;
		x = IBIO.inputInt(" New number please " );
		
		do
		{ i++;
		} while( x <= 1 || x % i != 0);
			if( x == i)
				IBIO.output("prime"); 
			else 
				IBIO.output(i); // 3.2 
		int sum = 0;
		int n = IBIO.inputInt(" enter a number "); //3.2
		
		do 
		{ int digit = n % 10;
			sum = sum + (digit * digit * digit);
			n = n / 10;
			} while( n != 0);
			IBIO.output("the sum of the digits is " + sum); // 3.3
		int step = 0;
		int j = IBIO.inputInt("give me number ");
		do
		{	if( j % 2 == 0){
				j /= 2;
				step++;
			}
			else {
				j = (3 * j) + 1;
				step++;} 
		} while( j != 1 );
		IBIO.output(step); // 3.4
		
	}
}

