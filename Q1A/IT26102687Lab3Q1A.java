import java.util.Scanner;

public class IT26102687Lab3Q1A {
 
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter the price of 1kg of rice: ");
	  double price = input.nextDouble();
	  
	  System.out.print("Enter the amount of kilograms you want: ");
	  double kg = input.nextDouble();
	  
	  double total = price*kg;
	  System.out.println("The total amount is:" + total);
	 
	  
 } 
} 