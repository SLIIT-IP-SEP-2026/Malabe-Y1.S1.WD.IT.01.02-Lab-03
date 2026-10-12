import java.util.Scanner;
public class IT24102425Lab3Q1A{
        public static void main(String[]args) {
		
		       double price;
			   double weight;
			   double total;
			   
			   Scanner input = new Scanner (System.in);
			   
			   System.out.print("Enter the price of 1kg of rice:");
			   price = input.nextDouble();
			   
			   System.out.print("Enter the number of kilograms you want to buy:");
			   weight = input.nextDouble();
			   
			   total = weight*price;
			   
			   System.out.print("Total amount is:" + total);
			   
			   
			   
			   }
			   
}