public class whileloop {
	
	public static void main (String[] args) {
		int number1;
		int number2;
		int sum;
		int choice;
		do {
			number1 = IBIO.inputInt("Give me the first number ");
			number2 = IBIO.inputInt("Give me the second nuber ");
			sum = number1+ number2;
			IBIO.output(" " + sum);
			choice = IBIO.inputInt("Input 1 if you want to perform the operation again or Input 2 if you want to exist the loop ");
		}while(choice == 1);
		
	}
}

