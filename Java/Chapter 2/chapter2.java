
public class chapter2 {
	
	public static void main (String[] args) {
		int n = IBIO.inputInt("input a number between 50 and 60 ");
		if (n > 60 || n < 50)
			IBIO.output("error"); //2.1
		int num = IBIO.inputInt("Enter a number :  ");
		if( num % 2 == 0) {
			IBIO.output( num + " is even");
		}
		else {
			IBIO.output( num + " is odd"); } //2.2/ 2.3
		
		
		for (int i =1; i <= 10 ; i++){
			IBIO.output(" " + i*i*i);}// 2.4
		
		for(int c = 1; c <= 100; c++){
			if( c % 2 == 0 && c % 3 == 0) {
				IBIO.output(c);	} //2.5/ 2.6/ 2.7
		}
		int total = 0;
		for(int g = 1; g <= 1000000; g++){
			 if(g % 2 != 0 && g % 3 != 0 && g % 5 != 0 && g % 7 != 0){
				 total++;
			  }
		} IBIO.output(total);
	}
}

