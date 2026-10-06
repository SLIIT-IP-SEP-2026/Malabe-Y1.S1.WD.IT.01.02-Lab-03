import java.util.Scanner;
public class IT26102477Lab3Q1B {
  public static void main (String[] args)
    {   
	
	double price, totalDiscount;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the bill: ");
	double bill = input.nextDouble();

     price = bill / 100 * 10;
	 
	 totalDiscount = bill - price;

      System.out.println("totalAmount: " + totalDiscount);	 
	

	}
	
}	