import java.util.Scanner;

public class IT26102477Lab3Q1A {
    public static void main(String[] args)
	{
		double rice_price, no_of_Kilos, price_to_pay  ;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of rice per kilo: ");
		rice_price = input.nextDouble();
		
        System.out.print("Enter the number of kilos you want to buy: ");
        no_of_Kilos = input.nextDouble();
        
        price_to_pay = rice_price * no_of_Kilos;
        
        	
        System.out.print("Price: " + price_to_pay );
		
		// concatination = your are passing the value
	}
	
	
	
}	