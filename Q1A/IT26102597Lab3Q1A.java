 import java.util.Scanner;

public class IT26102597Lab3Q1A{
   public static void main (String [] args) {
   
   // Declare the variables
   double pricePerKg, quantity, totalAmount;
   
   //create scanner object
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter the price of 1 kg of rice");
   double PricePerKg = input.nextDouble();
   
   System.out.println("Enter the number of kilograms you want to buy");
   double Quantity = input.nextDouble();
   
   // Calculate the total amount 
   totalAmount = PricePerKg * Quantity;


   // Display the total amount
   System.out.println("The total amount is: " + totalAmount);

   
   }
}