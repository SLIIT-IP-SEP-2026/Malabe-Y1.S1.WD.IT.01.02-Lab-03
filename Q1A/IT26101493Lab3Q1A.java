import java.util.Scanner;

public class IT26101493Lab3Q1A{
	public static void main (String[]args){
		double price,unit,amount;
		
		Scanner rice = new Scanner (System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		price = rice.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		unit = rice.nextDouble();
		
		amount = price*unit;
		System.out.print("The total amount is: "+ amount);
		
		
	}
}