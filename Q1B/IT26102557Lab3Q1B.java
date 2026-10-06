import java.util.Scanner;
public class IT26102557Lab3Q1B{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the price of 1kg rice ");
		double kg1price =input.nextDouble();
		
		System.out.println("Enter the number of kilograms you want ");
		double kgcount =input.nextDouble();
		
		double payable=kg1price*kgcount*0.90;
		
		System.out.println("The total amount is "+payable);
	}
}