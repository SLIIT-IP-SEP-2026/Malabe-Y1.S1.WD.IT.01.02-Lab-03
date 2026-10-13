import java.util.Scanner;

public class IT26102574Lab3Q1B{
	public static void main (String[]args){
		Scanner input= new Scanner (System.in);
		
		System.out.print("Enter the price of 1kg rice: ");
		double price = input.nextDouble();
		
		System.out.print("Enter the number of kilograms:");
		double kg = input.nextDouble();
		
		double total= price* kg;
		double discount= total* 0.10;
		double finalamount= total - discount;
		
		System.out.println();
		System.out.println("The total amount:"= finalamount);
		
		input.close();
	
	}


}