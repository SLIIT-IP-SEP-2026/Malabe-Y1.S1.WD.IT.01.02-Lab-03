import java.util.Scanner;

	public class IT26102591Lab3Q1A {
		
		public static void main(String[] args) {
	
      double priceperKg , quantity ,totalAmount;
	  
	  Scanner input = new Scanner(System.in);

			System.out.print("Enter the price of 1Kg of rice:");
			priceperKg = input.nextDouble();
			
			System.out.print("Enter the kilo amount of rice you want:");
			quantity = input.nextDouble();
			
			totalAmount = priceperKg * quantity;
			
				System.out.println();
				System.out.println("The total amount is: " + totalAmount);
		}
	}

