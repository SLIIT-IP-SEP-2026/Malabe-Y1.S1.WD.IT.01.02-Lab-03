import java.util.Scanner;

	public class IT26102591Lab3Q1B {
		
		public static void main(String[] args) {
	
	  
			Scanner input = new Scanner(System.in);

			System.out.print("Enter the price of 1Kg of rice:");
			double price = input.nextDouble();
			
			System.out.print("Enter the kilo amount of rice you want:");
			double kg = input.nextDouble();
			
			double amount = price * kg;
			double discount = amount * 10/100;
			double finalAmount = amount - discount;
			
			System.out.println("The amount to pay is: " + finalAmount);
			
				
	    }
}














		
		