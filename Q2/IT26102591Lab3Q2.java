import java.util.Scanner;

	public class IT26102591Lab3Q2 {
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			System.out.print("Enter monthly salary : ");
			double salary = input.nextDouble();
			
			System.out.print("Enter OT Hours: ");
			double othours = input.nextDouble();
			
			System.out.print("Enter OT Hourly Rate: ");
			double otRate = input.nextDouble();
			
			double otAmount = othours * otRate;
			double totalSalary = salary = otAmount;
			
			System.out.println("OT Amount: " + otAmount);
			System.out.println("Total Salary =  " + totalSalary);
			
			
		}
	}