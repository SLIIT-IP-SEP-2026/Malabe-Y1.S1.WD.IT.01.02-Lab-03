import java.util.Scanner;
public class IT26102492Lab3Q2{
        public static void main(String[]args) {
		
		double ot_hours;
		double ot_hourly_rate;
		double monthly_salary;
		double total_salary;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the monthly salary:");
		monthly_salary = input.nextDouble();
		
		System.out.println("Enter the no of OT hours:");
		ot_hours = input.nextDouble();
		
	    System.out.println("Enter the OT hourly rate:");
		ot_hourly_rate = input.nextDouble();
		
		total_salary = monthly_salary + (ot_hours*ot_hourly_rate);
		
		System.out.println("The total salary including OT is = " +total_salary);
		
		}
}