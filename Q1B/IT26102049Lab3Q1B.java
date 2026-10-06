import java.util.Scanner;
public class IT26102049Lab3Q1B {
	public static void main (String[]args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the price of 1kg rice");
	
	double price = input.nextDouble();
	
	System.out.print ("no of kilograms you will buy ");
	double kilograms = input.nextDouble();
	
	double total = price*kilograms ;
	
	double discount = total	* 0.10;
    double finalAmount = total - discount;
	
	System.out.print ("The total amount with 10% discount is: " + finalAmount );
	
	
	
	}
}