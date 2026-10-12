import java.util.Scanner;

public class IT26102686Lab3Q1A
{
	public static void main(String[] args)
	{
	
		Scanner input = new Scanner(System.in);
		
		double pricePerKg;
		double kilograms;
		double total;
		
		System.out.print("Enter price of 1kg of rice: ");
        pricePerKg = input.nextDouble();
		
		System.out.print("Enter number of kilograms: ");
        kilograms = input.nextDouble();
		
		total = pricePerKg * kilograms;
		
		System.out.println("Amount to pay = Rs." +total);
		 
	}
}	