import java.util.Scanner;

public class IT26102533Lab3Q1B {
	
	public static void main (String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg rice : ");
		double price1kg = scanner.nextDouble();
		
		System.out.print("Enter the number of kg : ");
		double quantity = scanner.nextDouble();
		
		double discount = (price1kg * quantity * 10) / 100;
		double totalAmount = (price1kg * quantity) - discount;
		
		System.out.println("Total amount with discount 10% : " +totalAmount);
		
	}
	
}
