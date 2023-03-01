public class Chapter8problem1 {
 public static void main(String[] args) {
		//Set<List<Integer>> data = new LinkedHashSet<List<Integer>>();   
    for (int i = 1; i < 100; i++) {
			for (int j = 1; j <= i; j++) {
				for (int k = 1; k <= j; k++) {
					if (good(i,j) && good(j,k) && good(k,i)) {
						System.out.println( i + " " + j + " " + k);
						
					}
				}
			}
		}

		/*
		String s = "123sasdasd";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
		}

		for (char c : s.toCharArray()) { // ['1','2','3',...]
			
		}
		List<Integer> goodNums = Arrays.asList(i,j,k); // [0 1 0], [0 0 1]
						Collections.sort(goodNums); // [0 0 1]
						data.add(goodNums);
			for (List<Integer> l : data) {
			System.out.println(l);
		}

		*/
		
		
  }
  static boolean good(int a, int b)
	{	int x = a * b + 1;
		int y = (int) (Math.sqrt(x)+.5);
		return ( y * y == x );
	}
}
