import java.util.Scanner;

public class  IT26102061Lab3Q1A{
	public static void main(String[] args){
		//Declare the variables
		double priceOfOne,kilos,pay;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice:");
		priceOfOne=input.nextDouble();
		
		System.out.print("Enter the number of kilograms ypu want to buy:");
		kilos=input.nextDouble();
		
		
		pay=priceOfOne*kilos;
		
		System.out.println("The total amount is :"+pay);
	}
}