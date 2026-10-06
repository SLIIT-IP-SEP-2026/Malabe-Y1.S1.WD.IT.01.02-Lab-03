import java.util.Scanner;
public class IT26102480Lab3Q1A{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice:");
		double priceOf1Kg= input.nextDouble();
		
		System.out.print("Enter the number of kilogram you want to buy:");
		double kilogramYouWant = input.nextDouble();
		
		double totalAmount= priceOf1Kg*kilogramYouWant;
		System.out.print("The total amount is:"+totalAmount);
		
	
	}

}
