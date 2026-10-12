import java.util.Scanner;

public class IT26102686Lab3Q1B
{
	public static void main(String[] args)
	{
	
		Scanner input = new Scanner(System.in);
		
		double pricePerKg;
		double kilograms;
		double total;
		double discount;
		double amountToPay;
		
		System.out.print("Enter price of 1kg of rice: ");
        pricePerKg = input.nextDouble();
		
		System.out.print("Enter number of kilograms you want to buy: ");
        kilograms = input.nextDouble();
		
		total = pricePerKg * kilograms;
		discount = total*10/100;
		amountToPay = total - discount;
		
		System.out.println("Toyal amount with 10% discount = Rs." +amountToPay );
		 
	}
}	