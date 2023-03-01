public class Chapter4Problem1 {
	
	public static void main (String[] args) {
		int num1 = IBIO.inputInt("Enter the first number ");
		int num2 = IBIO.inputInt("Enter the second number ");
		IBIO.output("Press: [1] for addition ");
		IBIO.output("       [2] for multiplication ");
		IBIO.output("       [3] for quit ");
		int decision;
		do 
		{
			decision = IBIO.inputInt("Enter the decision wanted ");
			switch(decision)
			{	case 1:
					int sum = num1 + num2;
					IBIO.output("The answer is " + sum );
					break;
				case 2:
					int product = num1 * num2;
					IBIO.output("The answer is " + product );
					break;
				case 3: 
					break;
				default:
					IBIO.output("The decision given is neither 1 nor 2 nor 3");
			}
		}while( decision != 1 || decision != 2 || decision != 3  );
			
				
		
		

	}
}

