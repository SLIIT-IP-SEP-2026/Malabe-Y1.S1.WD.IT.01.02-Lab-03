import java.util.Scanner;

public class IT26102421Lab3Q1B{
	public static void main(String[] args){
	
	int discount = 10/100;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the price of 1kg of rice :");
	double price = sc.nextDouble();
	
	System.out.print("Enter the no of kg :");
	double no_of_kg = sc.nextDouble();
	
	double amount = price*no_of_kg;
	double new_amount = amount - (amount*10/100);
	
	System.out.print("The total amount with 10% is :" + new_amount);
	}
}