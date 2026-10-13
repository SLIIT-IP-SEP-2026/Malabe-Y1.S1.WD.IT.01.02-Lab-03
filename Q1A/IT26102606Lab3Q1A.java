import java.util.Scanner;

public class IT26102606Lab3Q1A{
	
	public static void main (String[] args){
	
	 double priceperkg , quantity , totalAmount;
	
		Scanner input = new Scanner(System.in);
	
		System.out.print("enter the price of the 1kg of rice:");
		priceperkg = input.nextDouble();
	
		System.out.print("Enter the number of kilograms you want to buy: ");
		quantity = input.nextDouble();
	
		totalAmount = priceperkg * quantity;
	
		System.out.println();
		System.out.println("The total amount is:" + totalAmount);
	 
	}
}

