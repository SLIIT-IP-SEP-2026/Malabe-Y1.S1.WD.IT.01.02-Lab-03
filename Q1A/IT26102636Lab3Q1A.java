import java.util.Scanner;

public class IT26102636Lab3Q1A
{
  
   public static void main (String[] args)
   {
	   
	 // Declare the variable
    double pricePerKg , quantity , totalAmount;
    
    //Create a Scanner object to read input
    Scanner input = new Scanner(System.in);

    //Promt the user to enter the price per kilogram of rice
    System.out.print("Enter the price of 1kg of rice: ");
	pricePerKg= input.nextDouble();
	
	//Promt the user to enter the number of kilogram they want to buy
	System.out.print("Enter the number of kilograms you want to buy : ");
	quantity = input.nextDouble();
	
	//Calculate the total amount tto be paid
	totalAmount= pricePerKg * quantity;
	
	//Display the total amount
	System.out.println();
	System.out.println(" The total amount in; " + totalAmount);
	
    	
   }  	
}