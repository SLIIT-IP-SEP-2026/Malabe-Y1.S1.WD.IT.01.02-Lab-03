import java.util.Scanner;

public class  IT26102061Lab3Q1B{
	public static void main(String[] args){
		//Declare the variables
		double priceOfOne,kilos,pay,totalPay;
		int discount;
		
		discount=10;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice:");
		priceOfOne=input.nextDouble();
		
		System.out.print("Enter the number of kilograms ypu want to buy:");
		kilos=input.nextDouble();
		
		
		pay=priceOfOne*kilos;
		
		totalPay=pay-(pay*discount/100);
		
		System.out.println("The total amount is :"+totalPay);
	}
}