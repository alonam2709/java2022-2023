public class numbergame {
	
	public static void main (String[] args) {
		int guess;
		System.out.println(Math.random());
		int number = 69;
		int tries = 0;
		IBIO.output("Lets play the number game") ;
		
		do
		{
			guess = IBIO.inputInt("Give me a number: ");
			tries++; 
			if(guess == number)
				IBIO.output("Correct you got it in " + tries + "tries");
			else if( guess < number)
				IBIO.output(" Too low try again");
			else
			{	IBIO.output("Too high try again");
			}
		}while(true);
	}
}
