import java.util.Scanner;

public class IT26102533Lab3Q1A {
	
	public static void main (String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg rice : ");
		double price1kg = scanner.nextDouble();
		
		System.out.print("Enter the number of kg : ");
		double quantity = scanner.nextDouble();
		
		double tot_amount = price1kg * quantity;
		
		System.out.println("Total amount : " +tot_amount);
		
	}
	
}
