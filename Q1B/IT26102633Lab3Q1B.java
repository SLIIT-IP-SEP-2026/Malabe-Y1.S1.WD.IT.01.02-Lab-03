import java.util.Scanner;

public class IT26102633Lab3Q1B {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1Kg of rice: ");
		double pricePerKg = input.nextDouble();
		
		System.out.print("Entre the number of Kilograms you want to buy: ");
		double quantity = input.nextDouble();
		
		double totalAmount = pricePerKg * quantity;
		
		double discountAmount = totalAmount * 0.10;
		double finalAmount = totalAmount - discountAmount;
		
		System.out.println("The total amount with 10% discount is; " + finalAmount);
		
	}
	
}
		
	    