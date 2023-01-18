public class Chapter4Problem3 {
	
	public static void main (String[] args) {
		mainloop : do 
		{	int num;
			do
			{
				num = IBIO.inputInt("enter a number less than 1000 ");
			} while( num >= 1000);
			
			for(int t = 1; t <= num; t++)
			{
				for(int j = 1; j <= num; j++)
				{
						int sum = j * j + t * t;
						if(sum == num)
						{	
							IBIO.output(t + " " + j ); 
							break mainloop;
						}
						else 
						{	IBIO.output("impossible");
							break mainloop;
						}
				}
			
			}
		
		}while(true);
	}
}

