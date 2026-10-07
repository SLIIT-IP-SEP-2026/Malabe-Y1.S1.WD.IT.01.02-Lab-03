import java.util.Scanner;

public class IT26102421Lab3Q2{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the monthly salary: ");
	double salary = sc.nextDouble();
	
	System.out.print("Enter the no of OT hours: ");
	double no_of_OT_hours = sc.nextDouble();
	
	System.out.print("Enter the OT hourly rate: ");
	double OT_hourly_rate = sc.nextDouble();
	
	double total_salary = salary + (no_of_OT_hours*OT_hourly_rate);
	
	System.out.print("The total salary is :" + total_salary);
	}
}