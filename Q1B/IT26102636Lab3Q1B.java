import java.util.Scanner;
    
	public class IT26102636Lab3Q1B
	{
	public static void main ( String[] args ){
		Scanner input = new Scanner ( System.in);
		
		double price, kilogram , total, discount , amountTopay;
		
		System.out.print("Enter the price of 1kg of rice: ");
		price=input.nextDouble();
		
		System.out.println("Enter the number of kilograms: ");
		kilogram = input.nextDouble() ;
		
		total = price * kilogram;
		discount=total*0.10;
		amountTopay = total - discount ;
		
		System.out.println("Total bill: Rs. " + total );
		System.out.println (" Discount : Rs. " + discount);
		System.out.println ("Amount to pay : Rs.  " + amountTopay);
		
	}	
		
	}