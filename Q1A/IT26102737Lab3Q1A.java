import java.util.Scanner;
public class IT26102737Lab3Q1A
{
    public static void main(String[] args)
	{
	    Scanner hi = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice:");
		double price = hi.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy:");
		double kilograms = hi.nextDouble();
		
		double Total = price * kilograms;
		
		System.out.println("Total is:" + Total);
	}
}