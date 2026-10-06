import java.util.Scanner;
public class IT26102395Lab3Q1A{
	public static void main(String[] args){
		
		Scanner ok= new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice:");
		double rice=ok.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy:");
		int no=ok.nextInt();
		
		System.out.println();
		
		Double Total= rice*no;
		
		System.out.println("The total amount is:"+Total);
		
		
		
		
		
	}
}