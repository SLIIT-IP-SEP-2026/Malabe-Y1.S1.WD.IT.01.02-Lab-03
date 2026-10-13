import java.util.Scanner;
public class IT26102737Lab3Q1B
{
    public static void main(String[] args)
	{
	    Scanner hello = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice:");
		double price = hello.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy:");
		double kilograms = hello.nextDouble();
		
		double TotalBeforDiscount= price * kilograms;
		
		double discount= TotalBeforDiscount*0.10;
		
		double TotalAfterTheDiscount= TotalBeforDiscount- discount;
		
		System.out.println("The total amount with 10% discount is:" + TotalAfterTheDiscount);
	}	
}		
