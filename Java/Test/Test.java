public class Test
{
	public static void main(String[] args)
	{
		System.out.println("Alon Amit ");
		int numbers;
		do
			{
				numbers = IBIO.inputInt("How many numbers to process ? ");
				if(numbers < 3)
				{
					System.out.println("Input Error");
				}
			} while( numbers <= 2 );
		int largest = IBIO.inputInt("Enter number: ");
		int countodd = 0;
		int counteven = 0;
		if(largest % 2 == 0)
		{
			counteven++;
		}
		if(largest % 2 != 0) 
		{
			countodd++;
		}
		int smallest = largest;
		double sum = largest;
		int count = 1;
		int num;
		do
		{	num = IBIO.inputInt("Enter number: ");
			count++;
			if(num % 2 == 0)
			{
				counteven++;
			}
			if(num % 2 != 0)
			{
				countodd++;
			}
			sum = sum + num;
			while( count < numbers)
			{	num = IBIO.inputInt("Enter number: ");
				count++;
				sum = sum + num;
				if(num % 2 == 0)
				{
					counteven++;
				}
				if(num % 2 != 0)
				{
					countodd++;
				}
				if( num > largest)
					largest = num;
				if( num < smallest)
					smallest = num;
			}
		}while(count < numbers);
		System.out.println("Minimum: " + smallest);
		System.out.println("Maximum: " + largest);
		int range = largest - smallest;
		System.out.println("Range: " + range);
		double average = sum /(numbers);
		System.out.println("Average: " + average);
		System.out.println("Evens: " + counteven);
		System.out.println("Odds : " + countodd);
		
		
	}
}
