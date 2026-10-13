import java.util.Scanner;

public class IT26102641Lab3Q1B {
    public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the price of 1Kg of rice:");
		double price = input.nextDouble();
		
		System.out.print(" Enter the number of kilograms you want to buy:");
		double kg = input.nextDouble();
		double total = price*kg;
		
		double fineAmount = total * 0.9;// 10% discount 
		
		System.out.println("/nThe total amount with 10% discount is: " + finalAmount);
	}
}
	
	
		
	
