import java.util.Scanner;
public class IT26102406Lab3Q1B
	{
	public static void main(String [] args)
		{
		Scanner input = new Scanner (System.in);
		
		System.out.print("\nEnter the price of a kilo : ");
		double priceofkilo = input.nextDouble();
		
		System.out.print("Enter the number of kilos you want : ");
		int totalKilos = input.nextInt();
		
		double totalPrice = priceofkilo * totalKilos;
		double discountPrice = totalPrice - (totalPrice * 10/100);
		
		System.out.print("\nTotal price of the rice is : Rs. " + discountPrice + "/=");
		
		}
}