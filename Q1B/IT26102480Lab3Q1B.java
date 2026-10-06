import java.util.Scanner;
public class IT26102480Lab3Q1B{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the price of 1kg of rice:");
		double priceOf1Kg= input.nextDouble();

		System.out.print("Enter the number of kilogram you want to buy:");
		double kilogramYouWant = input.nextDouble();

		double totalAmount= priceOf1Kg*kilogramYouWant;
		
		double totalAmountWithDis=totalAmount - (totalAmount*10/100);
		System.out.print("The total amount with 10% discount:"+totalAmountWithDis);


	}

}