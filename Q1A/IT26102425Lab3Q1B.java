import java.util.Scanner;
public class IT26102425Lab3Q1B{
        public static void main(String[]args) {
		
		double percentage = 10;
		double price;
		double weight;
		double total;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the price of 1kg of rice:");
		price = input.nextDouble();
		
        System.out.println("Enter the no of kilograms you want to buy:");
		weight = input.nextDouble();
		
		total = price*weight*(100-percentage)/100;
		
		System.out.println("Total amount with 10% discount =" + total);
		
		}
	}
		