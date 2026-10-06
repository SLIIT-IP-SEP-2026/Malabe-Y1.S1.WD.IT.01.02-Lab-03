import java.util.Scanner;
 public class IT26102049lab3Q1 {
	public static void main (String[]args){
	Scanner input  = new Scanner (System.in);
	
	System.out.print ("Enter the price of 1kg rice");
	double price = input.nextDouble();
	
	System.out.print ("no of kilograms you will buy ");
	double kilograms = input.nextDouble();
	
	double total = price*kilograms ;
	
	System.out.print ("your total is" + total);}
	}