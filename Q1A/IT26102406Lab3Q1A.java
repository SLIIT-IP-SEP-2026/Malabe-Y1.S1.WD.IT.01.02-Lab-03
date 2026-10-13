 import java.util.Scanner;
 public class IT26102406Lab3Q1A
 {

	public static void main(String [] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the price of a kilo : ");
		double priceOfkilo = input.nextDouble();

		System.out.println("Enter the number of kilos you want : ");
		int totalkilos = input.nextInt();


		double totalPrice = priceOfkilo * totalkilos;
		System.out.print("Total price of the rice is : " + totalPrice);
	}
}