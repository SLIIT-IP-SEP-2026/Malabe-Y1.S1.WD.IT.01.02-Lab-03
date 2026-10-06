import java.util.Scanner;
public class IT26102049Lab3Q2 {
	public static void main (String[]args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter Monthly salary :");
	double Monthly_salary = input.nextDouble();
	
	System.out.println("Enter OT hours :");
	double OT_hours = input.nextDouble();
	
	System.out.println("Enter OT hour rate :");
	double OT_hours_rate = input.nextDouble();
	
	double OT_amount = OT_hours * OT_hours_rate;
	
	double total_salary = Monthly_salary + OT_amount;
	
	System.out.print ("your total is : " + total_salary);
	}
}
	