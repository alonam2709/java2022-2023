public class q3 {
	
	public static void main (String[] args) {
		double price = IBIO.inputDouble("Enter a price: ");
		double quantity = IBIO.inputDouble("Enter a quantity: ");
		double revenue = price * quantity;
		double discount = 0;
		if(revenue > 5000.00)
		{
			discount = revenue * 0.1;
			revenue = revenue - discount;
			System.out.println("The revenue is  " + revenue + " after a discount of " + discount);

		}
		else
		{
			System.out.println("The revenue is " + revenue);
		}
	}
}

