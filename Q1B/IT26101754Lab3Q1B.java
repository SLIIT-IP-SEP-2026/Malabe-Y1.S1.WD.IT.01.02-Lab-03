import java.util.Scanner;

public class IT26101754Lab3Q1B {

   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
	   
	   System.out.print("\nEnter the price of a kilo : ");
	   double priceofkilo = input.nextDouble();
	   
	   System.out.print("Enter the number of kilos you want : ");
	   int totalkilos = input.nextInt();
	   
	   // total price of the rice having...
	   double totalprice = priceofkilo * totalkilos;
	   // finding the discounted price
	   double discountprice = totalprice - (totalprice * 10.0/100);
	   
	   System.out.print("\nTotal price of the rice is : Rs." + discountprice + "/=");
	   
	   }
}	   
	   