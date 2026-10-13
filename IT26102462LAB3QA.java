import java.util.Scanner;
public class IT26102462LAB3QA
{
	   public static void main(String[] args)
	   {
		 Scanner input =new Scanner(System.in);  
		   System.out.print("enter the price of 1kg of rice");
		   double priceperkg = input.nextDouble();
		   
		   System.out.print("enter the number of kilograms you want to buy");
		   double quentity = input.nextDouble();
		   
		   double totalAmount=priceperkg *quentity;
		   
		   System.out.print("total amount is"+totalAmount);
		   
		   
	   }
}