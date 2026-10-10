import java.util.Scanner;

public class IT26102636Lab3Q2{
	public static void main (String [] args ){
		Scanner sc = new Scanner (System.in);
		
		double monthlySalary ,otHours , otRate ;
		double otAmount , totalSalary;
		
		System.out.print("Enter monthly salary : ");
		monthlySalary = sc .nextDouble();
		
		System.out.print("Enter OT hours: ");
		otHours = sc . nextDouble();
		
		System.out.print("Enter OT hourly rate: ");
		otRate = sc. nextDouble();
		
		otAmount=otHours*otRate;
		totalSalary= monthlySalary + otAmount;
		
		System.out.println("OT Amount : Rs. " + otAmount);
		System.out.println("Total salary : Rs. " +totalSalary );
		
		
	}
}