public class Chapter4Problem2 {
	public static void main (String[] args) {
		int n= 0;
		int sum = 0;
		for(int i = 1; i <= 1000; i++)
		{	n = i;
			int x = n % 3;
			switch(x)
			{	case 0:
					sum += n * -5;
					break;
				case 1:
					sum += n * 7;
					break;
				case 2:
					sum += n *2;
					break;
			}
		}
		IBIO.output(sum);

	}
}

