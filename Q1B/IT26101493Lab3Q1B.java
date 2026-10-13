import java.util.Scanner;

public class IT26101493Lab3Q1B{
	public static void main (String[]args){
		double price,unit,discount,amount;
		
		Scanner rice = new Scanner (System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		price = rice.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		unit = rice.nextDouble();
		
		discount = (price*unit)*(10/100);
		amount = (price*unit)-discount;
		
		System.out.print("The total amount with 10% discount: "+ amount);
		
		
	}
}